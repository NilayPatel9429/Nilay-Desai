<%-- 
    Document   : showbooks
    Created on : Apr 8, 2019, 11:58:08 AM
    Author     : Vishva Deliwala
--%>

<%@page import="javax.xml.bind.JAXBElement"%>
<%@page import="org.datacontract.schemas._2004._07.librarymanagement.ArrayOfBook"%>
<%@page import="org.datacontract.schemas._2004._07.librarymanagement.Book"%>
<%@page import="org.tempuri.ILibraryService"%>
<%@page import="org.tempuri.LibraryService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-image: url('images/libraryimage.jpeg');">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Books</title>
    <style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;

}
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
.fa-anchor,.fa-coffee {font-size:200px}
</style>    
        
    </head>
    <body>
       <table id="customers">
	<%
		Book[] books= (Book[])request.getAttribute("Books");
		%>
		<hr>
		<th>
				Book ID
			</th>
			<th>
				Book Name
			</th>
			<th>
				Book Author
			</th>
			<th>
				Book Genre
			</th>
			<th>
				Book Number
			</th>
		</hr>
		<%
		for(int i=0;i<books.length;i++)
		{
			%>
			<tr>
			<%
                        JAXBElement<String> book_name = books[i].getBookName();    
			Integer id = books[i].getBookID();
			Integer num = books[i].getBookNumber();
			JAXBElement<String> author = books[i].getBookAuthor();
			JAXBElement<String> genre = books[i].getBookGenre();
			%>
			<td>
				<% out.print(id); %>  
			</td>
			<td>
				<% out.print(book_name); %>  
			</td>
			<td>
				<% out.print(author); %>  
			</td>
			<td>
				<% out.print(genre); %>  
			</td>
			<td>
				<% out.print(num); %>  
			</td>
			</tr>
			<%} %>		

	</table>
    </body>
</html>
