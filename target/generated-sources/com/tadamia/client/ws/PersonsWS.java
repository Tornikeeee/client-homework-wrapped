
package com.tadamia.client.ws;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "PersonsWS", targetNamespace = "http://ws.tadamia.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonsWS {


    /**
     * 
     * @param age
     * @param firstname
     * @param id
     * @param lastname
     * @return
     *     returns com.tadamia.client.ws.Person
     * @throws PersonNotFound_Exception
     */
    @WebMethod(operationName = "UpdatePerson")
    @WebResult(name = "UpdatePersonResult", targetNamespace = "")
    @RequestWrapper(localName = "UpdatePerson", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.UpdatePerson")
    @ResponseWrapper(localName = "UpdatePersonResponse", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.UpdatePersonResponse")
    @Action(input = "http://ws.tadamia.com/PersonsWS/UpdatePersonRequest", output = "http://ws.tadamia.com/PersonsWS/UpdatePersonResponse", fault = {
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://ws.tadamia.com/PersonsWS/UpdatePerson/Fault/PersonNotFound")
    })
    public Person updatePerson(
        @WebParam(name = "Id", targetNamespace = "")
        int id,
        @WebParam(name = "Lastname", targetNamespace = "")
        String lastname,
        @WebParam(name = "Firstname", targetNamespace = "")
        String firstname,
        @WebParam(name = "Age", targetNamespace = "")
        int age)
        throws PersonNotFound_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     * @throws PersonNotFound_Exception
     */
    @WebMethod(operationName = "DeletePerson")
    @WebResult(name = "DeletePersonResult", targetNamespace = "")
    @RequestWrapper(localName = "DeletePerson", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.DeletePerson")
    @ResponseWrapper(localName = "DeletePersonResponse", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.DeletePersonResponse")
    @Action(input = "http://ws.tadamia.com/PersonsWS/DeletePersonRequest", output = "http://ws.tadamia.com/PersonsWS/DeletePersonResponse", fault = {
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://ws.tadamia.com/PersonsWS/DeletePerson/Fault/PersonNotFound")
    })
    public boolean deletePerson(
        @WebParam(name = "Id", targetNamespace = "")
        int id)
        throws PersonNotFound_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.tadamia.client.ws.Person>
     */
    @WebMethod(operationName = "GetAllPersons")
    @WebResult(name = "GetAllPersonsResult", targetNamespace = "")
    @RequestWrapper(localName = "GetAllPersons", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.GetAllPersons")
    @ResponseWrapper(localName = "GetAllPersonsResponse", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.GetAllPersonsResponse")
    @Action(input = "http://ws.tadamia.com/PersonsWS/GetAllPersonsRequest", output = "http://ws.tadamia.com/PersonsWS/GetAllPersonsResponse")
    public List<Person> getAllPersons();

    /**
     * 
     * @param personId
     * @return
     *     returns com.tadamia.client.ws.Person
     * @throws PersonNotFound_Exception
     */
    @WebMethod(operationName = "GetPerson")
    @WebResult(name = "GetPersonResult", targetNamespace = "")
    @RequestWrapper(localName = "GetPerson", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.GetPerson")
    @ResponseWrapper(localName = "GetPersonResponse", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.GetPersonResponse")
    @Action(input = "http://ws.tadamia.com/PersonsWS/GetPersonRequest", output = "http://ws.tadamia.com/PersonsWS/GetPersonResponse", fault = {
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://ws.tadamia.com/PersonsWS/GetPerson/Fault/PersonNotFound")
    })
    public Person getPerson(
        @WebParam(name = "PersonId", targetNamespace = "")
        int personId)
        throws PersonNotFound_Exception
    ;

    /**
     * 
     * @param age
     * @param firstname
     * @param id
     * @param lastname
     * @return
     *     returns com.tadamia.client.ws.Person
     * @throws PersonAlreadyExists_Exception
     */
    @WebMethod(operationName = "AddPerson")
    @WebResult(name = "AddPersonResult", targetNamespace = "")
    @RequestWrapper(localName = "AddPerson", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.AddPerson")
    @ResponseWrapper(localName = "AddPersonResponse", targetNamespace = "http://ws.tadamia.com/", className = "com.tadamia.client.ws.AddPersonResponse")
    @Action(input = "http://ws.tadamia.com/PersonsWS/AddPersonRequest", output = "http://ws.tadamia.com/PersonsWS/AddPersonResponse", fault = {
        @FaultAction(className = PersonAlreadyExists_Exception.class, value = "http://ws.tadamia.com/PersonsWS/AddPerson/Fault/PersonAlreadyExists")
    })
    public Person addPerson(
        @WebParam(name = "Id", targetNamespace = "")
        int id,
        @WebParam(name = "Lastname", targetNamespace = "")
        String lastname,
        @WebParam(name = "Firstname", targetNamespace = "")
        String firstname,
        @WebParam(name = "Age", targetNamespace = "")
        int age)
        throws PersonAlreadyExists_Exception
    ;

}