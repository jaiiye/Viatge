<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!-- CONTENT -->
<!--TITLE -->
<div class="row">
	<div id="paper-top">
		<div class="col-sm-12">
			<!-- TITULO DA PÁGINA -->
			<h2 class="tittle-content-header">
				<i class="icon-menu"></i> <span>Gestão de Equipes</span>
			</h2>
		</div>
	</div>
</div>
<!--/ TITLE -->

<!-- BREADCRUMB -->
<ul id="breadcrumb">
	<li><span class="entypo-home"></span></li>
	<li><i class="fa fa-lg fa-angle-right"></i></li>
	<li><a href="${pageContext.request.contextPath}/auth/home"
		title="Página Inicial">Página Inicial</a></li>
	<li><i class="fa fa-lg fa-angle-right"></i></li>
	<li><a href="${pageContext.request.contextPath}/auth/staff"
		title="Listagem de Menbros da sua agência">Gestão de Equipes</a></li>
</ul>
<!-- FIM BREADCRUMB -->


<div class="content-wrap margin-bottom">
	<div class="row">

		<div class="nest text">
			<div class="nest" id="FilteringClose">
				<div class="title-alt">
					<h6>Gerenciar Equipes</h6>
				</div>

				<div class="body-nest" id="Filtering">
					<c:if test="${message != null}">
						<div class="alert alert-success">
							<span class="entypo-thumbs-up"></span> <strong>Legal!</strong>&nbsp;&nbsp;${message}
						</div>
					</c:if>
					<c:if test="${errorMessage != null}">
						<div class="alert alert-danger">
							<span class="entypo-attention"></span> <strong>Ops...!</strong>&nbsp;&nbsp;${errorMessage}
						</div>
					</c:if>
					<div class="row" style="margin-bottom: 10px;">
						<div class="col-sm-4">
							<input class="form-control" id="filter" placeholder="Procurar"
								type="text" />
						</div>

						<div class="col-sm-2">
							<!-- Filtro de Equipe (Compnente de Select) -->
						</div>

						<div class="col-sm-6">
							<a href="#clear" style="margin-left: 10px;"
								class="pull-right btn btn-info clear-filter"
								title="clear filter">Limpar Pesquisa</a> <a
								href="<c:url value="employee"/>" class="pull-right btn btn-info"
								title="Adicionar um Novo Destino">Novo Colaborador(a)</a>
						</div>
					</div>
				</div>
			</div>

			<div class="col-sm-12">
				<c:choose>
					<c:when test="${!empty listOfStaff}">
						<table id="footable-res2"
							class="table-striped footable-res footable metro-blue demo"
							data-filter="#filter" data-filter-text-only="true"
							data-page-size="15">
							<thead>
								<tr>
									<th>Nome do Colaborador</th>
									<th>Função</th>
									<th>Ativo</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listOfStaff}" var="ls">
									<tr>
										<td><a href="employee/view/${ls.id}">${ls.firstName} ${ls.lastName}</a>
										<td>${ls.professionalData.jobTitle}</td>
										<td>
											<div class="make-switch" data-on="primary" data-off="info">
												<c:choose>
													<c:when test="${ls.active}">
														<input type="checkbox" checked>
													</c:when>
													<c:otherwise>
														<input type="checkbox">
													</c:otherwise>
												</c:choose>
											</div>
										</td>
									</tr>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<td colspan="5">
										<div class="pagination pagination-centered"></div>
									</td>
								</tr>
							</tfoot>
						</table>
					</c:when>
					<c:otherwise>
						<div class="alert alert-info">
							<span class="entypo-info-circled"></span> <strong>Hummm!</strong>&nbsp;&nbsp;Parece
							que você ainda não possui nenhum colaborador(a) cadastrado,
							clique no botão <b>"Novo Colaborador"</b>
						</div>
					</c:otherwise>
				</c:choose>

			</div>

		</div>

	</div>
</div>