
package com.tadamia.client.ws;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "PersonAlreadyExists", targetNamespace = "http://ws.tadamia.com/")
public class PersonAlreadyExists_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PersonAlreadyExists faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public PersonAlreadyExists_Exception(String message, PersonAlreadyExists faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public PersonAlreadyExists_Exception(String message, PersonAlreadyExists faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.tadamia.client.ws.PersonAlreadyExists
     */
    public PersonAlreadyExists getFaultInfo() {
        return faultInfo;
    }

}
