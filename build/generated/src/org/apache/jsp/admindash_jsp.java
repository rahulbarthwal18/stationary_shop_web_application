package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admindash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Dashboard</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            .sidebar {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 200px;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  position: fixed;\n");
      out.write("  height: 100%;\n");
      out.write("  overflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Sidebar links */\n");
      out.write(".sidebar a {\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  padding: 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Active/current link */\n");
      out.write(".sidebar a.active {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Links on mouse-over */\n");
      out.write(".sidebar a:hover:not(.active) {\n");
      out.write("  background-color: #555;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Page content. The value of the margin-left property should match the value of the sidebar's width property */\n");
      out.write("div.content {\n");
      out.write("  margin-left: 200px;\n");
      out.write("  padding: 1px 16px;\n");
      out.write("  height: 1000px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On screens that are less than 700px wide, make the sidebar into a topbar */\n");
      out.write("@media screen and (max-width: 700px) {\n");
      out.write("  .sidebar {\n");
      out.write("    width: 100%;\n");
      out.write("    height: auto;\n");
      out.write("    position: relative;\n");
      out.write("  }\n");
      out.write("  .sidebar a {float: left;}\n");
      out.write("  div.content {margin-left: 0;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On screens that are less than 400px, display the bar vertically, instead of horizontally */\n");
      out.write("@media screen and (max-width: 400px) {\n");
      out.write("  .sidebar a {\n");
      out.write("    text-align: center;\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header>\n");
      out.write("            <nav class=\"navbar navbar-dark bg-primary fixed-top\">\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img src=\"images/open-book.png\" width=\"100\" height=\"100\" class=\"d-inline-block align-top\" alt=\"logo\">\n");
      out.write("              </a>\n");
      out.write("                <h1>Stationary Record System</h1>\n");
      out.write("                <form action=\"admlogout\" method=\"post\" style=\"text-align:right;margin-right: 30px;\">\n");
      out.write("                     <button type=\"submit\" class=\"btn btn-danger\">Logout</button>\n");
      out.write("                 </form>\n");
      out.write("            </nav>\n");
      out.write("        </header> \n");
      out.write("        <section>\n");
      out.write("            <center>\n");
      out.write("                <h2 style=\"background-color: yellowgreen\">Dashboard</h2>\n");
      out.write("            </center\n");
      out.write("            ");

                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                response.setHeader("Pragma", "no-cache");
                response.setHeader("Expires", "0");
                
                if(session.getAttribute("adminemail")==null)
                {
                    response.sendRedirect("adminlogin.jsp");
                }
                
      out.write("\n");
      out.write("                <h2 style=\"font-weight:bold\">Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminemail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>   \n");
      out.write("        </section>\n");
      out.write("       <div class=\"wrapper\">\n");
      out.write("       <div class=\"sidebar\">\n");
      out.write("            <a class=\"active\" href=\"#home\">Home</a>\n");
      out.write("            <a href=\"products.jsp\" target=\"z\">Products</a>\n");
      out.write("            <a href=\"employees.jsp\" target=\"z\">Employees</a>\n");
      out.write("            <a href=\"#\">Setting</a>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"embed-responsive frame\">\n");
      out.write("            <iframe class=\"embed-responsive-item\" src=\"products.jsp\" name=\"z\" ></iframe>\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("    </body>\n");
      out.write("    <center>\n");
      out.write("        <footer style=\"margin-top:-10px;\">\n");
      out.write("            <h5 style=\"font-weight: bold\">Developed by Rahul Barthwal</h5>\n");
      out.write("        </footer>\n");
      out.write("    </center>\n");
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
