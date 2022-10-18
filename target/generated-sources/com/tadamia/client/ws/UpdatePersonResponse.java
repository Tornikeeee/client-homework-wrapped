
package com.tadamia.client.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePersonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UpdatePersonResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UpdatePersonResult" type="{http://ws.tadamia.com/}person" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePersonResponse", propOrder = {
    "updatePersonResult"
})
public class UpdatePersonResponse {

    @XmlElement(name = "UpdatePersonResult")
    protected Person updatePersonResult;

    /**
     * Gets the value of the updatePersonResult property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getUpdatePersonResult() {
        return updatePersonResult;
    }

    /**
     * Sets the value of the updatePersonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setUpdatePersonResult(Person value) {
        this.updatePersonResult = value;
    }

}
