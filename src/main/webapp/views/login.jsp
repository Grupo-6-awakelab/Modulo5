<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style type="text/css">
  <%@include file="/css/style.css" %>
</style>


</head>
<body >
<div class="container">


<main class="form-signin w-100 m-auto">
  <form action="login" method="post">
    
    <h1 class="h3 mb-3 fw-normal">Ingrese sus credenciales</h1>

    <div class="form-floating">
      <input type="text" class="form-control" id="username" name="username" placeholder="Ingrese usuario">
      <label for="username">Usuario</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="password" name="password" placeholder="Password">
      <label for="password">Clave</label>
    </div>

    <div class="form-check text-start my-3">
      <input class="form-check-input" type="checkbox" value="remember-me" id="flexCheckDefault">
      <label class="form-check-label" for="flexCheckDefault">
        Recordar
      </label>
    </div>
    <button class="btn btn-primary w-100 py-2" style="margin-bottom: 30px;" type="submit">Ingresar</button>
    
    <a class="btn btn-primary w-100 py-2" href="<%=request.getContextPath()%>/">Volver</a>
    <p class="mt-5 mb-3 text-body-secondary"></p>
  </form>
</main>


<jsp:include page="snippet/footer_dos.jsp"></jsp:include>
</div>

<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>