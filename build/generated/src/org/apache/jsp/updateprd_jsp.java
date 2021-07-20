package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updateprd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
if(request.getParameter("submit")!=null)
{
            String pdid = request.getParameter("pdid");
            String pdname = request.getParameter("pdname");
            String pdcategory = request.getParameter("pdcategory");
            String pdprice = request.getParameter("pdprice");
            String pdquantity = request.getParameter("pdquantity");
            String pdtotalprice = request.getParameter("pdtotalprice");
            
         Class.forName("com.mysql.jdbc.Driver");      
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stationary","root","");
         
         PreparedStatement st = con.prepareStatement(" UPDATE `products` SET `pdname`=?,`pdcategory`=?,`pdprice`=?,`pdquantity`=?,`pdtotalprice`=? WHERE pdid=? ");
         st.setString(1, pdname);
         st.setString(2, pdcategory);
         st.setString(3, pdprice);
         st.setString(4, pdquantity);
         st.setString(5, pdtotalprice);
         st.setString(6, pdid);
         
         int rs = st.executeUpdate();
   


      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    alert(\"updated\");\n");
      out.write("</script>\n");
      out.write("\n");
 

}


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add product</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
                            out.println("<td><input type='text' class='form-control' id='pdname' name='pdname' value='"+query.getString(2)+"'></td>");
                        out.println("</div>");
                   out.println("</tr>");
                    out.println("<tr>");
                        out.println("<div class='form-group'>");
                            out.println("<td><label for='pdcategory'>Product category:</label></td>");
                            out.println("<td><input type='text' class='form-control' id='pdcategory' name='pdcategory' value='"+query.getString(3)+"'></td>");
                        out.println("</div>");
                    out.println("</tr>");
                    out.println("<tr>");
                       out.println("<div class='form-group'>");
                          out.println("  <td><label for='pdpric'>Product price:</label></td>");
                          out.println("  <td><input type='text' class='form-control' id='pdprice' name='pdprice' value='"+query.getString(4)+"'></td>");
                      out.println("  </div");
                   out.println(" </tr>");
                    out.println("<tr>");
                       out.println(" <div class='form-group'>");
                           out.println(" <td><label for='pdquantity'>Product quantity</label></td>");
                            out.println("<td><input type='text' class='form-control' id='pdquantity' name='pdquantity' value='"+query.getString(5)+"'></td>");
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
         
        
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
