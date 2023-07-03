<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>APR - Asesoria</title>

<!-- Custom fonts for this template-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
	integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link
	href="https://startbootstrap.github.io/startbootstrap-sb-admin-2/css/sb-admin-2.min.css"
	rel="stylesheet">

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<jsp:include page="snippet/sidebar.jsp"></jsp:include>
		<!-- End Sidebar -->
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<jsp:include page="snippet/topbar.jsp"></jsp:include>

				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">
					<c:if test="${action == 'delete'}">
						<h6>La Asesoria ha sido eliminada correctamente</h6>
						
							<div class="row pt-4">
								<div class="col">
									<a href="administrarasesoria" class="btn btn-secondary">Volver</a>
								</div></div>
					</c:if>
					
					<c:if test="${action != 'delete'}">
						<form class="form" action="asesoria" method="POST">



							<div class="row">
								<div class="col">

									<label class="form-label" for="lastName">Nombre
										de la asesoria:</label>
									<c:if test="${action == 'read'}">
										<input class="form-control" type="text"
											value="${asesoria.getNombre()}" id="name" name="name"
											disabled>
									</c:if>
									<c:if test="${action == 'edit'}">
										<input class="form-control" type="text"
											value="${asesoria.getNombre()}" id="name" name="name">
									</c:if>
								</div>
							</div>

							<div class="row">
								<div class="col">
									<label class="form-label" for="address">Detalle
										de la asesoria:</label>
									<c:if test="${action == 'read'}">
										<textarea class="form-control" id="detalle" name="detalle"
											rows="3" disabled>${asesoria.getDetalle()}</textarea>
									</c:if>
									<c:if test="${action == 'edit'}">
										<textarea class="form-control" id="detalle" name="detalle"
											rows="3">${asesoria.getDetalle()}</textarea>
									</c:if>

								</div>
							</div>

							<div class="row pt-4">
								<div class="col">
									<a href="administrarasesoria" class="btn btn-secondary">Volver</a>
								</div>
								<div class="col">
									<c:if test="${action == 'edit'}">
										<button type="submit" class="btn btn-primary">Guardar</button>
									</c:if>
								</div>
							</div>
						</form>
					</c:if>

				</div>
				
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<jsp:include page="snippet/footer.jsp"></jsp:include>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Listo para
						salir?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Selecciona logout si quieres cerrar
					sesión.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="logout">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script
		src="https://startbootstrap.github.io/startbootstrap-sb-admin-2/vendor/jquery/jquery.min.js"></script>
	<script
		src="https://startbootstrap.github.io/startbootstrap-sb-admin-2/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="https://startbootstrap.github.io/startbootstrap-sb-admin-2/js/sb-admin-2.min.js/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script
		src="https://startbootstrap.github.io/startbootstrap-sb-admin-2/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script
		src="https://startbootstrap.github.io/startbootstrap-sb-admin-2/js/sb-admin-2.min.js/vendor/chart.js/Chart.min.js"></script>

	<!-- Page level custom scripts -->
	<script
		src="https://startbootstrap.github.io/startbootstrap-sb-admin-2/js/demo/chart-area-demo.js"></script>
	<script
		src="https://startbootstrap.github.io/startbootstrap-sb-admin-2/js/demo/chart-pie-demo.js"></script>

</body>

</html>