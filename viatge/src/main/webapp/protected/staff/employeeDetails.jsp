<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!-- CONTENT -->
<!--TITLE -->
<div class="row">
	<div id="paper-top">
		<div class="col-sm-12">
			<!-- TITULO DA PÁGINA -->
			<h2 class="tittle-content-header">
				<i class="icon-menu"></i> <span>Funcionário</span>
			</h2>
		</div>
	</div>
</div>
<!--/ TITLE -->

<!-- BREADCRUMB -->
<ul id="breadcrumb">
	<li><span class="entypo-home"></span></li>
	<li><i class="fa fa-lg fa-angle-right"></i></li>
	<li><a href="#" title="Sample page 1">Página Inicial</a></li>
	<li><i class="fa fa-lg fa-angle-right"></i></li>
	<li><a href="#" title="Sample page 1">Visualizar Cadastro</a></li>
</ul>
<!-- FIM BREADCRUMB -->

<div class="content-wrap margin-bottom width-fixid-fluida">
	<div class="row-cols novo-atendimento">

		<div class="col-sm-12 margin-bottom ">
		 <a href='<c:url value="/auth/employee/chart/${staff.id}"></c:url>' class="btn btn-primary">Metas de Vendas</a>
		</div>

		<div class="col-sm-8">

			<div class="nest text margin-bottom">
				<div class="title-alt">
					<h6>Dados Do Funcionário</h6>
					<input id="ajax-url" type="hidden" value="${pageContext.request.contextPath}/auth/employee/upload/${staff.id}"/>
					<div class="pull-right title-btn">
						<a href='<c:url value="/auth/employee/edit/${staff.id}"></c:url>' class="btn btn-info">
							<span class="fontawesome-edit"></span>
							 Editar Dados
						</a>
					</div>
				</div>

				<div class="col-sm-2">
					<form id="avatar-form" method="post" enctype="multipart/form-data">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
						<figure class="foto-user">			
							<c:choose>
								<c:when test="${staff.avatar}">
									<img id="avatar-img" src="${pageContext.request.contextPath}/image/avatar/${staff.id}/avatar-${staff.id}.jpg">
								</c:when>
								<c:otherwise>
									<img id="avatar-img" src="https://s3-sa-east-1.amazonaws.com/joocebox-media/static-images/user-128.jpg">
								</c:otherwise>	
							</c:choose>
							<span class="entypo-pencil">
								<input id="fileupload" type="file" name="file[]">
							</span>
						</figure>
					</form>
				</div>

				<div class="col-sm-10 dados-funcionario">
					<p>
						<span class="entypo-vcard"></span> <strong><c:out value="${staff.firstName} ${staff.lastName}"></c:out></strong>
					</p>
					<p>
						<span class="fontawesome-tags"></span> Função: <c:out value="${staff.jobTitle}"></c:out>
					</p>
					<p>
						<span class="fontawesome-star"></span> Nascimento: <fmt:formatDate value="${staff.birthDate}"/>
					</p>
					<p>
						<c:choose>
                        	<c:when test="${staff.gender eq 'M'}">
								<span class="maki-toilet"></span> Sexo: Masculino
							</c:when>
							<c:when test="${staff.gender eq 'F'}">
								<span class="maki-toilet"></span> Sexo: Feminino
							</c:when>
						</c:choose>
					</p>
					<p>
						<span class="entypo-phone"></span> Residencial: <c:out value="${staff.contact.homePhone}"></c:out>
					</p>
					<p>
						<span class="entypo-mobile"></span> Celular: <c:out value="${staff.contact.celPhone}"></c:out>
					</p>
					<p>
						<span class="fontawesome-envelope-alt"></span> <a
							href="mailto:<c:out value="${staff.login.email}"></c:out>"><c:out value="${staff.login.email}"></c:out></a>
					</p>
					<p>
						<c:choose>
							<c:when test="${staff.login.role eq 'ROLE_MASTER'}">
								<span class="entypo-monitor"></span> Acesso ao Sistema: Proprietario(a)
							</c:when>
							<c:when test="${staff.login.role eq 'ROLE_USER'}">
								<span class="entypo-monitor"></span> Acesso ao Sistema: Usúario(a)
							</c:when>
							<c:when test="${staff.login.role eq 'ROLE_ADMIN'}">
								<span class="entypo-monitor"></span> Acesso ao Sistema: Administrador(a)
							</c:when>
						</c:choose>						
					</p>
				</div>

			</div>

		</div>


		<!-- Meta -->
		<div class="col-sm-4">
			<div class=" order" id="memberClose">
				<div class="headline ">
					<h3>
						<span><i class="fa entypo-book-open"></i> &nbsp;&nbsp;Carta
							de Clientes</span>
					</h3>
				</div>
				<div class="value">
					<span><i class="entypo-book-open"></i></span>0<b>Clientes</b>
				</div>
				<div class="progress-tinny">
					<div style="width: 50%" class="bar"></div>
				</div>
				<div class="profit-line">Valor de Carteira (Estimado): R$
					0,00 / Ano</div>
			</div>
		</div>
		<!-- fim meta -->

		<!-- Meta Atingidas -->
		<div class="col-sm-4">
			<div class=" revenue" id="memberClose">
				<div class="headline ">
					<h3>
						<span><i class="fa entypo-gauge"></i>&nbsp;&nbsp;META
							ATINGIDA</span>
					</h3>
				</div>
				<div class="value">
					<span><i class="entypo-gauge"></i></span>0<b>Em Negociação</b>
				</div>
				<div class="progress-tinny">
					<div style="width: 50%" class="bar"></div>
				</div>
				<div class="profit-line">Valor Estimado de Négócios: R$
					0,00</div>
			</div>
		</div>
		<!-- fim meta atingidas -->


		<div class="col-sm-12">

			<div class="nest text margin-bottom">
				<div class="title-alt">
					<h6>
						<a href="#" rel="dados-complementares" class="toggle-box">Metas
							de Vendas</a>
					</h6>
					<a href="#" rel="dados-complementares"
						class="icon-chevron-down toggle-box"></a>
				</div>

				<div class="body-nest" id="dados-complementares"
					style="display: none;">
					<div class="col-lg-6">
						<p>Meta Anual: R$900.000,00</p>
						<p>Meta Atigindo: R$500.000,00</p>
						<p>Meta Restante: R$400.000,00</p>
					</div>

					<div class="col-lg-6">

						% Ideal
						<div class="progress">
							<div class="progress-bar progress-bar-danger" role="progressbar"
								aria-valuenow="48" aria-valuemin="0" aria-valuemax="100"
								style="width: 48%">
								<span class="sr-only">48%</span>
							</div>
						</div>

						% Atingida
						<div class="progress">
							<div class="progress-bar progress-bar-success" role="progressbar"
								aria-valuenow="52" aria-valuemin="0" aria-valuemax="100"
								style="width: 52%">
								<span class="sr-only">52%</span>
							</div>
						</div>

					</div>

				</div>

			</div>

		</div>

	</div>
</div>