
package com.tadamia.client.ws;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllPersonsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetAllPersonsResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetAllPersonsResult" type="{http://ws.tadamia.com/}person" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllPersonsResponse", propOrder = {
    "getAllPersonsResult"
})
public class GetAllPersonsResponse {

    @XmlElement(name = "GetAllPersonsResult")
    protected List<Person> getAllPersonsResult;

    /**
     * Gets the value of the getAllPersonsResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the getAllPersonsResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetAllPersonsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     * @return
     *     The value of the getAllPersonsResult property.
     */
    public List<Person> getGetAllPersonsResult() {
        if (getAllPersonsResult == null) {
            getAllPersonsResult = new ArrayList<>();
        }
        return this.getAllPersonsResult;
    }

}
