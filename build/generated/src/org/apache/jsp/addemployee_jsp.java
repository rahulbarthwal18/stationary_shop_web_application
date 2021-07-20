package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addemployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write(' ');
     
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                response.setHeader("Pragma", "no-cache");
                response.setHeader("Expires", "0");

       
                if(session.getAttribute("adminemail")==null)
                {
                    response.sendRedirect("adminlogin.jsp");
                }
                
      out.write("\n");
      out.write("           \n");
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
      out.write("    <center>\n");
      out.write("       <h1>Add new employee</h1>\n");
      out.write("                <table>\n");
      out.write("                    <form action=\"Addemployee\" method=\"post\">\n");
      out.write("                        <tr><div class=\"form-group\">\n");
      out.write("                            <td><label for=\"empname\">Full name:</label></td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" id=\"empname\" name=\"empname\" placeholder=\"Enter full name\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"empemail\">Email address:</label></td>\n");
      out.write("                            <td><input type=\"email\" class=\"form-control\" id=\"empemail\" name=\"empemail\" placeholder=\"Enter email address\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"empage\">Age:</label></td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" id=\"empage\" name=\"empage\" placeholder=\"Enter age\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"empjoindate\">Join date:</label></td>\n");
      out.write("                            <td><input type=\"date\" class=\"form-control\" id=\"empjoindate\" name=\"empjoindate\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"empsalary\">Salary:</label></td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" id=\"empsalary\" name=\"empsalary\" placeholder=\"Enter salary\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <td style=\"text-align: left;\" ><a href=\"employees.jsp\"<button type=\"button\" class=\"btn btn-danger\">Back</button></a></td>\n");
      out.write("                        <td style=\"text-align: right;\" ><button type=\"submit\" class=\"btn btn-success\">Submit</button></td>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </table>\n");
      out.write("    </center>\n");
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
