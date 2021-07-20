package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Registration</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <header>\n");
      out.write("            <nav class=\"navbar navbar-dark bg-primary fixed-top\">\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img src=\"images/open-book.png\" width=\"100\" height=\"100\" class=\"d-inline-block align-top\" alt=\"logo\">\n");
      out.write("              </a>\n");
      out.write("                 <h1>Book Store System</h1>\n");
      out.write("            </nav>\n");
      out.write("        </header>   \n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            <center>\n");
      out.write("                <table>\n");
      out.write("                    <img src=\"images/admin.png\" width=\"50\" height=\"60\" class=\"d-inline-block \" alt=\"logo2\">\n");
      out.write("                    <form action=\"userReg\" method=\"post\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                              <h2>Register</h2>\n");
      out.write("                              <p>Please fill in this form to create an account.</p>\n");
      out.write("                              <hr>\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <tr>\n");
      out.write("                                  <td><label for=\"uname\"><b>Name</b></label></td>\n");
      out.write("                                  <td><input type=\"text\" placeholder=\"Enter Name\" name=\"uname\" id=\"uname\" required></td>\n");
      out.write("                              </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                  <td><label for=\"uemail\"><b>Email</b></label></td>\n");
      out.write("                                  <td><input type=\"email\" placeholder=\"Enter Email\" name=\"uemail\" id=\"uemail\" required></td>\n");
      out.write("                              </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                  <td><label for=\"upwd\"><b>Password</b></label></td>\n");
      out.write("                                  <td><input type=\"password\" placeholder=\"Enter Password\" name=\"upwd\" id=\"upwd\" required></td>\n");
      out.write("                              </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                  <td><label for=\"upwd-repeat\"><b>Repeat Password</b></label></td>\n");
      out.write("                                  <td><input type=\"password\" placeholder=\"Repeat Password\" name=\"upwd-repeat\" id=\"upwd-repeat\" required></td>\n");
      out.write("                                  <td><p id=\"pass\"></p></td>\n");
      out.write("                              </tr>\n");
      out.write("                              <hr>\n");
      out.write("                              <tr>\n");
      out.write("                                  <td><p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p></td>\n");
      out.write("                              </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                  <td style=\"text-align: left;\" ><a href=\"userlogin.jsp\"><button type=\"button\" class=\"btn btn-danger\">Back</button></a></td>\n");
      out.write("                                  <td style=\"text-align: right;\"><button type=\"submit\" class=\"btn btn-success\" style=\"font-weight: bold;\"onclick=\"return Validate()\">Register</button</td>\n");
      out.write("                              </tr>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"container signin\">\n");
      out.write("                                <tr>  \n");
      out.write("                                    <td><p>Already have an account? <a href=\"userlogin.jsp\">Sign in</a>.</p></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </section>\n");
      out.write("        <footer style=\"margin-top: -2px;\">\n");
      out.write("            <h5>Developed by Rahul Barthwal</h5>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    function Validate() {\n");
      out.write("        var password = document.getElementById(\"upwd\").value;\n");
      out.write("        var confirmPassword = document.getElementById(\"upwd-repeat\").value;\n");
      out.write("        if (password != confirmPassword) {\n");
      out.write("            document.getElementById(\"pass\").innerHTML = \"Password not matched\";            \n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("</script>\n");
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
