<%-- 
    Document   : products
    Created on : Dec 22, 2020, 4:46:28 PM
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
            
            <script>
               $(document).ready(function(){
                   
                   $("#pdprice,#pdquantity").keyup(function(){
                       var total =0;
                       var x=Number($("#pdprice").val());
                       var y=Number($("#pdquantity").val());
                       total = x*y;
                       $("#pdtotalprice").val(total);
                   });
               });
                
            </script>
    </head>
    <body style="background-color: #AEFAC4">
        <br>
        <div class="row">
            
            <div class="col-sm-4">
                
                <div class="container">
                    <form action="Addproduct" method="post">
                        <div class="form-group" align="left">
                            <label>Product name</label>
                            <input type="text" class="form-control" name="pdname" id="pdname" placeholder="enter product name"  required>
                        </div>
                        <div class="form-group">
                            <label>Category</label>
                            <input type="text" class="form-control" name="pdcategory" id="pdcategory" placeholder="enter product category"  required>
                        </div>
                        <div class="form-group">
                            <label>Price</label>
                            <input type="text" class="form-control" name="pdprice" id="pdprice" placeholder="enter price" required>
                        </div>
                        <div class="form-group">
                            <label>Quantity</label>
                            <input type="text" class="form-control" name="pdquantity" id="pdquantity" placeholder="enter quantity" required>
                        </div>
                        <div class="form-group">
                            <label>Total price</label>
                            <input type="text" class="form-control" name="pdtotalprice" id="pdtotalprice" required>
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
                                <th>Product name</th>
                                <th>Category</th>
                                <th>Price</th>
                                <th>Quantity</th>
                                <th>Total price</th>
                                <th>Update</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
      <%
         Connection con = econn.getConnection();         
         Statement st = con.createStatement();
         ResultSet query = st.executeQuery("select * from products");
         while(query.next())
         {
         String pdid = request.getParameter("pdid");
         
         out.println("<tr>");
         out.println("<td>"+query.getString(2)+"</td>");
         out.println("<td>"+query.getString(3)+"</td>");
         out.println("<td>"+query.getInt(4)+"</td>");
         out.println("<td>"+query.getInt(5)+"</td>");
         out.println("<td>"+query.getInt(6)+"</td>");
         out.println("<td>" +"<a href='updateprd.jsp?pdid=" +query.getInt(1)+"'><button type='submit' class='btn btn-success'>Update</button></a>"+"</td>");
         out.println("<td>" +"<a href='deleteprd?pdid=" +query.getInt(1)+"'><button type='submit' class='btn btn-danger'>Delete</button></a>"+"</td>");
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
