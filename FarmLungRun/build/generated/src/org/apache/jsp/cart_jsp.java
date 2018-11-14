package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("       <title>Farm LungRun | Cart</title>\n");
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/nav.jsp?page=Cart", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"cart-table-area section-padding-100\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 col-lg-8\">\n");
      out.write("                        <div class=\"cart-title mt-50\">\n");
      out.write("                            <h2>Shopping Cart</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"cart-table clearfix\">\n");
      out.write("                            <table class=\"table table-responsive\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th></th>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Quantity</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td class=\"cart_product_img\">\n");
      out.write("                                            <a href=\"#\"><img src=\"img/bg-img/cart1.jpg\" alt=\"Product\"></a>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"cart_product_desc\">\n");
      out.write("                                            <h5>White Modern Chair</h5>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"price\">\n");
      out.write("                                            <span>$130</span>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"qty\">\n");
      out.write("                                            <div class=\"qty-btn d-flex\">\n");
      out.write("                                                <p>Qty</p>\n");
      out.write("                                                <div class=\"quantity\">\n");
      out.write("                                                    <span class=\"qty-minus\" onclick=\"var effect = document.getElementById('qty'); var qty = effect.value; if (!isNaN(qty) & amp; & amp; qty & gt; 1) effect.value--; return false;\"><i class=\"fa fa-minus\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                    <input type=\"number\" class=\"qty-text\" id=\"qty\" step=\"1\" min=\"1\" max=\"300\" name=\"quantity\" value=\"1\">\n");
      out.write("                                                    <span class=\"qty-plus\" onclick=\"var effect = document.getElementById('qty'); var qty = effect.value; if (!isNaN(qty)) effect.value++; return false;\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-lg-4\">\n");
      out.write("                        <div class=\"cart-summary\">\n");
      out.write("                            <h5>Cart Total</h5>\n");
      out.write("                            <ul class=\"summary-table\">\n");
      out.write("                                <li><span>subtotal:</span> <span>$140.00");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.subtotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                                <li><span>delivery:</span> <span>Free");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${delivery}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                                <li><span>total:</span> <span>$140.00");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"cart-btn mt-100\">\n");
      out.write("                                <a href=\"Checkout\" class=\"btn amado-btn w-100\">Checkout</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->\n");
      out.write("    <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("    <!-- Popper js -->\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Plugins js -->\n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <!-- Active js -->\n");
      out.write("    <script src=\"js/active.js\"></script>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp?page=Home", out, false);
      out.write("\n");
      out.write("\n");
      out.write("</html>  \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems(new String("cart"));
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setVarStatus("n");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tbody>\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td class=\"cart_product_img\">\n");
          out.write("                                                <a href=\"#\"><img src=\"img/bg-img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td class=\"cart_product_desc\">\n");
          out.write("                                                <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td class=\"price\">\n");
          out.write("                                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td class=\"qty\">\n");
          out.write("                                                <div class=\"qty-btn d-flex\">\n");
          out.write("                                                    <p>Qty</p>\n");
          out.write("                                                    <div class=\"quantity\">\n");
          out.write("                                                        <form action=\"/Cart\" method =\"post\">\n");
          out.write("                                                            <span class=\"qty-minus\" onclick=\"var effect = document.getElementById('qty3'); var qty = effect.value; if (!isNaN(qty) & amp; & amp; qty & gt; 1) effect.value--; return false;\"><i class=\"fa fa-minus\" aria-hidden=\"true\"></i></span>\n");
          out.write("                                                            <input type=\"number\" class=\"qty-text\" id=\"qty3\" step=\"1\" min=\"1\" max=\"300\" name=\"quantity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                            <span class=\"qty-plus\" onclick=\"var effect = document.getElementById('qty3'); var qty = effect.value; if (!isNaN(qty)) effect.value++; return false;\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i></span>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    </tbody>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
