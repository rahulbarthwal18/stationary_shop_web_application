
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        
    </head>
    <body>
         <header>
            <nav class="navbar navbar-dark bg-primary fixed-top">
              <a class="navbar-brand" href="#">
                <img src="images/open-book.png" width="100" height="100" class="d-inline-block align-top" alt="logo">
              </a>
                <h1>Stationary Shop Web application</h1>
                <a href="products.jsp" target="z" style="font-size:20px;color: white;margin-left: 600px;">Products</a>
                <a href="employees.jsp" target="z" style="font-size:20px;color: white;margin-left: 15px;">Employees</a>
                <a href="calculator.jsp" target="z" style="font-size:20px;color: white;margin-left: 15px;">Calculator</a>
                <a href="admlogout"style="font-size:20px;color: white;margin-left: 15px;">Logout</a>
            </nav>
             
        </header> 
    <center>
        <section>
            <center>
                <h2 style="background-color: yellowgreen">Dashboard</h2>
            </center>
            <%
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                response.setHeader("Pragma", "no-cache");
                response.setHeader("Expires", "0");
                
                if(session.getAttribute("adminemail")==null)
                {
                    response.sendRedirect("adminlogin.jsp");
                }
                %>
                <h4 style="font-weight:bold">Welcome ${adminemail}</h4>   
        </section>
        <div class="wrapper">
            <div class="embed-responsive embed-responsive frame" style="width:1200px;height: 400px;">
                    <iframe src="products.jsp" name="z"></iframe>
                </div>
        </div>
    </center>
    <center>
        <footer>
            <h5 style="font-weight: bold">Developed by Rahul Barthwal</h5>
        </footer>
    </center>
</body>
</html>
