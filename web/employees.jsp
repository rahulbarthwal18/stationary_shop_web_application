<%-- 
    Document   : employees
    Created on : Dec 25, 2020, 12:55:05 PM
    Author     : Rahul Barthwal
--%>
 <%@page import="com.connection.econn"%>
<%
                if(session.getAttribute("adminemail")==null)
                {
                    response.sendRedirect("adminlogin.jsp");
                }
 %>
           
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
            <script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>
    <body style="background-color: #FDE5B5">
        <br>
        <div class="row">
            
            <div class="col-sm-4">
                
                <div class="container">
                    <form action="Addemployee" method="post">
                       <div class="form-group">
                            <label for="empname">Full name:</label>
                            <input type="text" class="form-control" id="empname" name="empname" placeholder="Enter full name">
                        </div>
                        <div class="form-group">
                            <label for="empemail">Email address:</label>
                            <input type="email" class="form-control" id="empemail" name="empemail" placeholder="Enter email address">
                        </div>
                        <div class="form-group">
                            <label for="empage">Age:</label>
                            <input type="text" class="form-control" id="empage" name="empage" placeholder="Enter age">
                        </div>
                        <div class="form-group">
                            <label for="empjoindate">Join date:</label>
                            <input type="date" class="form-control" id="empjoindate" name="empjoindate">
                        </div>
                        <div class="form-group">
                            <label for="empsalary">Salary:</label>
                            <input type="text" class="form-control" id="empsalary" name="empsalary" placeholder="Enter salary">
                        </div>
                        <div class="form-group">
                            <button type="submit"  class=" btn btn-info">Add</button>
                            <button type="reset"  class=" btn btn-warning">Reset</button>

                        </div>

                    </form>
                </div>
                
            </div>
            
            <div class="col-sm-8">
                <div class="panel-body">
                    
                    <table id="tbl-product" class="table table-bordered" cellpadding="0" cellspacing="0" width="100%">
                        <thead>
                            <tr>
                                <th>Full name</th>
                                <th>Email address</th>
                                <th>age</th>
                                <th>join date</th>
                                <th> salary</th>
                                <th>Update</th>
                                <th>Delete</th>
   
                            </tr>
                        </thead>
                        <tbody>
                       <%
         Connection con = econn.getConnection();         
         Statement st = con.createStatement();
         ResultSet query = st.executeQuery("select * from employees");
         while(query.next())
         {
         out.println("<tr>");
         out.println("<td>"+query.getString(2)+"</td>");
         out.println("<td>"+query.getString(3)+"</td>");
         out.println("<td>"+query.getInt(4)+"</td>");
         out.println("<td>"+query.getInt(5)+"</td>");
         out.println("<td>"+query.getInt(6)+"</td>");
         out.println("<td>" +"<a href='updateemp.jsp?empid=" +query.getInt(1)+"'><button type='submit' class='btn btn-success'>Update</button></a>"+"</td>");
         out.println("<td>" +"<a href='deleteemp?empid=" +query.getInt(1)+"'><button type='submit' class='btn btn-danger'>Delete</button></a>"+"</td>");
         out.println("</tr>");
          }
         
        %>
  </tbody>
  
                    </table>
                    
                </div>
            </div>
            
        </div>
 </body>
</html>
