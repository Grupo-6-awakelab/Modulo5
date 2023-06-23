<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bienvenidos</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

</head>
<body>
	
		
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<style>
    .logo {
        display: flex;
        align-items: center;
        justify-content: center;
        margin: 20px 0;
    }
    .logo img {
        max-width: 200px; /* Ajusta el tama√±o de la imagen seg√∫n tus necesidades */
    }
    
    .welcome-box {
        margin-top: 20px;
        padding: 20px;
        text-align: center;
    }
</style>
</head>
<body>
<div class="container">
<jsp:include page="snippet/header.jsp"></jsp:include>
 <div class="row">
        
    <div class="row justify-content-center">
    <div class="col-md-8">
        <div class="welcome-box">
        
        
            <h1>°Bienvenidos a nuestra empresa asesora de prevenciÛn de riesgos!</h1>
            <p>En nuestra empresa, nos dedicamos a brindar asesoramiento especializado en prevenci√≥n de riesgos para garantizar la seguridad y bienestar de nuestros clientes. Nuestro objetivo principal es ayudar a las organizaciones a identificar, evaluar y controlar los riesgos presentes en sus actividades, con el fin de prevenir accidentes laborales, proteger la salud de los trabajadores y salvaguardar los activos de la empresa. Gracias por confiar en nosotros y esperamos poder servirle con excelencia en todo lo relacionado con la prevenci√≥n de riesgos!</p>
            <p>Atentamente, <br> El equipo de la empresa asesora de prevenciÛn de riesgos</p>
        </div>
    </div>
</div>


<jsp:include page="snippet/footer.jsp"></jsp:include>
</div>

		


	<script type="text/javascript"
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>