<%-- 
    Document   : updateemp
    Created on : Dec 25, 2020, 12:58:48 PM
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

<% 
if(request.getParameter("submit")!=null)
{
            String empid = request.getParameter("empid");
            String empemail = request.getParameter("empemail");
            String empage = request.getParameter("empage");
            String empjoindate = request.getParameter("empjoindate");
            String empsalary = request.getParameter("empsalary");
            String empname = request.getParameter("empname");
            
         Connection con = econn.getConnection();         
         PreparedStatement st = con.prepareStatement(" UPDATE `employees` SET `empname`=?,`empemail`=?,`empage`=?,`empjoindate`=?,`empsalary`=? WHERE empid=? ");
         st.setString(1, empname);
         st.setString(2, empemail);
         st.setString(3, empage);
         st.setString(4, empjoindate);
         st.setString(5, empsalary);
         st.setString(6, empid);
         
         int rs = st.executeUpdate();
    
    %>
    
 <script>
    alert("updated");
    window.location="employees.jsp";
</script>

<%
        
}

%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add product</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%
         Class.forName("com.mysql.jdbc.Driver");       
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stationary","root","");
         
         String empid = request.getParameter("empid");
         Statement st = con.createStatement();
         ResultSet query = st.executeQuery("select * from employees where empid= '"+empid+"' ");
         while(query.next())
         {
         out.println("<center>");
       out.println("<h1>Update Employee data</h1>");
                out.println("<table>");
                    out.println("<form action='#' method='post'>");
                        out.println("<tr><div class='form-group'>");
                            out.println("<td><label for='empname'>Full name:</label></td>");
                            out.println("<td><input type='text' class='form-control' id='empname' name='empname' value='"+query.getString(2)+"' required></td>");
                        out.println("</div>");
                   out.println("</tr>");
                    out.println("<tr>");
                        out.println("<div class='form-group'>");
                            out.println("<td><label for='empemail'>Email address:</label></td>");
                            out.println("<td><input type='email' class='form-control' id='empemail' name='empemail' value='"+query.getString(3)+"' required></td>");
                        out.println("</div>");
                    out.println("</tr>");
                    out.println("<tr>");
                       out.println("<div class='form-group'>");
                          out.println("  <td><label for='empage'>Age:</label></td>");
                          out.println("  <td><input type='text' class='form-control' id='empage' name='empage' value='"+query.getString(4)+"' required></td>");
                      out.println("  </div");
                   out.println(" </tr>");
                    out.println("<tr>");
                       out.println(" <div class='form-group'>");
                           out.println(" <td><label for='empjoindate'>Join date:</label></td>");
                            out.println("<td><input type='date' class='form-control' id='empjoindate' name='empjoindate' value='"+query.getString(5)+"' required></td>");
                       out.println(" </div>");
                   out.println(" </tr");
                    out.println("<tr");
                       out.println(" <div class='form-group'>");
                           out.println(" <td><label for='empsalary'>Salary:</label></td>");
                           out.println(" <td><input type='text' class='form-control' id='empsalary' name='empsalary' value='"+query.getString(6)+"' required></td>");
                     out.println("   </div>");
                   out.println(" </tr>");
                   out.println(" <td style='text-align: left;' ><a href='employees.jsp'><button type='button' class='btn btn-danger'>Back</button></a></td>");
                      out.println("  <td style='text-align: right;' ><button type='submit' id='submit' name='submit' class='btn btn-success'>Update</button></td>");

                  out.println("  </form>");
                out.println("</table>");
    out.println("</center>");
         
          }
         
        %>
    
    </body>
</html>
