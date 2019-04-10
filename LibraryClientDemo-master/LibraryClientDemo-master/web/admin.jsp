<%-- 
    Document   : admin
    Created on : Apr 7, 2019, 3:42:29 AM
    Author     : Vishva Deliwala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-image: url('images/libraryimage.jpeg');">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <style>
            div{
                font-size: 50px;
                background-color:rgba(255, 204, 153,0.5);
                width: 350px;
            }   
            
            p{
                padding:20px;
                position:relative;
                background: rgba(255, 204, 153,0.5);
                width: 500px;
                height:500px;
                font-size: 25px;
            }
            input{
                font-size: 25px;
            }
        </style>
    </head>
    <body>
        <div style="margin-left: 500px">
                ADMIN PAGE
            </div>
         <form action="/AdminServlet" method="post">
            <p style="margin-left: 400px"> 
                Book Id: <input type="textbox" name="bookid" id="bookid"/><br><br>
                Book Name: <input type="textbox" name="bookname"/><br><br>
                Author: <input type="textbox" name="author"/><br><br>
                Genre: <input type="textbox" name="genre"/><br><br>
                Number Of Books:</td><td> <input type="textbox" name="num"/><br><br><br>
            
                Select your Choice:<br><br>
                <input style="background-color:rgb(234,119,15)" type="submit" name="add" value="Add Book"/></a>&nbsp;&nbsp;&nbsp;
                <input style="background-color:rgb(234,119,15)" type="submit" name="update" value="Update Book"/>&nbsp;&nbsp;&nbsp;
                <input style="background-color:rgb(234,119,15)" type="submit" name="delete" value="Delete Book"/>
            </p>
        <!--</form>-->
    </body>
</html>
