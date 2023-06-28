<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bienvenidos</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<jsp:include page="snippet/header.jsp"></jsp:include>
<!-- INICIO FORMULARIO -->
<section class="mb-4">

    <!--Section heading-->
    <h2 class="h1-responsive font-weight-bold text-center my-4">Contactanos!</h2>
    <!--Section description-->
    <p class="text-center w-responsive mx-auto mb-5">¿Tiene alguna pregunta? Por favor, no dude en contactarnos directamente. Nuestro equipo le responderá dentro de
        Cuestión de horas para ayudarte.</p>

    <div class="row justify-content-center">
        <!--Grid column-->
        <div class="col-md-9 mb-md-0 mb-5 form-container">
            <form id="contact-form" name="contact-form" action="mail.php" method="POST">
                <!--Grid row-->
                <div class="row">
                    <!--Grid column-->
                    <div class="col-md-6">
                        <div class="md-form mb-0">
                            <input type="text" id="name" name="name" class="form-control">
                            <label for="name" class="">Nombre</label>
                        </div>
                    </div>
                    <!--Grid column-->

                    <!--Grid column-->
                    <div class="col-md-6">
                        <div class="md-form mb-0">
                            <input type="text" id="email" name="email" class="form-control">
                            <label for="email" class="">Correo</label>
                        </div>
                    </div>
                    <!--Grid column-->

                </div>
                <!--Grid row-->

                <!--Grid row-->
                <div class="row">
                    <div class="col-md-12">
                        <div class="md-form mb-0">
                            <input type="text" id="subject" name="subject" class="form-control">
                            <label for="subject" class="">Asunto</label>
                        </div>
                    </div>
                </div>
                <!--Grid row-->

                <!--Grid row-->
                <div class="row">
                    <!--Grid column-->
                    <div class="col-md-12">
                        <div class="md-form">
                            <textarea type="text" id="message" name="message" rows="2" class="form-control md-textarea"></textarea>
                            <label for="message">Mensaje</label>
                        </div>
                    </div>
                </div>
                <!--Grid row-->
            </form>

            <div class="text-center text-md-left">
                <a class="btn btn-primary" onclick="document.getElementById('contact-form').submit();">Enviar</a>
            </div>
            <div class="status"></div>
        </div>
        <!--Grid column-->
    </div>

</section>
<!-- FIN FORMULARIO -->

<jsp:include page="snippet/footer.jsp"></jsp:include>
</div>

<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>