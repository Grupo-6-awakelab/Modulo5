<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  
<style>
    .logo {
        display: flex;
        align-items: center;
        justify-content: center;
        margin: 20px 0;
    }
    .logo img {
        max-width: 200px; /* Ajusta el tamaño de la imagen según tus necesidades */
    }
   
  .navbar {
    position: relative;
    z-index: 1;
  }

</style>

 
<header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
      <a href="./" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
        <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>

        <span class="fs-4"><div class="col-3">
            <div class="logo">
                <img src="https://i.ibb.co/Jqk4vgQ/logo2-fw.png" alt="Logo corporativo">
            </div>
        </div></span>

      </a>
  <!--
      <ul class="nav nav-pills">
        <li class="nav-item"><a href="./" class="nav-link active" aria-current="page">Inicio</a></li>
        <li class="nav-item" ><a href="consulta" class="nav-link">Contacto</a></li>
        <li class="nav-item" ><a href="login"  class="nav-link">Login</a></li>
      </ul>
       -->
      
      <!-- menu colapsed -->
<nav class="navbar navbar-expand-lg bg-light" style="height: 50px;">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="./" style="color: #00a8e8;">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="consulta" style="color: #00a8e8;">Contacto</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="login" style="color: #00a8e8;">Dashboard</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login" style="color: #00a8e8;">Login</a>
        </li>
       </ul>
    </div>
  </div>
</nav>

</header>
