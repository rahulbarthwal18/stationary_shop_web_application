package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Calculator</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("\t<script> \n");
      out.write("\t\t//function that display value \n");
      out.write("\t\tfunction dis(val) \n");
      out.write("\t\t{ \n");
      out.write("\t\t\tdocument.getElementById(\"result\").value+=val;\n");
      out.write("\t\t} \n");
      out.write("\t\t\n");
      out.write("\t\tfunction solve() \n");
      out.write("\t\t{ \n");
      out.write("\t\t\tlet x = document.getElementById(\"result\").value;\n");
      out.write("\t\t\tlet y = eval(x); \n");
      out.write("\t\t\tdocument.getElementById(\"result\").value = y;\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction clr() \n");
      out.write("\t\t{ \n");
      out.write("\t\t\tdocument.getElementById(\"result\").value = \"\"; \n");
      out.write("\t\t} \n");
      out.write("\t</script> \n");
      out.write("\t<style> \n");
      out.write("\t\t.title{ \n");
      out.write("\t\tmargin-bottom: 10px; \n");
      out.write("\t\ttext-align:center; \n");
      out.write("\t\twidth: 210px; \n");
      out.write("\t\tcolor:green; \n");
      out.write("\t\tborder: solid black 2px; \n");
      out.write("\t\t} \n");
      out.write("\n");
      out.write("\t\tinput[type=\"button\"] \n");
      out.write("\t\t{ \n");
      out.write("\t\tbackground-color:green; \n");
      out.write("\t\tcolor: black; \n");
      out.write("\t\tborder: solid black 2px; \n");
      out.write("\t\twidth:100% \n");
      out.write("\t\t} \n");
      out.write("\n");
      out.write("\t\tinput[type=\"text\"] \n");
      out.write("\t\t{ \n");
      out.write("\t\tbackground-color:white; \n");
      out.write("\t\tborder: solid black 2px; \n");
      out.write("\t\twidth:100% \n");
      out.write("\t\t} \n");
      out.write("\t</style> \n");
      out.write("</head> \n");
      out.write("<body>\n");
      out.write("\t<table border=\"1\"> \n");
      out.write("\t\t<tr> \n");
      out.write("\t\t\t<td colspan=\"3\"><input type=\"text\" id=\"result\"/></td> \n");
      out.write("\t\t\t<!-- clr() function will call clr to clear all value -->\n");
      out.write("\t\t\t<td><input type=\"button\" value=\"c\" onclick=\"clr()\"/> </td> \n");
      out.write("\t\t</tr> \n");
      out.write("\t\t<tr> \n");
      out.write("\t\t\t<!-- create button and assign value to each button -->\n");
      out.write("\t\t\t<!-- dis(\"1\") will call function dis to display value -->\n");
      out.write("\t\t\t<td><input type=\"button\" value=\"1\" onclick=\"dis('1')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"2\" onclick=\"dis('2')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"3\" onclick=\"dis('3')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"/\" onclick=\"dis('/')\"/> </td> \n");
      out.write("\t\t</tr> \n");
      out.write("\t\t<tr> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"4\" onclick=\"dis('4')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"5\" onclick=\"dis('5')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"6\" onclick=\"dis('6')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"-\" onclick=\"dis('-')\"/> </td> \n");
      out.write("\t\t</tr> \n");
      out.write("\t\t<tr> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"7\" onclick=\"dis('7')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"8\" onclick=\"dis('8')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"9\" onclick=\"dis('9')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"+\" onclick=\"dis('+')\"/> </td> \n");
      out.write("\t\t</tr> \n");
      out.write("\t\t<tr> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\".\" onclick=\"dis('.')\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"0\" onclick=\"dis('0')\"/> </td> \n");
      out.write("\t\t\t<!-- solve function call function solve to evaluate value -->\n");
      out.write("\t\t\t<td><input type=\"button\" value=\"=\" onclick=\"solve()\"/> </td> \n");
      out.write("\t\t\t<td><input type=\"button\" value=\"*\" onclick=\"dis('*')\"/> </td> \n");
      out.write("\t\t</tr> \n");
      out.write("\t</table> \n");
      out.write("</body> \n");
      out.write("</html> \n");
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
