<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
    
</style>
<header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
      <a href="./" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
        <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>

        <span class="fs-4"><div class="col-3">
            <div class="logo">
                <img src="https://i.ibb.co/QKYzSSF/logo2-fw.png" alt="Logo corporativo">
            </div>
        </div></span>

      </a>

      <ul class="nav nav-pills">
        <li class="nav-item"><a href="./" class="nav-link active" aria-current="page">Inicio</a></li>
        <li class="nav-item"><a href="contacto" class="nav-link">Contacto</a></li>
        <li class="nav-item"><a href="login" class="nav-link">Login</a></li>
      </ul>
</header>
