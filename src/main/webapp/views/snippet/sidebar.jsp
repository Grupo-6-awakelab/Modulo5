<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Sidebar -->
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="index.html">
		<div class="sidebar-brand-icon rotate-n-15">
<div class="logo">
                <img src="https://i.ibb.co/k9wdR2Y/mono-fw.png" alt="Logo corporativo">
            </div>
		</div>
		<div class="sidebar-brand-text mx-3">
		<span class="fs-4"><div class="col-3">
            <div class="logo">
                <img src="https://i.ibb.co/tx1v275/logo-mono-fw.png" alt="Logo corporativo" width="100">
            </div>
        </div></span> 
		</div>
		</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">
	
	<!-- Nav Item - Dashboard -->
	<li class="nav-item active"><a class="nav-link" href="dashboard">
			<i class="fas fa-fw fa-tachometer-alt"></i> <span>Inicio</span>
	</a></li>

	<!-- Divider -->
	<hr class="sidebar-divider">
 
	<!-- Heading -->
	<div class="sidebar-heading">Menú</div>

	<!-- Nav Item - Pages Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true"
		aria-controls="collapseTwo"><i
			class="fa-solid fa-person-chalkboard"></i><span>Capacitaciones</span>
	</a>
		<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Acciones</h6>
				<a class="collapse-item" href="crearcapacitacion">Crear Capacitación</a> <a
					class="collapse-item" href="administrarcapacitacion">Admin. Capacitaciones</a>
			</div>
		</div></li>

	<!-- Nav Item - Utilities Collapse Menu -->
	<c:if test="${sessionScope.rol == 'Admin'}">
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseUtilities"
		aria-expanded="true" aria-controls="collapseUtilities"><i
			class="fa fa-users"></i></i> <span>Usuarios</span> </a>
		<div id="collapseUtilities" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Acciones:</h6>
				<a class="collapse-item" href="#">Crear

					Usuario</a> <a class="collapse-item" href="#">Administrar

					Usuarios</a>
			</div>
		</div></li>
</c:if>
	<!-- Nav Item - Utilities Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapsethree"
		aria-expanded="true" aria-controls="collapsethree"><i
			class="fa-solid fa-chalkboard-user"></i> <span>Asesorias</span> </a>
		<div id="collapsethree" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Acciones:</h6>
				<a class="collapse-item" href="crearasesoria">Crear <a
					class="collapse-item" href="administrarasesoria">Administrar
						Asesorias</a>
			</div>
		</div></li>

	<!-- Nav Item - Utilities Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseFour"
		aria-expanded="true" aria-controls="collapseFour"><i
			class="fa-solid fa-person-falling-burst"></i> <span>Accidentes</span>
	</a>
		<div id="collapseFour" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Acciones:</h6>
				<a class="collapse-item" href="registraraccidente">Registrar
					Accidente <a class="collapse-item" href="administraraccidente">Administrar
						Accidentes</a>
			</div>
		</div></li>

	<!-- Divider -->
	<hr class="sidebar-divider">
<!-- Nav Item - Utilities Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseFive"
		aria-expanded="true" aria-controls="collapseFive"><i
			class="fa fa-plane"></i> <span>Visitas</span>
	</a>
		<div id="collapseFive" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Acciones:</h6>
				<a class="collapse-item" href="#">Registrar
					Visitas <a class="collapse-item" href="#">Administrar
						Visitas</a>
			</div>
		</div></li>


	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<div class="sidebar-heading"></div>
<!-- Nav Item - Charts -->
<li class="nav-item"><a class="nav-link" href="contacto"><i
			class="fa fa-address-card"></i> <span>Contacto</span></a></li>

	<!-- Nav Item - Charts -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseSeven"
		aria-expanded="true" aria-controls="collapseSeven"><i
			class="fa-solid fa-money-bill"></i> <span>Chequeos</span> </a>
		<div id="collapseSeven" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Acciones:</h6>
				<a class="collapse-item" href="#">Registrar
					Pagos<a class="collapse-item" href="#">Listar
						Pagos</a>
			</div>
		</div></li>
	
	<li class="nav-item"><a class="nav-link" href="#"><i
			class="fa-solid fa-flag"></i> <span>Reportes</span></a></li>
<i ></i>
	<!-- Nav Item - Utilities Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseSix"
		aria-expanded="true" aria-controls="collapseSix"><i
			class="fa-solid fa-money-bill"></i> <span>Pagos</span> </a>
		<div id="collapseSix" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Acciones:</h6>
				<a class="collapse-item" href="#">Registrar
					Pagos<a class="collapse-item" href="#">Listar
						Pagos</a>
			</div>
		</div></li>


	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>



</ul>
<!-- End of Sidebar -->