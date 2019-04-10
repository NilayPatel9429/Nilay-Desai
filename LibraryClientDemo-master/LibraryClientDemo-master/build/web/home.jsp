<%-- 
    Document   : home
    Created on : Apr 7, 2019, 12:12:25 AM
    Author     : Vishva Deliwala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="background-image: url('images/libraryimage.jpeg');">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
            div{
                font-size: 50px;
                background-color:rgba(255, 204, 153,0.5);
                width: 850px;
            }   
            
            p{
                padding:20px;
                position:relative;
                background: rgba(255, 204, 153,0.5);
                width: 500px;
                height:300px;
                font-size: 25px;
            }
            input{
                font-size: 25px;
            }
        </style>
    </head>
    <body>
            <div style="margin-left: 250px">
                LIBRARY MANAGEMENT SYSTEM
            </div>
            <br>
            <br>
            <form action="AdminServlet" method="post">
            <p style="margin-left: 400px">
                To Add, Update, Delete Books login here:<br><br>
            
                Username:<input type='text' name="uname"/><br><br>
                Password:<input type="password" name='pass'/><br><br>
            <input style="background-color:rgb(234,119,15)" type ="submit" value="Login"/><br><br>
            </p>
            </form>
            <form action="search.jsp">
            <p style="margin-left:400px">           
             To Search Books Click here:<br><br>
            <input style="background-color:rgb(234,119,15)" type="submit" value="Search Books" /><br><br>
            <br>
            </p>
        </form>
    </body>
</html>
