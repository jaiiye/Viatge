<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
	<meta charset="utf-8">
    <title>JooceBox v1.0</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Le styles -->
    <script src="${pageContext.request.contextPath}/resources/js/wizard/lib/modernizr-2.6.2.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.js"></script>
    <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>
    
    <link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css"></link>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loader-style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    
    <!-- INICIO TABLE -->
    <link href="${pageContext.request.contextPath}/resources/js/footable/css/footable.core.css?v=2-0-1" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/resources/js/footable/css/footable.standalone.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/resources/js/footable/css/footable-demos.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/resources/js/dataTable/lib/jquery.dataTables/css/DT_bootstrap.css" rel="stylesheet" >
    <link href="${pageContext.request.contextPath}/resources/js/dataTable/css/datatables.responsive.css" rel="stylesheet">
    <!-- FIM TABLE -->
    
    <!-- INICIO FORMULÁRIO -->
    <link href="${pageContext.request.contextPath}/resources/js/iCheck/flat/all.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/js/iCheck/line/all.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/js/colorPicker/bootstrap-colorpicker.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/js/switch/bootstrap-switch.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/js/validate/validate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/js/idealform/css/jquery.idealforms.css" rel="stylesheet">
    <!-- FIM FORMULÁRIO -->
    
    <!-- Inicio do Wizard -->
    <link href="${pageContext.request.contextPath}/resources/js/wizard/css/jquery.steps.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/js/wizard/jquery.stepy.css" type="text/css" rel="stylesheet"  >
    <link href="${pageContext.request.contextPath}/resources/js/tabs/acc-wizard.min.css" rel="stylesheet">
    <!-- Fim do Wizard -->
    
    <!-- INICIO REDE SOCIAL -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/social.css">
	<!-- FIM REDE SOCIAL -->
    
    <!-- INICIO MÍDIA -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/media.css">
    <!-- FIM REDE MÍDIA -->
    
    <!-- INICIO dropZone -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/dropZone/downloads/css/dropzone.css">
    <!-- FIM REDE dropZone -->
    
    <!-- INICIO EXTRA -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/extra-pages.css">
    <!-- FIM EXTRA -->
    
    <!-- INICIO DATE PICKER -->
    <link href="${pageContext.request.contextPath}/resources/js/colorPicker/bootstrap-colorpicker.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/js/validate/validate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/js/idealform/css/jquery.idealforms.css" rel="stylesheet">
    
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/timepicker/bootstrap-timepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/datepicker/datepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/datepicker/clockface.css">
    <!-- FIM DATE PICKER -->

    
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
    <!-- Fav and touch icons -->
    
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/ico/favicon.ico">
    
</head>

<body>

	<tiles:insertAttribute name="navbar" />

	<tiles:insertAttribute name="menu" />
	
	<div class="wrap-fluid">
		<div class="container-fluid paper-wrap bevel tlbr">
			<tiles:insertAttribute name="body" />

			<tiles:insertAttribute name="footer" />
		</div>
	</div>
	<!-- MAIN EFFECT -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/preloader.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/app.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/load.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/main.js"></script>
	    
    <!-- INICIO TABLE -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/toggle_close.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/footable/js/footable.js?v=2-0-1" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/footable/js/footable.sort.js?v=2-0-1" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/footable/js/footable.filter.js?v=2-0-1" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/footable/js/footable.paginate.js?v=2-0-1" type="text/javascript"></script>
    
    <!-- INICIO FORMULARIO -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/iCheck/jquery.icheck.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/switch/bootstrap-switch.js"></script>
    
    <!-- INICIO DATATIME -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/inputMask/jquery.maskedinput.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/timepicker/bootstrap-timepicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/datepicker/bootstrap-datepicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/datepicker/clockface.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/datepicker/bootstrap-datetimepicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/colorPicker/bootstrap-colorpicker.min.js"></script>
    
    <!-- INICIO MÍDIA -->
    <script src="${pageContext.request.contextPath}/resources/js/flatvideo/jquery.fitvids.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/dropZone/lib/dropzone.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/fileUpload/js/jquery.fileupload.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/fileUpload/js/jquery.iframe-transport.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/fileUpload/js/jquery.fileupload-jquery-ui.js"></script>
    
    <!-- Inicio do Wizard -->
	<script src="${pageContext.request.contextPath}/resources/js/wizard/lib/jquery.cookie-1.3.1.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/wizard/build/jquery.steps.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/wizard/jquery.stepy.js" type="text/javascript"></script>
    <!-- Fim do Wizard -->
    
    <script src="${pageContext.request.contextPath}/resources/js/ckeditor/ckeditor.js"  type="text/javascript"></script>
    
    <!-- Inicio Currency Plug-in -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery.maskMoney.js" type="text/javascript"></script>
    
    <!-- Inicio Date Format -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-dateFormat.min.js" type="text/javascript"></script>

	<!-- Funcionalidade de "Gestão de Equipes" -->
    <script src="${pageContext.request.contextPath}/resources/js/app-crm/staff.js" type="text/javascript"></script>

<script type="text/javascript">
$(function() {
	var winWrap = $(window).height() - 75;
	$('.paper-wrap').css('min-height', winWrap);
	
	//Mascaras da funcionalidade de Novo Atendimento
	$("#birthday").mask("99/99/9999");
	$("#residential-phone").mask("(99) 9999-9999");
	$("#mobile-telefone").mask("(99) 9999-9999");
	$("#work-telephone").mask("(99) 9999-9999");
	$("#cpf").mask("999.999.999-99");
	$("#rg").mask("9.999.999-9");
	
    $("#passenger-phone").mask("(99) 9999-9999");
    $("#passenger-birth").mask("99/99/9999");
    $("#passenger-rg").mask("9.999.999-9");
    $("#passenger-cpf").mask("999.999.999-99");
	
	//Controla o componente de "fechar e abrar" as div's
	$('.toggle-box').click( function(event){
		event.preventDefault();
		var idToggleBox = $(this).attr('rel');
		$('#'+idToggleBox).slideToggle(1000);
	});
	
	//Tabela
    $('.footable-res').footable();
	
    $('#footable-res2').footable().bind('footable_filtering', function(e) {
        var selected = $('.filter-status').find(':selected').text();
        if (selected && selected.length > 0) {
            e.filter += (e.filter && e.filter.length > 0) ? ' ' + selected : selected;
            e.clear = !e.filter;
        }
    });
    
	//Filtro
    $('.clear-filter').click(function(e) {
        e.preventDefault();
        $('.filter-status').val('');
        $('table.demo').trigger('footable_clear_filter');
    });

    $('.filter-status').change(function(e) {
        e.preventDefault();
        $('table.demo').trigger('footable_filter', {
            filter: $('#filter').val()
        });
    });

    $('.filter-api').click(function(e) {
        e.preventDefault();

        //get the footable filter object
        var footableFilter = $('table').data('footable-filter');

        alert('about to filter table by "tech"');
        //filter by 'tech'
        footableFilter.filter('tech');

        //clear the filter
        if (confirm('clear filter now?')) {
            footableFilter.clearFilter();
        }
    });
    
    //Inicia o componente de ckb e radio button
    $('.skin-flat input').iCheck({
        checkboxClass: 'icheckbox_flat-red',
        radioClass: 'iradio_flat-red'
    });
    
    $('.skin-line input').each(function() {
        var self = $(this),
            label = self.next(),
            label_text = label.text();

        label.remove();
        self.iCheck({
            checkboxClass: 'icheckbox_line-blue',
            radioClass: 'iradio_line-blue',
            insert: '<div class="icheck_line-icon"></div>' + label_text
        });
    });
    
    //Aplica o comportamento de "switch" nos ckb
    $('.make-switch').bootstrapSwitch('setSizeClass', 'switch-small');
    
	//MIDIA
    // Basic FitVids Test
    $(".well-media").fitVids();
	
	//Fechar(esconder) a div
    $('#toggle-btn').click(function(e) {
        e.stopPropagation();
        $('#t2').clockface('toggle');
    });
	
	//COLOR PICKER
	window.prettyPrint && prettyPrint();

	// Code for those demos
	var _createColorpickers = function() {
		$('#cp1').colorpicker({
			format: 'hex'
		});
		$('#cp2').colorpicker();
		$('#cp3').colorpicker();
		var bodyStyle = $('body')[0].style;
		$('#cp4').colorpicker().on('changeColor', function(ev) {
			bodyStyle.backgroundColor = ev.color.toHex();
		});
	};

	_createColorpickers();

	$('.bscp-destroy').click(function(e) {
		e.preventDefault();
		$('.bscp').colorpicker('destroy');
	});

	$('.bscp-create').click(function(e) {
		e.preventDefault();
		_createColorpickers();
	});
	
    //Inicia o Wizard
    $('#transition-duration-demo').stepy({
        duration: 400,
        transition: 'fade'
    });

});

</script>
    
</body>
</html>