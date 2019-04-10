
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.librarymanagement.ArrayOfBook;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetBooksByGenreResult" type="{http://schemas.datacontract.org/2004/07/LibraryManagement}ArrayOfBook" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getBooksByGenreResult"
})
@XmlRootElement(name = "GetBooksByGenreResponse")
public class GetBooksByGenreResponse {

    @XmlElementRef(name = "GetBooksByGenreResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBook> getBooksByGenreResult;

    /**
     * Gets the value of the getBooksByGenreResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBook> getGetBooksByGenreResult() {
        return getBooksByGenreResult;
    }

    /**
     * Sets the value of the getBooksByGenreResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}
     *     
     */
    public void setGetBooksByGenreResult(JAXBElement<ArrayOfBook> value) {
        this.getBooksByGenreResult = value;
    }

}
