/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2015-05-08 03:27:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.site.template.tp_005f01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Features section -->\r\n");
      out.write("<div class=\"features section global-map-area parallax\"\r\n");
      out.write("\tdata-stellar-background-ratio=\"0.5\">\r\n");
      out.write("\t<div class=\"section container\">\r\n");
      out.write("\t\t<h2 align=\"center\" style=\"color: white; font-size: 38px;\">Destinos\r\n");
      out.write("\t\t\tem Destaque</h2>\r\n");
      out.write("\t\t<div class=\"row image-box style3\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<section id=\"content\">\r\n");
      out.write("\t<div class=\"search-box-wrapper\">\r\n");
      out.write("\t\t<div class=\"search-box container\">\r\n");
      out.write("\t\t\t<ul class=\"search-tabs clearfix\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#hotels-tab\" data-toggle=\"tab\">DESTINO\r\n");
      out.write("\t\t\t\t\t\tPERFEITO</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#flights-tab\" data-toggle=\"tab\">PASSAGENS\r\n");
      out.write("\t\t\t\t\t\tAereas</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#flight-and-hotel-tab\" data-toggle=\"tab\">RESERVA\r\n");
      out.write("\t\t\t\t\t\tDE HOTÉIS</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"search-tab-content\">\r\n");
      out.write("\t\t\t<h4 class=\"title\">Utilize os filtros de experiências para encontrar o seu destino perfeito!</h4>\r\n");
      out.write("\t\t\t\t<div class=\"tab-pane fade active in\" id=\"hotels-tab\">\r\n");
      out.write("\t\t\t\t\t<form action=\"hotel-list-view.html\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row container-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"selector\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"full-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">-- Viajo com/ou férias em --</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Viagem com Acompanhante</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Viagem com Amigos</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Viajentes Solitários</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Familia com Crianças</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Familia sem Crianças</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Terceira Idade</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Jovens</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"selector\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"full-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">-- Procuro por --</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Viagem Económica</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Viagem Intermediária</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Viagem de Luxo</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"selector\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"full-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">-- Quero --</option>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Descanso e Relax</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Festas e Vida Noturna</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Gastronomia e Culinária</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Romance</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Compras</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Diversão e Aventura</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">História, Arte e Cultura</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Ecoturismo e Esportes</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Parques Tematicos e Entretenimento</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"selector\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"full-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">-- Prefiro --</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Calor</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Frio</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Neve</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"selector\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"full-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">-- Adoro --</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Praia</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Campo</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Montanha</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Cidades e Grandes Centros Urbanos</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"selector\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"full-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">-- Tiro --</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2 pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>&nbsp;</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"full-width icon-check\">SERACH NOW</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Popuplar Destinations -->\r\n");
      out.write("\t<div class=\"destinations section\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h2>Explore Mais Destinos</h2>\r\n");
      out.write("\t\t\t<div class=\"row image-box style1 add-clearfix\">\t\t\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container section\">\r\n");
      out.write("\t\t<h2>Ultimas do Blog</h2>\r\n");
      out.write("\t\t<div class=\"row image-box style4\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t<article class=\"box animated\" data-animation-type=\"fadeInLeft\"\r\n");
      out.write("\t\t\t\t\tdata-animation-delay=\"0\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<a title=\"\" href=\"#\" class=\"hover-effect\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/370x172\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t<div class=\"details\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"box-title\">Get Attractions</h4>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"goto-detail\" href=\"#\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-arrow-right\"></span></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</article>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t<article class=\"box animated\" data-animation-type=\"fadeInLeft\"\r\n");
      out.write("\t\t\t\t\tdata-animation-delay=\"0.3\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<a title=\"\" href=\"#\" class=\"hover-effect\"><img width=\"370\"\r\n");
      out.write("\t\t\t\t\t\t\theight=\"172\" alt=\"\" src=\"http://placehold.it/370x172\"></a>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t<div class=\"details\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"box-title\">Travel Hot Deals</h4>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"goto-detail\" href=\"#\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-arrow-right\"></span></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</article>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t<article class=\"box animated\" data-animation-type=\"fadeInLeft\"\r\n");
      out.write("\t\t\t\t\tdata-animation-delay=\"0.6\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<a title=\"\" href=\"#\" class=\"hover-effect\"><img width=\"370\"\r\n");
      out.write("\t\t\t\t\t\t\theight=\"172\" alt=\"\" src=\"http://placehold.it/370x172\"></a>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t<div class=\"details\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"box-title\">Travelers Stories</h4>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"goto-detail\" href=\"#\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-arrow-right\"></span></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</article>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /site/template/tp_01/index.jsp(13,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("destinationHighlight");
    // /site/template/tp_01/index.jsp(13,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/site/template/tp_01/index.jsp(13,3) '${destinationHightlightList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${destinationHightlightList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<div class=\"col-sms-6 col-sm-6 col-md-3\">\r\n");
          out.write("\t\t\t\t\t<article class=\"box\">\r\n");
          out.write("\t\t\t\t\t\t<figure class=\"animated\" data-animation-type=\"fadeInDown\" data-animation-delay=\"0\">\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/destinationDetail/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${destinationHighlight.idDestination}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"hover-effect\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<img width=\"270\" height=\"160\" alt=\"\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/image/destination/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${destinationHighlight.dtName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t</figure>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"details text-center\">\r\n");
          out.write("\t\t\t\t\t\t\t<h4 class=\"box-title\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</h4>\r\n");
          out.write("\t\t\t\t\t\t\t<p class=\"offers-content\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${destinationHighlight.country.countryName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</article>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /site/template/tp_01/index.jsp(23,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${destinationHighlight.dtName}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /site/template/tp_01/index.jsp(142,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("d");
    // /site/template/tp_01/index.jsp(142,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/site/template/tp_01/index.jsp(142,3) '${destinationAppearInWebSiteList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${destinationAppearInWebSiteList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<div class=\"col-sms-6 col-sm-6 col-md-3\">\r\n");
          out.write("\t\t\t\t\t<article class=\"box\">\r\n");
          out.write("\t\t\t\t\t\t<figure class=\"animated\" data-animation-type=\"fadeInDown\" data-animation-duration=\"1\">\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/destinationDetail/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${d.idDestination}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/image/destination/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${d.dtName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" width=\"270\"height=\"160\" />\r\n");
          out.write("\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t</figure>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"details\">\r\n");
          out.write("\t\t\t\t\t\t\t<h4 class=\"box-title\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"hotel-detailed.html\">");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("<small>");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("</small></a>\r\n");
          out.write("\t\t\t\t\t\t\t</h4>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</article>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /site/template/tp_01/index.jsp(152,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${d.dtName}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /site/template/tp_01/index.jsp(152,74) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${d.country.countryName}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }
}
