package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.econn;
import java.sql.*;;

public final class changepwd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
 
if(request.getParameter("submit")!=null)
{
         String email = request.getParameter("aemail");
         String apwd = request.getParameter("apwd");
         Connection con = econn.getConnection();         
         Statement st = con.createStatement();
         st.executeUpdate("update admin set adpwd='"+apwd+"' where ademail='"+email+"'");
    
         
      out.write("\n");
      out.write("         <script>\n");
      out.write("             alert(\"Paswword changed\");\n");
      out.write("             window.location(\"adminlogin.jsp\");\n");
      out.write("         </script> \n");
         
}


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <header>\n");
      out.write("            <nav class=\"navbar navbar-dark bg-primary fixed-top\">\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img src=\"images/open-book.png\" width=\"100\" height=\"100\" class=\"d-inline-block align-top\" alt=\"logo\">\n");
      out.write("                \n");
      out.write("              </a>\n");
      out.write("                 <h1>Stationary Shop Record System</h1>\n");
      out.write("            </nav>\n");
      out.write("        </header> \n");
      out.write("    <center>    \n");
      out.write("        <section style=\"margin-top:60px; \">\n");
      out.write("                <h2 style=\"background-color: whitesmoke\">Change password</h2>\n");
      out.write("                <table>\n");
      out.write("                    <img src=\"images/admin.png\" width=\"100\" height=\"100\" class=\"d-inline-block \" alt=\"logo2\">\n");
      out.write("                    <form action=\"#\" method=\"post\">\n");
      out.write("                        <tr><div class=\"form-group\">\n");
      out.write("                            <td><label for=\"aemail\">Email address:</label></td>\n");
      out.write("                            <td><input type=\"email\" class=\"form-control\" id=\"aemail\" name=\"aemail\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"apwd\">Password:</label></td>\n");
      out.write("                            <td><input type=\"password\" class=\"form-control\" id=\"apwd\" name=\"apwd\" placeholder=\"Password\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <td style=\"text-align: left;\" ><button type=\"adminlogin.jsp\" class=\"btn btn-primary\">Back</button></a></td>\n");
      out.write("                    <td style=\"text-align: right;\" ><button type=\"submit\" name=\"submit\" id=\"submit\" class=\"btn btn-success\">Submit</button></td>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        </center>\n");
      out.write("    <footer style=\"margin-top: 90px\">\n");
      out.write("            <h5>Developed by Rahul Barthwal</h5>\n");
      out.write("        </footer>\n");
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
