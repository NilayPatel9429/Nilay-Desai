
package org.datacontract.schemas._2004._07.librarymanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Book complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookAuthor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookGenre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Book", propOrder = {
    "bookAuthor",
    "bookGenre",
    "bookID",
    "bookName",
    "bookNumber"
})
public class Book {

    @XmlElementRef(name = "BookAuthor", namespace = "http://schemas.datacontract.org/2004/07/LibraryManagement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookAuthor;
    @XmlElementRef(name = "BookGenre", namespace = "http://schemas.datacontract.org/2004/07/LibraryManagement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookGenre;
    @XmlElement(name = "BookID")
    protected Integer bookID;
    @XmlElementRef(name = "BookName", namespace = "http://schemas.datacontract.org/2004/07/LibraryManagement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookName;
    @XmlElement(name = "BookNumber")
    protected Integer bookNumber;

    /**
     * Gets the value of the bookAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookAuthor() {
        return bookAuthor;
    }

    /**
     * Sets the value of the bookAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookAuthor(JAXBElement<String> value) {
        this.bookAuthor = value;
    }

    /**
     * Gets the value of the bookGenre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookGenre() {
        return bookGenre;
    }

    /**
     * Sets the value of the bookGenre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookGenre(JAXBElement<String> value) {
        this.bookGenre = value;
    }

    /**
     * Gets the value of the bookID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookID() {
        return bookID;
    }

    /**
     * Sets the value of the bookID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookID(Integer value) {
        this.bookID = value;
    }

    /**
     * Gets the value of the bookName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookName() {
        return bookName;
    }

    /**
     * Sets the value of the bookName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookName(JAXBElement<String> value) {
        this.bookName = value;
    }

    /**
     * Gets the value of the bookNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookNumber() {
        return bookNumber;
    }

    /**
     * Sets the value of the bookNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookNumber(Integer value) {
        this.bookNumber = value;
    }

}
