package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Page</title>\n");
      out.write("        \n");
      out.write("        <!-- Favicon  -->\n");
      out.write("        <!-- <link rel=\"icon\" href=\"img/core-img/favicon.ico\"> -->\n");
      out.write("        <link rel=\"icon\" href=\"img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- Core Style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/core-style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--        <h1>Login</h1>\n");
      out.write("        <form action=\"Login\" method=\"post\">\n");
      out.write("            username : <input type=\"text\" name=\"username\" required>\n");
      out.write("            password : <input type=\"text\" name=\"password\" required>\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("        </form>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"modal-dialog modal-sm\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\">Customer login</h5>\n");
      out.write("                    <!--<button type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\" class=\"close\"><span aria-hidden=\"true\">×</span></button>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"Login\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input id=\"email-modal\" type=\"text\" name=\"username\" placeholder=\"username\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input id=\"password-modal\" type=\"password\" name=\"password\" placeholder=\"password\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"color: red\" class=\"text-center\">\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </div> <br>\n");
      out.write("                        <p class=\"text-center\">\n");
      out.write("                            <button class=\"btn btn-primary\"><i class=\"fa fa-sign-in\"></i> Log in</button>\n");
      out.write("                        </p>\n");
      out.write("                    </form>\n");
      out.write("                    <p class=\"text-center text-muted\">Not registered yet?</p>\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <!--<button type=\"submit\" class=\"btn btn-primary\" href=\"Register\"><i class=\"fa fa-user-md\"></i> Register</button>-->\n");
      out.write("                        <a href=\"Register\"><button class=\"btn btn-primary\"><i class=\"fa fa-user-md\"></i> Register</button></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
