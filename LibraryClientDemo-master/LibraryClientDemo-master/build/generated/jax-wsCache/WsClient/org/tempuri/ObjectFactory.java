
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.librarymanagement.ArrayOfBook;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetBooksByNameName_QNAME = new QName("http://tempuri.org/", "name");
    private final static QName _GetBooksByGenreResponseGetBooksByGenreResult_QNAME = new QName("http://tempuri.org/", "GetBooksByGenreResult");
    private final static QName _UpdateBookAuthor_QNAME = new QName("http://tempuri.org/", "author");
    private final static QName _UpdateBookGenre_QNAME = new QName("http://tempuri.org/", "genre");
    private final static QName _GetBooksResponseGetBooksResult_QNAME = new QName("http://tempuri.org/", "GetBooksResult");
    private final static QName _GetBooksByAuthorResponseGetBooksByAuthorResult_QNAME = new QName("http://tempuri.org/", "GetBooksByAuthorResult");
    private final static QName _GetBooksByNameResponseGetBooksByNameResult_QNAME = new QName("http://tempuri.org/", "GetBooksByNameResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link GetBooks }
     * 
     */
    public GetBooks createGetBooks() {
        return new GetBooks();
    }

    /**
     * Create an instance of {@link GetBooksByAuthor }
     * 
     */
    public GetBooksByAuthor createGetBooksByAuthor() {
        return new GetBooksByAuthor();
    }

    /**
     * Create an instance of {@link GetBooksByGenreResponse }
     * 
     */
    public GetBooksByGenreResponse createGetBooksByGenreResponse() {
        return new GetBooksByGenreResponse();
    }

    /**
     * Create an instance of {@link GetBooksByNameResponse }
     * 
     */
    public GetBooksByNameResponse createGetBooksByNameResponse() {
        return new GetBooksByNameResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link GetBooksResponse }
     * 
     */
    public GetBooksResponse createGetBooksResponse() {
        return new GetBooksResponse();
    }

    /**
     * Create an instance of {@link GetBooksByGenre }
     * 
     */
    public GetBooksByGenre createGetBooksByGenre() {
        return new GetBooksByGenre();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link GetBooksByName }
     * 
     */
    public GetBooksByName createGetBooksByName() {
        return new GetBooksByName();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link GetBooksByAuthorResponse }
     * 
     */
    public GetBooksByAuthorResponse createGetBooksByAuthorResponse() {
        return new GetBooksByAuthorResponse();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = GetBooksByName.class)
    public JAXBElement<String> createGetBooksByNameName(String value) {
        return new JAXBElement<String>(_GetBooksByNameName_QNAME, String.class, GetBooksByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBooksByGenreResult", scope = GetBooksByGenreResponse.class)
    public JAXBElement<ArrayOfBook> createGetBooksByGenreResponseGetBooksByGenreResult(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_GetBooksByGenreResponseGetBooksByGenreResult_QNAME, ArrayOfBook.class, GetBooksByGenreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author", scope = UpdateBook.class)
    public JAXBElement<String> createUpdateBookAuthor(String value) {
        return new JAXBElement<String>(_UpdateBookAuthor_QNAME, String.class, UpdateBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = UpdateBook.class)
    public JAXBElement<String> createUpdateBookName(String value) {
        return new JAXBElement<String>(_GetBooksByNameName_QNAME, String.class, UpdateBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "genre", scope = UpdateBook.class)
    public JAXBElement<String> createUpdateBookGenre(String value) {
        return new JAXBElement<String>(_UpdateBookGenre_QNAME, String.class, UpdateBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBooksResult", scope = GetBooksResponse.class)
    public JAXBElement<ArrayOfBook> createGetBooksResponseGetBooksResult(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_GetBooksResponseGetBooksResult_QNAME, ArrayOfBook.class, GetBooksResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBooksByAuthorResult", scope = GetBooksByAuthorResponse.class)
    public JAXBElement<ArrayOfBook> createGetBooksByAuthorResponseGetBooksByAuthorResult(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_GetBooksByAuthorResponseGetBooksByAuthorResult_QNAME, ArrayOfBook.class, GetBooksByAuthorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author", scope = AddBook.class)
    public JAXBElement<String> createAddBookAuthor(String value) {
        return new JAXBElement<String>(_UpdateBookAuthor_QNAME, String.class, AddBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = AddBook.class)
    public JAXBElement<String> createAddBookName(String value) {
        return new JAXBElement<String>(_GetBooksByNameName_QNAME, String.class, AddBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "genre", scope = AddBook.class)
    public JAXBElement<String> createAddBookGenre(String value) {
        return new JAXBElement<String>(_UpdateBookGenre_QNAME, String.class, AddBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBooksByNameResult", scope = GetBooksByNameResponse.class)
    public JAXBElement<ArrayOfBook> createGetBooksByNameResponseGetBooksByNameResult(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_GetBooksByNameResponseGetBooksByNameResult_QNAME, ArrayOfBook.class, GetBooksByNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author", scope = GetBooksByAuthor.class)
    public JAXBElement<String> createGetBooksByAuthorAuthor(String value) {
        return new JAXBElement<String>(_UpdateBookAuthor_QNAME, String.class, GetBooksByAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "genre", scope = GetBooksByGenre.class)
    public JAXBElement<String> createGetBooksByGenreGenre(String value) {
        return new JAXBElement<String>(_UpdateBookGenre_QNAME, String.class, GetBooksByGenre.class, value);
    }

}
