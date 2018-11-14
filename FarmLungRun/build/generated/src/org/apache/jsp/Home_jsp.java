package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en th\">\n");
      out.write("\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/nav.jsp?page=Home", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Product Catagories Area Start -->\n");
      out.write("            <div class=\"products-catagories-area clearfix\">\n");
      out.write("                <div class=\"amado-pro-catagory clearfix\">\n");
      out.write("\n");
      out.write("                    <!-- Single Catagory -->\n");
      out.write("                    <div class=\"single-products-catagory clearfix\">\n");
      out.write("                        <a href=\"shop.html\">\n");
      out.write("                            <img src=\"img/bg-img/1.jpg\" alt=\"\">\n");
      out.write("                            <!-- Hover Content -->\n");
      out.write("                            <div class=\"hover-content\">\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                                <p>From $180</p>\n");
      out.write("                                <h4>Modern Chair</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Single Catagory -->\n");
      out.write("                    <div class=\"single-products-catagory clearfix\">\n");
      out.write("                        <a href=\"shop.html\">\n");
      out.write("                            <img src=\"img/bg-img/2.jpg\" alt=\"\">\n");
      out.write("                            <!-- Hover Content -->\n");
      out.write("                            <div class=\"hover-content\">\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                                <p>From $180</p>\n");
      out.write("                                <h4>Minimalistic Plant Pot</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Single Catagory -->\n");
      out.write("                    <div class=\"single-products-catagory clearfix\">\n");
      out.write("                        <a href=\"shop.html\">\n");
      out.write("                            <img src=\"img/bg-img/3.jpg\" alt=\"\">\n");
      out.write("                            <!-- Hover Content -->\n");
      out.write("                            <div class=\"hover-content\">\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                                <p>From $180</p>\n");
      out.write("                                <h4>Modern Chair</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Single Catagory -->\n");
      out.write("                    <div class=\"single-products-catagory clearfix\">\n");
      out.write("                        <a href=\"shop.html\">\n");
      out.write("                            <img src=\"img/bg-img/4.jpg\" alt=\"\">\n");
      out.write("                            <!-- Hover Content -->\n");
      out.write("                            <div class=\"hover-content\">\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                                <p>From $180</p>\n");
      out.write("                                <h4>Night Stand</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Single Catagory -->\n");
      out.write("                    <div class=\"single-products-catagory clearfix\">\n");
      out.write("                        <a href=\"shop.html\">\n");
      out.write("                            <img src=\"img/bg-img/5.jpg\" alt=\"\">\n");
      out.write("                            <!-- Hover Content -->\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                                <p>From $18</p>\n");
      out.write("                                <h4>Plant Pot</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"p\" varStatus=\"n\">\n");
      out.write("                        <div class=\"single-products-catagory clearfix\">\n");
      out.write("                            <a href=\"shop.html\">\n");
      out.write("                                <img src=\"img/bg-img/9.jp g\" alt=\"\">\n");
      out.write("                                <!-- Hover Content -->\n");
      out.write("                                <div class=\"hover-content\">\n");
      out.write("                                    <div class=\"line\"></div>\n");
      out.write("                                    <p>From ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </c:forEach>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Product Catagories Area End -->\n");
      out.write("        </div>\n");
      out.write("        <!-- ##### Main Content Wrapper End ##### -->\n");
      out.write("\n");
      out.write("        <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->\n");
      out.write("        <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("        <!-- Popper js -->\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap js -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Plugins js -->\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
      out.write("        <!-- Active js -->\n");
      out.write("        <script src=\"js/active.js\"></script>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp?page=Home", out, false);
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
