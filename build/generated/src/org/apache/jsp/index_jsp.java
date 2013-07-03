package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/_header.jsp");
    _jspx_dependants.add("/_footer.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Loja de Esportes</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"Loja de esportes\">\n");
      out.write("    <meta name=\"author\" content=\"Lucas Nadalutti, Marcelle Guine, Pedro Yusim\">\n");
      out.write("\n");
      out.write("    <!-- Le styles -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.png\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div class=\"navbar navbar-fixed-top\">\n");
      out.write("      <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"brand\" href=\"index.php\">Loja de Esportes</a>\n");
      out.write("          <div class=\"nav-collapse collapse\">\n");
      out.write("            <p class=\"navbar-text pull-right\">\n");
      out.write("              <a href=\"#\" class=\"navbar-link\">marcelleguine</a>\n");
      out.write("            </p>\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("              <li class=\"active\"><a href=\"index.php\">Venda</a></li>\n");
      out.write("              <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" id=\"products\" role=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Produtos<b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"products\">\n");
      out.write("                  <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"product-buy.php\">Comprar</a></li>\n");
      out.write("                  <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"product-new.php\">Cadratrar</a></li>\n");
      out.write("                  <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"product-index.php\">Visualizar</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" id=\"users\" role=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Funcionários<b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"users\">\n");
      out.write("                  <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"user-new.php\">Cadratrar</a></li>\n");
      out.write("                  <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"user-index.php\">Visualizar</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"report.php\" id=\"report\" role=\"button\">Relatórios</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!--end nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">");
      out.write("\n");
      out.write("\n");
      out.write("<h1>Venda de produtos</h1>\n");
      out.write("<div class=\"row-fluid\">        \n");
      out.write("  <div class=\"span12\">\n");
      out.write("    <form class=\"form-inline\">\n");
      out.write("      <fieldset id=\"form-sell\">\n");
      out.write("          <input class=\"input-xlarge\" type=\"text\" id=\"nome\" placeholder=\"nome do produto\"> <!-- fazer autocomplete -->\n");
      out.write("          <input class=\"input-small\" type=\"text\" id=\"price\" placeholder=\"preço unitário\"> <!-- criar máscara R$ 00,00 -->\n");
      out.write("          <select class=\"input-small\">\n");
      out.write("            <option>1</option>\n");
      out.write("            <option>2</option>\n");
      out.write("            <option>3</option>\n");
      out.write("          </select>\n");
      out.write("          <button type=\"button\" class=\"btn btn-inverse\">Adicionar produto</button>\n");
      out.write("      </fieldset>\n");
      out.write("    </form>\n");
      out.write("  </div><!--end span-->\n");
      out.write("</div>\n");
      out.write("<div id=\"table-sell\" class=\"row-fluid\">   \n");
      out.write("  <div class=\"span12\">\n");
      out.write("    <table class=\"table table-striped\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th>Nome</th>\n");
      out.write("          <th>Quantidade</th>\n");
      out.write("          <th>Preço unitário</th>\n");
      out.write("          <th>Preço total</th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("        <tr>\n");
      out.write("          <td>Camisa Nike CBF Home s/nº 2013 - Masculina</td>\n");
      out.write("          <td>R$199,90</td>\n");
      out.write("          <td>2</td>\n");
      out.write("          <td>R$399,80</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>Camisa Nike CBF Home 2013 - Feminina</td>\n");
      out.write("          <td>R$179,00</td>\n");
      out.write("          <td>1</td>\n");
      out.write("          <td>R$179,00</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>Bermuda Oxer Medley - Masculino</td>\n");
      out.write("          <td>R$59,90</td>\n");
      out.write("          <td>3</td>\n");
      out.write("          <td>R$179,70</td>\n");
      out.write("        </tr>\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("    <span id=\"total\">Total: R$758,50</span>\n");
      out.write("    <button id=\"btn-end-sell\" type=\"button\" class=\"btn btn-success\">Finalizar venda</button>\n");
      out.write("  </div><!--end span-->\n");
      out.write("</div><!--end row--> \n");
      out.write("\n");
      out.write("\t\t\t<hr>\n");
      out.write("\t\t\t<footer>\n");
      out.write("        <p>&copy; Company 2013</p>\n");
      out.write("      </footer>\n");
      out.write("    </div><!--/.fluid-container-->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
