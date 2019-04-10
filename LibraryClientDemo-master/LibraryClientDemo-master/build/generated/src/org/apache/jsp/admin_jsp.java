package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html style=\"background-image: url('images/libraryimage.jpeg');\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("        <style>\n");
      out.write("            div{\n");
      out.write("                font-size: 50px;\n");
      out.write("                background-color:rgba(255, 204, 153,0.5);\n");
      out.write("                width: 350px;\n");
      out.write("            }   \n");
      out.write("            \n");
      out.write("            p{\n");
      out.write("                padding:20px;\n");
      out.write("                position:relative;\n");
      out.write("                background: rgba(255, 204, 153,0.5);\n");
      out.write("                width: 500px;\n");
      out.write("                height:500px;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"margin-left: 500px\">\n");
      out.write("                ADMIN PAGE\n");
      out.write("            </div>\n");
      out.write("        <form action=\"/AdminServlet\" method=\"post\">\n");
      out.write("            <p style=\"margin-left: 400px\"> \n");
      out.write("                Book Id: <input type=\"textbox\" name=\"bookid\"/><br><br>\n");
      out.write("                Book Name: <input type=\"textbox\" name=\"bookname\"/><br><br>\n");
      out.write("                Author: <input type=\"textbox\" name=\"author\"/><br><br>\n");
      out.write("                Genre: <input type=\"textbox\" name=\"genre\"/><br><br>\n");
      out.write("                Number Of Books:</td><td> <input type=\"textbox\" name=\"num\"/><br><br><br>\n");
      out.write("            \n");
      out.write("                Select your Choice:<br><br>\n");
      out.write("                <input style=\"background-color:rgb(234,119,15)\" type=\"submit\" name=\"add\" value=\"Add Book\"/>&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input style=\"background-color:rgb(234,119,15)\" type=\"submit\" name=\"update\" value=\"Update Book\"/>&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input style=\"background-color:rgb(234,119,15)\" type=\"submit\" name=\"delete\" value=\"Delete Book\"/>\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
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
