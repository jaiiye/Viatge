/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2015-04-23 19:55:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.site.template.tp_005f02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfectTravel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"filtro\">\n");
      out.write("\t\n");
      out.write("    <div class=\"container\">\n");
      out.write("        \n");
      out.write("        <h1>Viagem Perfeita</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"passo-filtro txt-thema\">\n");
      out.write("        \n");
      out.write("            <h2>Como utilizar o destino perfeito</h2>\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                <li><span class=\"border-thema\">1</span> <p>Selecione abaixo as opções que mais combinam com você!</p></li>\n");
      out.write("                <li><span class=\"border-thema\">2</span> <p>Aperte o botão ok! Buscaremos os destinos perfeitos para sua férias!</p></li>\n");
      out.write("                <li><span class=\"border-thema\">3</span> <p>Navegue pelos destinos sugeridos, escolha o que mais gostar e entre em contato conosco!</p></li>\n");
      out.write("            </ul>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"filtro\">\n");
      out.write("            <h2 class=\"bg-thema\">ENCONTRAR DESTINO PERFEITO.</h2>\n");
      out.write("    \t\t\n");
      out.write("            <!-- FILTRO DE DESTINO -->\n");
      out.write("            \n");
      out.write("            <form action=\"?alert=resposta\" method=\"post\" name=\"form-filtro\" class=\"form-filtro\">\n");
      out.write("                <div class=\"box-select\">\n");
      out.write("                    <label>VIAJO COM (SOU)</label>\n");
      out.write("                    <select class=\"select01\" name=\"viajo\">\n");
      out.write("                        <option value=\"\">Selecionar...</option>\n");
      out.write("                        <option value=\"Opção 01\">Opção 01</option>\n");
      out.write("                        <option value=\"Opção 02\">Opção 02</option>\n");
      out.write("                        <option value=\"Opção 03\">Opção 03</option>\n");
      out.write("                        <option value=\"Opção 04\">Opção 04</option>\n");
      out.write("                    </select> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"box-select\">\n");
      out.write("                    <label>PROCURO POR</label>\n");
      out.write("                    <select class=\"select01\" name=\"procuro\">\n");
      out.write("                        <option value=\"\">Selecionar...</option>\n");
      out.write("                        <option value=\"Opção 01\">Opção 01</option>\n");
      out.write("                        <option value=\"Opção 02\">Opção 02</option>\n");
      out.write("                        <option value=\"Opção 03\">Opção 03</option>\n");
      out.write("                        <option value=\"Opção 04\">Opção 04</option>\n");
      out.write("                    </select> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"box-select\">\n");
      out.write("                    <label>QUERO</label>\n");
      out.write("                    <select class=\"select01\" name=\"quero\">\n");
      out.write("                        <option value=\"\">Selecionar...</option>\n");
      out.write("                        <option value=\"Opção 01\">Opção 01</option>\n");
      out.write("                        <option value=\"Opção 02\">Opção 02</option>\n");
      out.write("                        <option value=\"Opção 03\">Opção 03</option>\n");
      out.write("                        <option value=\"Opção 04\">Opção 04</option>\n");
      out.write("                    </select> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"box-select\">\n");
      out.write("                    <label>PREFIRO</label>\n");
      out.write("                    <select class=\"select01\" name=\"prefiro\">\n");
      out.write("                        <option value=\"\">Selecionar...</option>\n");
      out.write("                        <option value=\"Opção 01\">Opção 01</option>\n");
      out.write("                        <option value=\"Opção 02\">Opção 02</option>\n");
      out.write("                        <option value=\"Opção 03\">Opção 03</option>\n");
      out.write("                        <option value=\"Opção 04\">Opção 04</option>\n");
      out.write("                    </select> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"box-select\">\n");
      out.write("                    <label>ADORO</label>\n");
      out.write("                    <select class=\"select01\" name=\"adoro\">\n");
      out.write("                        <option value=\"\">Selecionar...</option>\n");
      out.write("                        <option value=\"Opção 01\">Opção 01</option>\n");
      out.write("                        <option value=\"Opção 02\">Opção 02</option>\n");
      out.write("                        <option value=\"Opção 03\">Opção 03</option>\n");
      out.write("                        <option value=\"Opção 04\">Opção 04</option>\n");
      out.write("                    </select> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"box-botton\">\n");
      out.write("                    <button type=\"submit\" class=\"button01 bg-thema\"><i></i> REALIZAR BUSCA</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            <!-- FIM FILTRO DE DESTINO -->\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"txt-destino-perfeito txt-thema\">\n");
      out.write("            <p>A (Nome da Agência) é diferente porque é personalizada...</p>\n");
      out.write("            <p>Existe uma viagem PERFEITA para cada pessoa!</p>\n");
      out.write("            <p>Qual será a sua?</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</section>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
