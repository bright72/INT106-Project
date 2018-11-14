package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("        <!-- Title  -->\n");
      out.write("        <title>Farm LungRun | Home</title>\n");
      out.write("\n");
      out.write("        <!-- Favicon  -->\n");
      out.write("        <!-- <link rel=\"icon\" href=\"img/core-img/favicon.ico\"> -->\n");
      out.write("        <link rel=\"icon\" href=\"img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- Core Style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/core-style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        \n");
      out.write("        <footer class=\"footer_area clearfix\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <!-- Single Widget Area -->\n");
      out.write("                    <div class=\"col-12 col-lg-4\">\n");
      out.write("                        <div class=\"single_widget_area\">\n");
      out.write("                            <!-- Logo -->\n");
      out.write("                            <div class =\"footer-logo mr-50\">\n");
      out.write("                                <!-- <a href=\"index.html\"><img src=\"img/core-img/logo2.png\" alt=\"\"></a> -->\n");
      out.write("                                <h1 style=\"color: white\">Farm LungRun</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Copywrite Text -->\n");
      out.write("                            <p class=\"copywrite\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | FarmLungRun by <a href=\"https://colorlib.com\" target=\"_blank\">INT303 FarmLungRun Group</a>\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Single Widget Area -->\n");
      out.write("                    <div class=\"col-12 col-lg-8\">\n");
      out.write("                        <div class=\"single_widget_area\">\n");
      out.write("                            <!-- Footer Menu -->\n");
      out.write("                            <div class=\"footer_menu\">\n");
      out.write("                                <nav class=\"navbar navbar-expand-lg justify-content-end\">\n");
      out.write("                                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#footerNavContent\" aria-controls=\"footerNavContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("                                    <div class=\"collapse navbar-collapse\" id=\"footerNavContent\">\n");
      out.write("                                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                                            <li class=\"nav-item active\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"index.html\">Home</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"shop.html\">Shop</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"cart.html\">Cart</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"checkout.html\">Checkout</a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
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
