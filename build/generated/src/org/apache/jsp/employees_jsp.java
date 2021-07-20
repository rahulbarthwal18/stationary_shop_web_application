package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.econn;
import java.sql.*;

public final class employees_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");

                if(session.getAttribute("adminemail")==null)
                {
                    response.sendRedirect("adminlogin.jsp");
                }
                
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.js\" integrity=\"sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-dark bg-primary\">\n");
      out.write("            <h3 style=\"color: white\">Stationary shop record system</h3>\n");
      out.write("        </nav>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                \n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form action=\"Addemployee\" method=\"post\">\n");
      out.write("                       <div class=\"form-group\">\n");
      out.write("                            <label for=\"empname\">Full name:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"empname\" name=\"empname\" placeholder=\"Enter full name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"empemail\">Email address:</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"empemail\" name=\"empemail\" placeholder=\"Enter email address\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"empage\">Age:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"empage\" name=\"empage\" placeholder=\"Enter age\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"empjoindate\">Join date:</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" id=\"empjoindate\" name=\"empjoindate\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"empsalary\">Salary:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"empsalary\" name=\"empsalary\" placeholder=\"Enter salary\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\"  class=\" btn btn-info\">Add</button>\n");
      out.write("                            <button type=\"reset\"  class=\" btn btn-warning\">Reset</button>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    \n");
      out.write("                    <table id=\"tbl-product\" class=\"table table-bordered\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Full name</th>\n");
      out.write("                                <th>Email address</th>\n");
      out.write("                                <th>age</th>\n");
      out.write("                                <th>join date</th>\n");
      out.write("                                <th> salary</th>\n");
      out.write("                                <th>Update</th>\n");
      out.write("                                <th>Delete</th>\n");
      out.write("   \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                       ");

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
         out.println("<td>" +"<a href='updateemp.jsp?empid=" +query.getInt(1)+"'>Update</a>"+"</td>");
         out.println("<td>" +"<a href='deleteemp?empid=" +query.getInt(1)+"'>Delete</a>"+"</td>");
         out.println("</tr>");
          }
         
        
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("      \n");
      out.write("  \n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write(" </body>\n");
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
