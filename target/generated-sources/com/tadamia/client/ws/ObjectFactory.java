
package com.tadamia.client.ws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tadamia.client.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddPerson_QNAME = new QName("http://ws.tadamia.com/", "AddPerson");
    private final static QName _AddPersonResponse_QNAME = new QName("http://ws.tadamia.com/", "AddPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.tadamia.com/", "DeletePerson");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.tadamia.com/", "DeletePersonResponse");
    private final static QName _GetAllPersons_QNAME = new QName("http://ws.tadamia.com/", "GetAllPersons");
    private final static QName _GetAllPersonsResponse_QNAME = new QName("http://ws.tadamia.com/", "GetAllPersonsResponse");
    private final static QName _GetPerson_QNAME = new QName("http://ws.tadamia.com/", "GetPerson");
    private final static QName _GetPersonResponse_QNAME = new QName("http://ws.tadamia.com/", "GetPersonResponse");
    private final static QName _PersonAlreadyExists_QNAME = new QName("http://ws.tadamia.com/", "PersonAlreadyExists");
    private final static QName _PersonNotFound_QNAME = new QName("http://ws.tadamia.com/", "PersonNotFound");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.tadamia.com/", "UpdatePerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.tadamia.com/", "UpdatePersonResponse");
    private final static QName _Person_QNAME = new QName("http://ws.tadamia.com/", "person");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tadamia.client.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     * @return
     *     the new instance of {@link AddPerson }
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     * @return
     *     the new instance of {@link AddPersonResponse }
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     * @return
     *     the new instance of {@link DeletePerson }
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     * @return
     *     the new instance of {@link DeletePersonResponse }
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetAllPersons }
     * 
     * @return
     *     the new instance of {@link GetAllPersons }
     */
    public GetAllPersons createGetAllPersons() {
        return new GetAllPersons();
    }

    /**
     * Create an instance of {@link GetAllPersonsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllPersonsResponse }
     */
    public GetAllPersonsResponse createGetAllPersonsResponse() {
        return new GetAllPersonsResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     * @return
     *     the new instance of {@link GetPerson }
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonResponse }
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link PersonAlreadyExists }
     * 
     * @return
     *     the new instance of {@link PersonAlreadyExists }
     */
    public PersonAlreadyExists createPersonAlreadyExists() {
        return new PersonAlreadyExists();
    }

    /**
     * Create an instance of {@link PersonNotFound }
     * 
     * @return
     *     the new instance of {@link PersonNotFound }
     */
    public PersonNotFound createPersonNotFound() {
        return new PersonNotFound();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     * @return
     *     the new instance of {@link UpdatePerson }
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePersonResponse }
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     * @return
     *     the new instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "AddPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "AddPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "DeletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "DeletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersons }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllPersons }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "GetAllPersons")
    public JAXBElement<GetAllPersons> createGetAllPersons(GetAllPersons value) {
        return new JAXBElement<>(_GetAllPersons_QNAME, GetAllPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllPersonsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "GetAllPersonsResponse")
    public JAXBElement<GetAllPersonsResponse> createGetAllPersonsResponse(GetAllPersonsResponse value) {
        return new JAXBElement<>(_GetAllPersonsResponse_QNAME, GetAllPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "GetPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "GetPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonAlreadyExists }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonAlreadyExists }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "PersonAlreadyExists")
    public JAXBElement<PersonAlreadyExists> createPersonAlreadyExists(PersonAlreadyExists value) {
        return new JAXBElement<>(_PersonAlreadyExists_QNAME, PersonAlreadyExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNotFound }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonNotFound }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "PersonNotFound")
    public JAXBElement<PersonNotFound> createPersonNotFound(PersonNotFound value) {
        return new JAXBElement<>(_PersonNotFound_QNAME, PersonNotFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "UpdatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "UpdatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<>(_Person_QNAME, Person.class, null, value);
    }

}
