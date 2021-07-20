package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <h1>Add new product</h1>\n");
      out.write("                <table>\n");
      out.write("                    <form action=\"Addproduct\" method=\"post\">\n");
      out.write("                        <tr><div class=\"form-group\">\n");
      out.write("                            <td><label for=\"pdname\">Product name:</label></td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" id=\"pdname\" name=\"pdname\" placeholder=\"Enter product name\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"pdcategory\">Product category:</label></td>\n");
      out.write("                            <td><select class=\"custom-select mr-sm-2\" id=\"pdcategory\" name=\"pdcategory\">\n");
      out.write("                                     <option value=\"Book\">Book</option>\n");
      out.write("                                     <option value=\"pen\">pen</option>\n");
      out.write("                                     <option value=\"pencil\">pencil</option>\n");
      out.write("                                     <option value=\"file\">file</option>\n");
      out.write("                                     <option value=\"colors\">colors</option>\n");
      out.write("                             </select></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"pdprice\">Product price:</label></td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" id=\"pdprice\" name=\"pdprice\" placeholder=\"Enter price\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"pdquantity\">Product quantity</label></td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" id=\"pdquantity\" name=\"pdquantity\" placeholder=\"Enter quantity\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <td><label for=\"pdtotalprice\">Total price:</label></td>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" id=\"pdtotalprice\" name=\"pdtotalprice\"></td>\n");
      out.write("                        </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <td style=\"text-align: left;\" ><a href=\"products.jsp\"<button type=\"button\" class=\"btn btn-danger\">Back</button></a></td>\n");
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
