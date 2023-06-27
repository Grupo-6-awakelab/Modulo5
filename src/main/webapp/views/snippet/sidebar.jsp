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

		</div>
		<div class="sidebar-brand-text mx-3">
		<span class="fs-4"><div class="col-3">
            <div class="logo">
                <img src="https://i.ibb.co/DrXTG5q/logo-sidebar-fw.png" alt="Logo corporativo">
            </div>
        </div></span> 
		</div>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">
	
	<!-- Nav Item - Dashboard -->
	<li class="nav-item active"><a class="nav-link" href="dashboard">
			<i class="fas fa-fw fa-tachometer-alt"></i> <span>Home</span>
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
				<a class="collapse-item" href="utilities-color.html">Crear
					Usuario</a> <a class="collapse-item" href="utilities-animation.html">Administrar
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
				<a class="collapse-item" href="utilities-color.html">Crear <a
					class="collapse-item" href="utilities-animation.html">Administrar
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
				<a class="collapse-item" href="utilities-color.html">Registrar
					Accidente <a class="collapse-item" href="utilities-animation.html">Administrar
						Accidentes</a>
			</div>
		</div></li>




	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<div class="sidebar-heading"></div>



	<!-- Nav Item - Charts -->
	<li class="nav-item"><a class="nav-link" href="charts.html"><i
			class="fa-solid fa-flag"></i> <span>Reportes</span></a></li>

	<!-- Nav Item - Utilities Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseFive"
		aria-expanded="true" aria-controls="collapseFive"><i
			class="fa-solid fa-money-bill"></i> <span>Pagos</span> </a>
		<div id="collapseFive" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Acciones:</h6>
				<a class="collapse-item" href="utilities-color.html">Registrar
					Pagos<a class="collapse-item" href="utilities-animation.html">Listar
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