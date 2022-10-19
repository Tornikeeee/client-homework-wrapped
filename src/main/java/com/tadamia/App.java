package com.tadamia;

import com.sun.xml.ws.client.BindingProviderProperties;
import com.tadamia.client.ws.*;
import jakarta.xml.ws.Binding;
import jakarta.xml.ws.BindingProvider;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    private static PersonsWS personsWS;
private static Properties props;

    static {
        try {
            props = Config.loadFile();
            String url = props.getProperty("url", null);
            int timeOut = Integer.parseInt(props.getProperty("timeout",null));

//            URL url = new URL("https://localhost:8443/person-service/PersonService?wsdl");

            PersonsWSImplService personsWSImplService = new PersonsWSImplService();
            personsWS = personsWSImplService.getPersonsWSImplPort();
            BindingProvider bindingProvider = (BindingProvider) personsWS;

            //8443 პორტზე შემექმნა პრობლემა, ვერ გავხსენი ეგ პორტი
            bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);//"http://localhost:8080/person-service/PersonService");

            bindingProvider.getRequestContext().put(BindingProviderProperties.REQUEST_TIMEOUT, timeOut);//10_000);
            bindingProvider.getRequestContext().put(BindingProviderProperties.CONNECT_TIMEOUT, timeOut);//10_000);


            SSLContext sslContext = getInsecureSSLContext();
            bindingProvider.getRequestContext().put(BindingProviderProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());
            HostnameVerifier hostnameVerifier = getHostnameVerifier();
            bindingProvider.getRequestContext().put(BindingProviderProperties.HOSTNAME_VERIFIER, hostnameVerifier);


            Binding binding = bindingProvider.getBinding();
            var handlerList = binding.getHandlerChain();
            if (handlerList == null) {
                handlerList = new ArrayList<>();
            }
            handlerList.add(new SoapHandler());
            binding.setHandlerChain(handlerList);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws PersonNotFound_Exception, PersonAlreadyExists_Exception {
        personsWS_AddPerson();
        personsWS_GetPerson();
        personsWS_GetPersons();
        personsWS_UpdatePerson();
        personsWS_DeletePerson();
    }

    public static void personsWS_AddPerson() throws PersonAlreadyExists_Exception {
        int numberOfPersonsOld = personsWS.getAllPersons().size();
        System.out.println("old number of persons " + numberOfPersonsOld);
        personsWS.addPerson(77, "mamuka", "khazaradze", 55);
        int numberOfPersonsNew = personsWS.getAllPersons().size();
        System.out.println("old number of persons " + numberOfPersonsNew);
    }

    public static void personsWS_GetPerson() throws PersonNotFound_Exception {
        Person person = personsWS.getPerson(77);
        System.out.println("person with id 77 " + personToString(person));
    }

    public static void personsWS_GetPersons() throws PersonNotFound_Exception {
        List<Person> persons = personsWS.getAllPersons();
        System.out.println("get all persons");
        for (Person person: persons) {
            System.out.println(personToString(person));
        }
    }

    public static void personsWS_UpdatePerson() throws PersonNotFound_Exception {
        Person person = personsWS.getPerson(77);
        System.out.println("old version " + personToString(person));

        person = personsWS.updatePerson(77, "mamuka", "khazaradze", 50);
        System.out.println("new version " + personToString(person));
    }

    public static void personsWS_DeletePerson() throws PersonNotFound_Exception {
        int numberOfPersonsOld = personsWS.getAllPersons().size();
        System.out.println("old number of persons " + numberOfPersonsOld);
        personsWS.deletePerson(77);
        int numberOfPersonsNew = personsWS.getAllPersons().size();
        System.out.println("old number of persons " + numberOfPersonsNew);
    }

    public static String personToString(Person person) {
        return "Person: [id:" + person.getId() + " lastname:" + person.getLastname() + " firstname:" + person.getFirstname() + " age:" + person.getAge() + "]";
    }

    private static SSLContext getInsecureSSLContext() {
        TrustManager[] trustStore = new TrustManager[] { new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }
        } };

        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustStore, new SecureRandom());
            return sc;
        } catch (KeyManagementException | NoSuchAlgorithmException ex) {
            return null;
        }
    }

    private static HostnameVerifier getHostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession sslSession) {
                return true;
            }
        };
    }
}
/*
პირველ დავალებაში გაკეთებულ ორივე ვებ სერვისს დაუწერეთ კლიენტები,
რომლებიც გატესტავენ ამ ვებ სერვისებს სხვადასხვა მეთოდებით.
კლიენტის ორივე აპლიკაციას უნდა ჰქონდეს client.propeties კონფიგურაციის ფაილი, სადაც გაწერილი იქნება:
url = ვებ სერვისის მისამართი. აქ გაწერეთ https-იანი SSL პორტის URL და კლიენტი არ უნდა გავიდეს SSL-ის შეცდომაზე.
timeout = ვებ სერვისის ტაიმაუტი წამებში (როგორც request, ისე read ტამაუტმა ეს მნიშვნელობა აიღოს).
მხოლოდ BARE ვებ სერვისის კლიენტს ასევე ჰქონდეს username/password property-ებიც.
კლიეტნებს ასევე უნდა ჰქონდეთ როგორც გაგზავნილი, ისე მიღებული SOAP Request-Response-ების ლოგირება.
*/