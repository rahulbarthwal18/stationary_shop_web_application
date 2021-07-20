<%-- 
    Document   : adminlogin
    Created on : Dec 17, 2020, 5:45:58 PM
    Author     : Rahul Barthwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/style.css" type="text/css">

    </head>
    <body>
    <header>
            <nav class="navbar navbar-dark bg-primary fixed-top">
              <a class="navbar-brand" href="#">
                <img src="images/open-book.png" width="100" height="100" class="d-inline-block align-top" alt="logo">
                
              </a>
                 <h1>Stationary Shop Web Application</h1>
            </nav>
        </header> 
    <center>    
        <section style="margin-top:60px; ">
            <h1 style="background-color: whitesmoke">Welcome to Stationary Shop Web Application</h1>
                <h2 style="background-color: whitesmoke">Admin Login</h2>
                <table>
                    <img src="images/admin.png" width="100" height="100" class="d-inline-block " alt="logo2">
                    <form action="admlogin" method="get">
                        <tr><div class="form-group">
                            <td><label for="aemail">Email address:</label></td>
                            <td><input type="email" class="form-control" id="aemail" name="aemail" aria-describedby="emailHelp" placeholder="Enter email" required></td>
                        </div>
                    </tr>
                    <tr>
                        <div class="form-group">
                            <td><label for="apwd">Password:</label></td>
                            <td><input type="password" class="form-control" id="apwd" name="apwd" placeholder="Password" required></td>
                        </div>
                    </tr>
                    
                    <td style="text-align: left;" ><button type="reset" class="btn btn-danger">Reset</button></a></td>
                        <td style="text-align: right;" ><button type="submit" class="btn btn-success">Submit</button></td>
                    </form>
                </table>
              <a href="adminreg.jsp" style="font-size: 15px;font-weight: bold;">New Registration</a>
            </section>
        </center>
    <footer style="margin-top: 90px">
            <h5>Developed by Rahul Barthwal</h5>
        </footer>
    </body>
</html>
