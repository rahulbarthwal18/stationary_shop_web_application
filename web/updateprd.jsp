<%-- 
    Document   : updateprd
    Created on : Dec 23, 2020, 7:09:52 PM
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
            String pdid = request.getParameter("pdid");
            String pdname = request.getParameter("pdname");
            String pdcategory = request.getParameter("pdcategory");
            String pdprice = request.getParameter("pdprice");
            String pdquantity = request.getParameter("pdquantity");
            String pdtotalprice = request.getParameter("pdtotalprice");
            
         Connection con = econn.getConnection();         
         PreparedStatement st = con.prepareStatement(" UPDATE `products` SET `pdname`=?,`pdcategory`=?,`pdprice`=?,`pdquantity`=?,`pdtotalprice`=? WHERE pdid=? ");
         st.setString(1, pdname);
         st.setString(2, pdcategory);
         st.setString(3, pdprice);
         st.setString(4, pdquantity);
         st.setString(5, pdtotalprice);
         st.setString(6, pdid);
         
         int rs = st.executeUpdate();
   

%>

<script>
    alert("updated");
    window.location="products.jsp";
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
         
         String pdid = request.getParameter("pdid");
         Statement st = con.createStatement();
         ResultSet query = st.executeQuery("select * from products where pdid= '"+pdid+"' ");
         while(query.next())
         {
         out.println("<center>");
       out.println("<h1>Update product</h1>");
                out.println("<table>");
                    out.println("<form action='#' method='post'>");
                        out.println("<tr><div class='form-group'>");
                            out.println("<td><label for='pdname'>Product name:</label></td>");
                            out.println("<td><input type='text' class='form-control' id='pdname' name='pdname' value='"+query.getString(2)+"' required></td>");
                        out.println("</div>");
                   out.println("</tr>");
                    out.println("<tr>");
                        out.println("<div class='form-group'>");
                            out.println("<td><label for='pdcategory'>Product category:</label></td>");
                            out.println("<td><input type='text' class='form-control' id='pdcategory' name='pdcategory' value='"+query.getString(3)+"' required></td>");
                        out.println("</div>");
                    out.println("</tr>");
                    out.println("<tr>");
                       out.println("<div class='form-group'>");
                          out.println("  <td><label for='pdpric'>Product price:</label></td>");
                          out.println("  <td><input type='text' class='form-control' id='pdprice' name='pdprice' value='"+query.getString(4)+"' required></td>");
                      out.println("  </div");
                   out.println(" </tr>");
                    out.println("<tr>");
                       out.println(" <div class='form-group'>");
                           out.println(" <td><label for='pdquantity'>Product quantity</label></td>");
                            out.println("<td><input type='text' class='form-control' id='pdquantity' name='pdquantity' value='"+query.getString(5)+"' required></td>");
                       out.println(" </div>");
                   out.println(" </tr");
                    out.println("<tr");
                       out.println(" <div class='form-group'>");
                           out.println(" <td><label for='pdtotalprice'>Total price:</label></td>");
                           out.println(" <td><input type='text' class='form-control' id='pdtotalprice' name='pdtotalprice' value='"+query.getString(6)+"'></td>");
                     out.println("   </div>");
                   out.println(" </tr>");
                   out.println(" <td style='text-align: left;' ><a href='products.jsp'><button type='button' class='btn btn-danger'>Back</button></a></td>");
                      out.println("  <td style='text-align: right;' ><button type='submit'  id='submit' name='submit' class='btn btn-success'>Update</button></td>");

                  out.println("  </form>");
                out.println("</table>");
    out.println("</center>");
         
          }
         
        %>
    
    </body>
</html>
