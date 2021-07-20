<%-- 
    Document   : adminreg
    Created on : Dec 29, 2020, 6:55:57 PM
    Author     : Rahul Barthwal
--%>

<%@page import="com.connection.econn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<% 
if(request.getParameter("submit")!=null)
{

         String email = request.getParameter("aemail");
         String pwd = request.getParameter("apwd1");
            
         Connection con = econn.getConnection();         
         PreparedStatement st = con.prepareStatement(" INSERT INTO `admin`(`ademail`, `adpwd`) VALUES (?,?) ");
         st.setString(1, email);
         st.setString(2, pwd);
         int rs = st.executeUpdate();
    
    %>
    
 <script>
    alert("registered");
    window.location="adminlogin.jsp";
</script>

<%
        
}

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/style.css" type="text/css">

<script>  
function verifyPassword() {  
  var pass1 = document.getElementById("apwd1").value;  
  var pass2 = document.getElementById("apwd2").value;  
  //check empty password field  
  if(pass1 !== pass2) {  
     document.getElementById("message").innerHTML = "**Password does not match please re-enter!";  
     return false;  
  }  
   
 //minimum password length validation  
  if(pass1.length < 8) {  
     document.getElementById("message").innerHTML = "**Password length must be atleast 8 characters";  
     return false;  
  }  
  
//maximum length of password validation  
  if(pass1.length > 15) {  
     document.getElementById("message").innerHTML = "**Password length must not exceed 15 characters";  
     return false;  
  } 
}  
</script>
    </head>
    <body>
    <header>
            <nav class="navbar navbar-dark bg-primary fixed-top">
              <a class="navbar-brand" href="#">
                <img src="images/open-book.png" width="100" height="100" class="d-inline-block align-top" alt="logo">
                
              </a>
                 <h1>Stationary Shop Web application</h1>
            </nav>
        </header> 
    <center>    
        <section style="margin-top:60px; ">
                <h2 style="background-color: whitesmoke">Registration</h2>
                <table>
                    <img src="images/admin.png" width="100" height="100" class="d-inline-block " alt="logo2">
                    <form action="#" method="post" onsubmit ="return verifyPassword()" >
                        <tr><div class="form-group">
                            <td><label for="aemail">Email address:</label></td>
                            <td><input type="email" class="form-control" id="aemail" name="aemail" aria-describedby="emailHelp" placeholder="Enter email" required></td>
                        </div>
                    </tr>
                    <tr>
                        <div class="form-group">
                            <td><label for="apwd1">Password:</label></td>
                            <td><input type="password" class="form-control" id="apwd1" name="apwd1" placeholder="Password" required></td>
                        </div>
                    </tr>
                    <tr>
                        <div class="form-group">
                            <td><label for="apwd2">Confirm Password:</label></td>
                            <td><input type="password" class="form-control" id="apwd2" name="apwd2" placeholder=" Confirm Password" required></td>
                        </div>
                    </tr>
             
                    <td style="text-align: left;" ><button type="reset" class="btn btn-danger">Reset</button></a></td>
                    <td style="text-align: right;" ><button type="submit" id="submit" name="submit" class="btn btn-success">Submit</button></td>
                    </form>
                </table>
                <br><p><span id = "message" style="color:red"> </span></p>
              <a href="adminlogin.jsp" style="font-size: 15px;font-weight: bold;">Back</a>
            </section>
        </center>
    <footer style="margin-top: 90px">
            <h5>Developed by Rahul Barthwal</h5>
        </footer>
    </body>
</html>

