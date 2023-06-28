<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
	integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
/* Estilo personalizado para el footer */
.sticky-footer {
	position: fixed;
	bottom: 0;
	width: 1320px;
	background-color: #fff;
}

.sticky-footer .container {
	padding-top: 10px;
	padding-bottom: 10px;
}
</style>
<title>Bienvenidos</title>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

</head>
<body>


	<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<jsp:include page="snippet/header.jsp"></jsp:include>
		<div class="row">

			<div class="row justify-content-center">
				<div class="col-md-8">
					<div class="welcome-box">


						<center>
							<h1>¡Bienvenidos a nuestra empresa asesora de prevención de
								riesgos!</h1>
							<p>En nuestra empresa, nos dedicamos a brindar asesoramiento
								especializado en prevención de riesgos para garantizar la
								seguridad y bienestar de nuestros clientes. Nuestro objetivo
								principal es ayudar a las organizaciones a identificar, evaluar
								y controlar los riesgos presentes en sus actividades, con el fin
								de prevenir accidentes laborales, proteger la salud de los
								trabajadores y salvaguardar los activos de la empresa. Gracias
								por confiar en nosotros y esperamos poder servirle con
								excelencia en todo lo relacionado con la prevención de riesgos!</p>
							<p>
								Atentamente, <br> El equipo de la empresa asesora de
								prevención de riesgos
							</p>
						</center>
					</div>
				</div>
			</div>



		</div>
		<!-- Footer -->
		<footer class="text-center text-lg-start bg-light text-muted">
			<!-- Section: Social media -->
			<section
				class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
				<!-- Left -->
				<div class="me-5 d-none d-lg-block">
					<span>Get connected with us on social networks:</span>
				</div>
				<!-- Left -->

				<!-- Right -->
				<div>
					<a href="" class="me-4 text-reset"> <i
						class="fab fa-facebook-f"></i>
					</a> <a href="" class="me-4 text-reset"> <i class="fab fa-twitter"></i>
					</a> <a href="" class="me-4 text-reset"> <i class="fab fa-google"></i>
					</a> <a href="" class="me-4 text-reset"> <i
						class="fab fa-instagram"></i>
					</a> <a href="" class="me-4 text-reset"> <i class="fab fa-linkedin"></i>
					</a> <a href="" class="me-4 text-reset"> <i class="fab fa-github"></i>
					</a>
				</div>
				<!-- Right -->
			</section>
			<!-- Section: Social media -->

			<!-- Section: Links  -->
			<section class="">
				<div class="container text-center text-md-start mt-5">
					<!-- Grid row -->
					<div class="row mt-3">
						<!-- Grid column -->
						<div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
							<!-- Content -->
							<h6 class="text-uppercase fw-bold mb-4">
								<i class="fas fa-gem me-3"></i>APR
							</h6>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Nullam viverra, neque a pharetra accumsan, augue dolor
								ullamcorper tortor, eget imperdiet.</p>
						</div>
						<!-- Grid column -->





						<!-- Grid column -->
						<div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
							<!-- Links -->
							<h6 class="text-uppercase fw-bold mb-4">Contacto</h6>
							<p>
								<i class="fas fa-home me-3"></i> Chile
							</p>
							<p>
								<i class="fas fa-envelope me-3"></i> info@apr.cl
							</p>
							<p>
								<i class="fas fa-phone me-3"></i> +569 99999999
							</p>

						</div>
						<!-- Grid column -->
					</div>
					<!-- Grid row -->
				</div>
			</section>
			<!-- Section: Links  -->

			<!-- Copyright -->
			<div class="text-center p-4"
				style="background-color: rgba(0, 0, 0, 0.05);">
				© 2023 Copyright: <a class="text-reset fw-bold" href="/">apr.cl</a>
			</div>
			<!-- Copyright -->
		</footer>
		<!-- Footer -->
	</div>



	<script type="text/javascript"
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>