package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<form class=\"form-horizontal\" action=\"Teste\">\n");
      out.write("  <div class=\"control-group\">\n");
      out.write("    <label class=\"control-label\" for=\"name\">Nome</label>\n");
      out.write("    <div class=\"controls\">\n");
      out.write("      <input type=\"text\" id=\"name\" placeholder=\"Nome\" required>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"control-group\">\n");
      out.write("    <label class=\"control-label\" for=\"cpf\">CPF</label>\n");
      out.write("    <div class=\"controls\">\n");
      out.write("      <input type=\"number\" id=\"cpf\" placeholder=\"___ . ___ . ___ - __\" required> <!-- criar máscara -->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"control-group\">\n");
      out.write("    <label class=\"control-label\" for=\"data-nascimento\">Data de nascimento</label>\n");
      out.write("    <div class=\"controls\">\n");
      out.write("      <input type=\"date\" id=\"data-nascimento\" placeholder=\"__/__/__\"> <!-- criar máscara -->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"control-group\">\n");
      out.write("    <label class=\"control-label\" for=\"email\">E-mail</label>\n");
      out.write("    <div class=\"controls\">\n");
      out.write("      <input type=\"email\" id=\"email\" placeholder=\"email@email.com\"> <!-- criar máscara -->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"control-group\">\n");
      out.write("    <label class=\"control-label\" for=\"salary\">Salário</label>\n");
      out.write("    <div class=\"controls\">\n");
      out.write("      <input type=\"text\" id=\"salary\" placeholder=\"R$\" required> <!-- criar máscara -->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <br>\n");
      out.write("  \n");
      out.write("  <div class=\"control-group\">\n");
      out.write("    <div class=\"controls\">\n");
      out.write("    \t<a class=\"btn btn-inverse\" href=\"\">Voltar</a>\n");
      out.write("      <button type=\"submit\" class=\"btn btn-success\">Salvar</button> \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</form>");
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
