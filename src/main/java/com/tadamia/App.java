package com.tadamia;

import com.tadamia.client.ws.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    private static PersonsWS personsWS;
//    private static PersonsWSBare personsWSBare;

    static {
        try {
            URL url = new URL("http://localhost:8080/person-service/PersonService?wsdl");
////            URL urlBare = new URL("http://localhost:8080/person-service/PersonServiceBare?wsdl");
//
            PersonsWSImplService personsWSImplService = new PersonsWSImplService(url);
//            //PersonsWSBareImplService personsWSBareImplService = new PersonsWSBareImplService(urlBare);
//
            personsWS = personsWSImplService.getPersonsWSImplPort();
//          //  personsWSBare = personsWSBareImplService.getPersonsWSBareImplPort();
        } catch (MalformedURLException e) {
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