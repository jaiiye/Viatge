/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2015-04-30 21:01:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.public_.landing;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Wizard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\n");
      out.write("\n");
      out.write("$(function (){\n");
      out.write("       \n");
      out.write("    var form = $(\"#example-form\");\n");
      out.write("    form.validate({\n");
      out.write("        errorPlacement: function errorPlacement(error, element) { element.before(error); },\n");
      out.write("        rules: {\n");
      out.write("            confirm: {\n");
      out.write("                equalTo: \"#password\"\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        messages: {\n");
      out.write("            agencyName: \"Digite o Nome Fantasia\",\n");
      out.write("            agencyCNPJ: \"Digite o CNPJ\",\n");
      out.write("            agencyPhone: \"Digite o Telefone\",\n");
      out.write("            firstName: \"Digite seu Nome\",\n");
      out.write("            lastName: \"Digite seu Sobrenome\",\n");
      out.write("            password: \"Digite sua Senha de acesso!\",\n");
      out.write("            email: {\n");
      out.write("              required: \"Digite o seu Email\",\n");
      out.write("              email: \"Seu email estÃ¡ incorreto\"\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    form.children(\"div\").steps({\n");
      out.write("        headerTag: \"h3\",\n");
      out.write("        bodyTag: \"section\",\n");
      out.write("        transitionEffect: \"slideLeft\",\n");
      out.write("        onStepChanging: function (event, currentIndex, newIndex) {\n");
      out.write("            //form.validate().settings.ignore = \":disabled,:hidden\";\n");
      out.write("            //return form.valid();\n");
      out.write("            return true;\n");
      out.write("        }, onFinishing: function (event, currentIndex) {\n");
      out.write("            form.validate().settings.ignore = \":disabled\";\n");
      out.write("            \n");
      out.write("            $.blockUI({\n");
      out.write("                message: '<img src=\"https://s3-sa-east-1.amazonaws.com/joocebox-media/static-images/pre_loader_02.GIF\" /> <h1>Estamos criando a sua agência! Aguarde alguns minutos....</h1>',\n");
      out.write("\n");
      out.write("                css: {\n");
      out.write("                    border: 'none',\n");
      out.write("                    padding: '15px',\n");
      out.write("                    backgroundColor: '#2692FE',\n");
      out.write("                        '-webkit-border-radius': '10px',\n");
      out.write("                        '-moz-border-radius': '10px',\n");
      out.write("                    opacity: .9,\n");
      out.write("                    color: '#fff'\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            return form.valid();\n");
      out.write("        }, onFinished: function (event, currentIndex) {\n");
      out.write("            form.submit();\n");
      out.write("        },\n");
      out.write("        labels: {\n");
      out.write("            cancel: \"Cancelar\",\n");
      out.write("            current: \"current step:\",\n");
      out.write("            pagination: \"Pagination\",\n");
      out.write("            finish: \"Criar Minha Agência!\",\n");
      out.write("            next: \"Próximo\",\n");
      out.write("            previous: \"Anterior\",\n");
      out.write("            loading: \"Loading ...\"\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("});\n");
      out.write("\n");
      out.write("$(function(){\n");
      out.write("\t\n");
      out.write("    $('#agencyCNPJ').mask(\"99.999.999/9999-99\");\n");
      out.write("    \n");
      out.write("    jQuery('#agencyPhone').mask(\"(99) 9999-9999?9\").ready(function(event) {\n");
      out.write("        var target, element;\n");
      out.write("        element = $(target);\n");
      out.write("        element.mask(\"(99) 99999-999?9\");\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(function() {\n");
      out.write("    $(\"div#myDropZone\").dropzone({\n");
      out.write("        url: \"/viatge/register/upload?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\",\n");
      out.write("        autoProcessQueue: true,\n");
      out.write("        uploadMultiple: false,\n");
      out.write("        parallelUploads: 1,\n");
      out.write("        maxFilesize: 10,\n");
      out.write("        maxFiles: 1,\n");
      out.write("        acceptedFiles: \"image/png\",\n");
      out.write("        dictDefaultMessage: \"Upload\",\n");
      out.write("        dictRemoveFile: \"Remover\",\n");
      out.write("        dictInvalidFileType: \"Tipo de Arquivo Invalido\",\n");
      out.write("        dictFileTooBig: \"Arquivo grande demais. Selecione outro atÃ© 5mb\",\n");
      out.write("        dictResponseError: \"Servidor fora do ar. Contacte o administrador de sistemas\",\n");
      out.write("        dictMaxFilesExceeded: \"O limite de imagens excedeu!\",\n");
      out.write("        addRemoveLinks: true,\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    Dropzone.autoDiscover = false;\n");
      out.write("    Dropzone.options.myAwesomeDropzone = false;\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form id=\"example-form\" method=\"post\" action=\"./populateAgency?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <h3>DADOS</h3>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <header>\n");
      out.write("                <h1>Preencha os campos abaixo:</h1>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("            <div style=\"float: left;\">\n");
      out.write("\n");
      out.write("                <H2>Dados da Agência</H2>\n");
      out.write("\n");
      out.write("\t\t\t\t<label for=\"agencyName\">Nome Fantasia *</label>\n");
      out.write("                 <input id=\"agencyName\" name=\"agencyName\" type=\"text\" class=\"required form-control\">\n");
      out.write("\n");
      out.write("                <label for=\"agencyCNPJ\">CNPJ *</label>\n");
      out.write("                <input id=\"agencyCNPJ\" name=\"agencyCNPJ\" type=\"text\" class=\"required form-control\">\n");
      out.write("                \n");
      out.write("                <label for=\"agencyPhone\">Telefone*</label>\n");
      out.write("                <input id=\"agencyPhone\" name=\"agencyPhone\" type=\"text\" class=\"required form-control\" data-mask=\"(99) 9999-99999\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div style=\"float: right;\">\n");
      out.write("                <H2>Dados Pessoais</H2>\n");
      out.write("                \n");
      out.write("                <label for=\"firstName\">Nome *</label>\n");
      out.write("                <input id=\"firstName\" name=\"firstName\" type=\"text\" class=\"required form-control\">\n");
      out.write("                \n");
      out.write("                <label for=\"lastName\">Sobrenome *</label>\n");
      out.write("                <input id=\"lastName\" name=\"lastName\" type=\"text\" class=\"required form-control\">\n");
      out.write("                \n");
      out.write("                <label for=\"email\">Email *</label>\n");
      out.write("                <input id=\"email\" name=\"email\" type=\"text\" class=\"required form-control\">\n");
      out.write("                 \n");
      out.write("                <label for=\"password\">Senha*</label>\n");
      out.write("                <input id=\"password\" name=\"password\" type=\"password\" class=\"required form-control\">\n");
      out.write("\n");
      out.write("                <label for=\"confirm\">Confirme a senha *</label>\n");
      out.write("                <input id=\"confirm\" name=\"confirm\" type=\"password\" class=\"required form-control\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br clear=\"all\" />\n");
      out.write("\n");
      out.write("            <p><b>(*) Obrigatórios</b></p>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <h3>LOGOMARCA</h3>\n");
      out.write("        \n");
      out.write("        <section id=\"wrapper\">\n");
      out.write("            <header>\n");
      out.write("                <h1>Arraste dentro do quadrado abaixo sua logo:</h1>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"nest\" id=\"DropZoneClose\">\n");
      out.write("                    <div class=\"body-nest\" id=\"DropZone\">\n");
      out.write("                        <div id=\"myDropZone\" class=\"dropzone\"></div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <h3>COR</h3>\n");
      out.write("        \n");
      out.write("        <section id=\"section-color\">\n");
      out.write("            <header>\n");
      out.write("                <h1>Selecione uma cor a partir da sua logo para defini-la como a cor de seu website:</h1>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("\t\t\t<div id=\"insertcolor\">\n");
      out.write("\t\t\t\t<input style=\"float: left;\" id=\"uploadImage\" type=\"file\" name=\"myPhoto\" onchange=\"loadImageFile();\"/>\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"showImage\" onclick=\"myFunction()\" class=\"btn btn-primary\" style=\"margin-left: 144px;\">Mostrar Imagem</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div style=\"width: 622px; height: 302px; position: relative; background-color: #EEE;\">\n");
      out.write("\t\t\t\t<canvas id=\"myCanvas\" width=\"470\" height=\"300\" style=\"border: 1px solid #d3d3d3; position: absolute; left: 0; top: 0; z-index: 0;\">Your browser does not support the HTML5 canvas tag.</canvas>\n");
      out.write("\t\t\t\t<canvas id=\"pixCanvas\" width=\"150\" height=\"150\" style=\"border: 1px solid #d3d3d3; position: absolute; left: 470px; top: 0; z-index: 0;\">Your browser does not support the HTML5 canvas tag.</canvas>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div id=\"barvadiv\" style=\"border: 25px solid #d3d3d3; height: 100px; width: 102px; background-color: #d3d3d3; position: absolute; left: 470px; top: 152px; z-index: 0;\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div id=\"insertcolor\" style=\"width: 612px; font-size: 14px;\">\n");
      out.write("\t\t\t\t<b>O Código da cor selecionada é: </b><input type=\"text\" maxlength=\"7\" id=\"templateColor\" name=\"templateColor\" style=\"font-size: 20px; width: 100px;\" readonly class=\"form-control\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<img id=\"slika\"\n");
      out.write("\t\t\t\tsrc=\"data:image/svg+xml,%3C%3Fxml%20version%3D%221.0%22%3F%3E%0A%3Csvg%20width%3D%22153%22%20height%3D%22153%22%20xmlns%3D%22http%3A//www.w3.org/2000/svg%22%3E%0A%20%3Cg%3E%0A%20%20%3Ctitle%3ENo%20image%3C/title%3E%0A%20%20%3Crect%20id%3D%22externRect%22%20height%3D%22150%22%20width%3D%22150%22%20y%3D%221.5%22%20x%3D%221.500024%22%20stroke-width%3D%223%22%20stroke%3D%22%23666666%22%20fill%3D%22%23e1e1e1%22/%3E%0A%20%20%3Ctext%20transform%3D%22matrix%286.66667%2C%200%2C%200%2C%206.66667%2C%20-960.5%2C%20-1099.33%29%22%20xml%3Aspace%3D%22preserve%22%20text-anchor%3D%22middle%22%20font-family%3D%22Fantasy%22%20font-size%3D%2214%22%20id%3D%22questionMark%22%20y%3D%22181.249569%22%20x%3D%22155.549819%22%20stroke-width%3D%220%22%20stroke%3D%22%23666666%22%20fill%3D%22%23000000%22%3E%3F%3C/text%3E%0A%20%3C/g%3E%0A%3C/svg%3E\"\n");
      out.write("\t\t\t\talt=\"Image preview\" style=\"display: none\" />\n");
      out.write("\n");
      out.write("\t\t</section>\n");
      out.write("        \n");
      out.write("        <h3>MODELO</h3>\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            <header>\n");
      out.write("                <h1>Selecione o modelo de seu website a partir das imagens abaixo:</h1>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("            <div class=\"container\">               \n");
      out.write("                <div style=\"float: left; width: 120px;\">\n");
      out.write("                    <label for=\"template1\">                      \n");
      out.write("                        <a href=\"javascript:window.open('http://www.freewebsitetemplates.com/preview/tourismsurfing/index.html','_blank');\" target=\"_blank\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/templates/thumbs/thumb2.png\" width=\"80\" height=\"80\" style=\"margin-right: 25px;\"/></a>\n");
      out.write("                        <br />\n");
      out.write("                        Tema Padrão Joocebox 1\n");
      out.write("                    </label>\n");
      out.write("                    <input id=\"template1\" name=\"siteTemplate\" value=\"1\" type=\"radio\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <p>Você poderá alterar o modelo escolhido depois, assim como ter acesso a mais opções.\n");
      out.write("                        \n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar ev = 0;\n");
      out.write("\tvar cnvHeight;\n");
      out.write("\tvar cnvWidth;\n");
      out.write("\tvar mousePos;\n");
      out.write("\tvar c;\n");
      out.write("\tvar ctx;\n");
      out.write("\tvar cPix;\n");
      out.write("\tvar ctxPix;\n");
      out.write("\tvar img;\n");
      out.write("\tvar imgHeight;\n");
      out.write("\tvar imgWidth;\n");
      out.write("\n");
      out.write("\t\t\toFReader = new FileReader(),\n");
      out.write("\t\t\trFilter = /^(?:image\\/bmp|image\\/cis\\-cod|image\\/gif|image\\/ief|image\\/jpeg|image\\/jpeg|image\\/jpeg|image\\/pipeg|image\\/png|image\\/svg\\+xml|image\\/tiff|image\\/x\\-cmu\\-raster|image\\/x\\-cmx|image\\/x\\-icon|image\\/x\\-portable\\-anymap|image\\/x\\-portable\\-bitmap|image\\/x\\-portable\\-graymap|image\\/x\\-portable\\-pixmap|image\\/x\\-rgb|image\\/x\\-xbitmap|image\\/x\\-xpixmap|image\\/x\\-xwindowdump)$/i;\n");
      out.write("\n");
      out.write("\toFReader.onload = function(oFREvent) {\n");
      out.write("\t\tdocument.getElementById(\"slika\").src = oFREvent.target.result;\n");
      out.write("\t};\n");
      out.write("\n");
      out.write("\tfunction loadImageFile() {\n");
      out.write("\t\tif (document.getElementById(\"uploadImage\").files.length === 0) {\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tvar oFile = document.getElementById(\"uploadImage\").files[0];\n");
      out.write("\t\tif (!rFilter.test(oFile.type)) {\n");
      out.write("\t\t\talert(\"Você Precisa selecionar um imagem!\");\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\toFReader.readAsDataURL(oFile);\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tvar onclickListener = function(evt) {\n");
      out.write("\t\timageData = ctxPix.getImageData(0, 0, 150, 150);\n");
      out.write("\t\tvar barva = '#' + d2h(imageData.data[45300 + 0])\n");
      out.write("\t\t\t\t+ d2h(imageData.data[45300 + 1])\n");
      out.write("\t\t\t\t+ d2h(imageData.data[45300 + 2]);\n");
      out.write("\t\tdocument.getElementById(\"templateColor\").value = barva;\n");
      out.write("\t\tdocument.getElementById(\"templateColor\").select();\n");
      out.write("\t\tdocument.getElementById(\"barvadiv\").style.backgroundColor = barva;\n");
      out.write("\t\tistat = !istat;\n");
      out.write("\t};\n");
      out.write("\n");
      out.write("\tfunction myFunction() {\n");
      out.write("\t\tistat = true;\n");
      out.write("\t\tcnvWidth = 470;\n");
      out.write("\t\tcnvHeight = 300;\n");
      out.write("\n");
      out.write("\t\tc = document.getElementById(\"myCanvas\");\n");
      out.write("\t\tctx = c.getContext(\"2d\");\n");
      out.write("\n");
      out.write("\t\tcPix = document.getElementById(\"pixCanvas\");\n");
      out.write("\t\tctxPix = cPix.getContext(\"2d\");\n");
      out.write("\n");
      out.write("\t\tctxPix.mozImageSmoothingEnabled = false;\n");
      out.write("\t\tctxPix.webkitImageSmoothingEnabled = false;\n");
      out.write("\n");
      out.write("\t\timg = document.getElementById(\"slika\");\n");
      out.write("\t\timgHeight = img.height;\n");
      out.write("\t\timgWidth = img.width;\n");
      out.write("\n");
      out.write("\t\tif (imgHeight < cnvHeight && imgWidth < cnvWidth) {\n");
      out.write("\t\t\tctx.mozImageSmoothingEnabled = false;\n");
      out.write("\t\t\tctx.webkitImageSmoothingEnabled = false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif ((imgWidth / imgHeight) < 1.56667) {\n");
      out.write("\t\t\tcnvWidth = imgWidth / imgHeight * cnvHeight;\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tcnvHeight = cnvWidth / (imgWidth / imgHeight);\n");
      out.write("\t\t}\n");
      out.write("\t\tctx.clearRect(0, 0, c.width, c.height);\n");
      out.write("\t\tctx.drawImage(img, 0, 0, cnvWidth, cnvHeight);\n");
      out.write("\n");
      out.write("\t\tvar onmoveListener = function(evt) {\n");
      out.write("\t\t\tev = 1;\n");
      out.write("\t\t\tif (istat) {\n");
      out.write("\t\t\t\tmousePos = getMousePos(c, evt);\n");
      out.write("\t\t\t\tdrawPix(cPix, ctxPix, img, Math.round(mousePos.x\n");
      out.write("\t\t\t\t\t\t* (imgWidth / cnvWidth)), Math.round(mousePos.y\n");
      out.write("\t\t\t\t\t\t* (imgHeight / cnvHeight)));\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t\tc.addEventListener('mousemove', onmoveListener, false);\n");
      out.write("\t\tc.addEventListener('mousedown', onclickListener, false);\n");
      out.write("\n");
      out.write("\t\tvar onMiniclickListener = function(evt) {\n");
      out.write("\t\t\tmousePos = getMousePos(cPix, evt);\n");
      out.write("\t\t\timageData = ctxPix.getImageData(0, 0, 150, 150);\n");
      out.write("\t\t\tvar loc = Math.round(mousePos.y) * 600 + Math.round(mousePos.x) * 4;\n");
      out.write("\t\t\tvar barva = '#' + d2h(imageData.data[loc + 0])\n");
      out.write("\t\t\t\t\t+ d2h(imageData.data[loc + 1])\n");
      out.write("\t\t\t\t\t+ d2h(imageData.data[loc + 2]);\n");
      out.write("\t\t\tdocument.getElementById(\"templateColor\").value = barva;\n");
      out.write("\t\t\tdocument.getElementById(\"templateColor\").select();\n");
      out.write("\t\t\tdocument.getElementById(\"barvadiv\").style.backgroundColor = barva;\n");
      out.write("\t\t};\n");
      out.write("\t\tcPix.addEventListener('mousedown', onMiniclickListener, false);\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction drawPix(cPix, ctxPix, img, x, y) {\n");
      out.write("\t\tctxPix.clearRect(0, 0, cPix.width, cPix.height);\n");
      out.write("\t\tif (x < 5)\n");
      out.write("\t\t\tx = 5;\n");
      out.write("\t\tif (y < 5)\n");
      out.write("\t\t\ty = 5;\n");
      out.write("\t\tif (x > imgWidth - 4)\n");
      out.write("\t\t\tx = imgWidth - 4;\n");
      out.write("\t\tif (y > imgHeight - 4)\n");
      out.write("\t\t\ty = imgHeight - 4;\n");
      out.write("\t\tctxPix\n");
      out.write("\t\t\t\t.drawImage(img, x - 5, y - 5, 9, 9, 0, 0, cPix.width,\n");
      out.write("\t\t\t\t\t\tcPix.height);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction getMousePos(canvas, evt) {\n");
      out.write("\t\tvar rect = canvas.getBoundingClientRect();\n");
      out.write("\t\treturn {\n");
      out.write("\t\t\tx : evt.clientX - rect.left,\n");
      out.write("\t\t\ty : evt.clientY - rect.top\n");
      out.write("\t\t};\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction d2h(d) {\n");
      out.write("\t\treturn (\"0\" + d.toString(16)).slice(-2).toUpperCase();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction greenbox(c, x, y) {\n");
      out.write("\t\tc.beginPath();\n");
      out.write("\t\tc.rect(x - 5, y - 5, 9, 9);\n");
      out.write("\t\tc.lineWidth = 1;\n");
      out.write("\t\tc.strokeStyle = '#00FF00';\n");
      out.write("\t\tc.stroke();\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".form-control {\n");
      out.write("    background-color: #FFFFFF;\n");
      out.write("    background-image: none;\n");
      out.write("    border: 1px solid !important;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-shadow: none !important;\n");
      out.write("    color: #9EA7B3 !important;\n");
      out.write("    font-size: 13px !important;\n");
      out.write("    height: 37px !important;\n");
      out.write("\tpadding:0px 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control:focus {\n");
      out.write("    border-color:#45B6B0!important;\n");
      out.write("    outline: 0;\n");
      out.write("    -webkit-box-shadow: none!important;\n");
      out.write("    box-shadow: none!important;\n");
      out.write("}\n");
      out.write("</style>");
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
