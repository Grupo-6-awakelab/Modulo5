<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="en">

<head>


    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>APR - Asesoria</title>

    <!-- Custom fonts for this template-->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="https://startbootstrap.github.io/startbootstrap-sb-admin-2/css/sb-admin-2.min.css" rel="stylesheet">


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

					<h1>Crear Asesoria</h1>

					<div class="card mb-4">
						<div class="card-header">Rellene el formulario para crear
							una nueva asesoria</div>
						<div class="card-body">
							<form>
								<div class="form-group">
									<div class="form-group">
										<label for="nombre">Nombre</label> <input type="text"
											class="form-control" id="nombre"
											placeholder="Nombre de la asesoria">
									</div>
								</div>

								<div class="form-group">
									<label for="nombre">Detalle de la asesoria</label>
									<textarea class="form-control" id="detalle" rows="3"></textarea>
								</div>
							</form>
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
						
						 
					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

                <!-- Footer -->
             <jsp:include page="snippet/footer_dos.jsp"></jsp:include>
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