	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	
	
	
	<!DOCTYPE html>
	<html lang="en">
	
	<head>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>APR - Dashboard</title>
	
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
	
						<h1>Crear Usuario</h1>
	
						<div class="card mb-4">
							<div class="card-header">Rellene el formulario para crear un
								nuevo usuario</div>
							<div class="card-body">
	
								<form action="crearusuario" method="post" class="container">
									<div class="mb-3">
										<label for="nombre" class="form-label">Nombre:</label> <input
											type="text" id="nombre" name="nombre" class="form-control"
											required>
									</div>
	
									<div class="mb-3">
										<label for="username" class="form-label">Username:</label> <input
											type="text" id="username" name="username" class="form-control"
											required>
									</div>
	
									<div class="mb-3">
										<label for="password" class="form-label">Contraseña:</label> <input
											type="password" id="password" name="password"
											class="form-control" required>
									</div>
	
									<div class="mb-3">
										<label for="tipoUsuario" class="form-label">Tipo de
											Usuario:</label> <select id="tipoUsuario" name="tipoUsuario"
											class="form-control" disabled>
											<option value="">Seleccionar tipo de usuario</option>
											<option value="cliente">Cliente</option>
											<option value="profesional">Profesional</option>
											<option value="administrativo">Administrativo</option>
										</select>
									</div>
									<div id="camposCliente" style="display: none;">
										<div class="mb-3">
	
											<label for="nombrecliente" class="form-label">Nombre
												Cliente:</label> <input type="text" id="nombrecliente"
												name="nombrecliente" class="form-control">
										</div>
										<div class="mb-3">
	
											<label for="apellidocliente" class="form-label">Apellido del
											Cliente: </label> <input type="text" id="apellidocliente"
												name="apellidocliente" class="form-control">
										</div>
										<div class="mb-3">
	
											<label for="rut" class="form-label">RUT:</label> <input
												type="text" id="rut" name="rut" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="correo" class="form-label">Correo:</label> <input
												type="email" id="correo" name="correo" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="telefono" class="form-label">Teléfono:</label> <input
												type="text" id="telefono" name="telefono"
												class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="afp" class="form-label">AFP:</label> <input
												type="text" id="afp" name="afp" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="sistemaSalud" class="form-label">Sistema
												de Salud:</label> <select id="sistemaSalud" name="sistemaSalud"
												class="form-select">
												<option value="isapre">Isapre</option>
												<option value="fonasa">Fonasa</option>
											</select>
										</div>
	
										<div class="mb-3">
											<label for="direccion" class="form-label">Dirección:</label> <input
												type="text" id="direccion" name="direccion"
												class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="comuna" class="form-label">Comuna:</label> <input
												type="text" id="comuna" name="comuna" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="edad" class="form-label">Edad:</label> <input
												type="number" id="edad" name="edad" class="form-control">
										</div>
									</div>
	
									<div id="camposProfesional" style="display: none;">
										<div class="mb-3">
											<label for="runProfesional" class="form-label">RUN:</label> <input
												type="text" id="runProfesional" name="runProfesional"
												class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="correoProfesional" class="form-label">Correo:</label>
											<input type="email" id="correoProfesional"
												name="correoProfesional" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="telefonoProfesional" class="form-label">Teléfono:</label>
											<input type="text" id="telefonoProfesional"
												name="telefonoProfesional" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="cargo" class="form-label">Cargo:</label> <input
												type="text" id="cargo" name="cargo" class="form-control">
										</div>
									</div>
	
									<div id="camposAdministrativo" style="display: none;">
										<div class="mb-3">
											<label for="runAdministrativo" class="form-label">RUN:</label>
											<input type="text" id="runAdministrativo"
												name="runAdministrativo" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="correoAdministrativo" class="form-label">Correo:</label>
											<input type="email" id="correoAdministrativo"
												name="correoAdministrativo" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="telefonoAdministrativo" class="form-label">Teléfono:</label>
											<input type="text" id="telefonoAdministrativo"
												name="telefonoAdministrativo" class="form-control">
										</div>
	
										<div class="mb-3">
											<label for="area" class="form-label">Área:</label> <input
												type="text" id="area" name="area" class="form-control">
										</div>
									</div>
	
									<button type="submit" class="btn btn-primary">Registrar</button>
								</form>
	
							<script>
  var nombreInput = document.getElementById("nombre");
  var usernameInput = document.getElementById("username");
  var passwordInput = document.getElementById("password");
  var tipoUsuarioSelect = document.getElementById("tipoUsuario");
  var nombreClienteLabel = document.getElementById("nombrecliente");

  nombreInput.addEventListener('input', toggleTipoUsuarioSelect);
  usernameInput.addEventListener('input', toggleTipoUsuarioSelect);
  passwordInput.addEventListener('input', toggleTipoUsuarioSelect);

  function toggleTipoUsuarioSelect() {
    var nombre = nombreInput.value.trim();
    var username = usernameInput.value.trim();
    var password = passwordInput.value.trim();

    if (nombre !== '' && username !== '' && password !== '') {
      tipoUsuarioSelect.disabled = false;
    } else {
      tipoUsuarioSelect.disabled = true;
    }
  }

  tipoUsuarioSelect.addEventListener('change', function() {
    var selectedOption = tipoUsuarioSelect.options[tipoUsuarioSelect.selectedIndex].value;

    document.getElementById("camposCliente").style.display = "none";
    document.getElementById("camposProfesional").style.display = "none";
    document.getElementById("camposAdministrativo").style.display = "none";

    if (selectedOption === "cliente") {
      document.getElementById("camposCliente").style.display = "block";
    } else if (selectedOption === "profesional") {
      document.getElementById("camposProfesional").style.display = "block";
    } else if (selectedOption === "administrativo") {
      document.getElementById("camposAdministrativo").style.display = "block";
    }
  });

  document.querySelector('form').addEventListener('submit', function(event) {
    event.preventDefault();

 
  });
</script>
2
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