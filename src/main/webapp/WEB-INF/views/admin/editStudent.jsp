<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>OneSchool &mdash; Website by Colorlib</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<link
	href="https://fonts.googleapis.com/css?family=Muli:300,400,700,900"
	rel="stylesheet">
<!--     <link rel="stylesheet" href="fonts/icomoon/style.css"> -->


<link rel="stylesheet"
	href="<c:url value='/rs/fonts/icomoon/style.css'/>" />
<link rel="stylesheet" href="<c:url value='/rs/css/bootstrap.min.css'/>" />
<link rel="stylesheet" href="<c:url value='/rs/css/jquery-ui.css'/>" />
<link rel="stylesheet"
	href="<c:url value='/rs/css/owl.carousel.min.css'/>" />
<link rel="stylesheet"
	href="<c:url value='/rs/css/owl.theme.default.min.css'/>" />
<link rel="stylesheet"
	href="<c:url value='/rs/css/owl.theme.default.min.css'/>" />
<link rel="stylesheet"
	href="<c:url value='/rs/css/jquery.fancybox.min.css'/>" />
<link rel="stylesheet"
	href="<c:url value='/rs/css/bootstrap-datepicker.css'/>" />
<link rel="stylesheet"
	href="<c:url value='/rs/fonts/flaticon/font/flaticon.css'/>" />
<link rel="stylesheet" href="<c:url value='/rs/css/aos.css'/>" />
<link rel="stylesheet" href="<c:url value='/rs/css/style.css'/>" />

</head>
<body data-spy="scroll" data-target=".site-navbar-target"
	data-offset="300">

	<div class="site-wrap">



		<header class="site-navbar py-4 js-sticky-header site-navbar-target"
			role="banner">

			<div class="container-fluid">
				<div class="d-flex align-items-center">
					<div class="site-logo mr-auto w-25">
						<a href="index.jsp">OneSchool</a>
					</div>

					<div class="mx-auto text-center">
						<nav class="site-navigation position-relative text-right"
							role="navigation">
							<ul
								class="site-menu main-menu js-clone-nav mx-auto d-none d-lg-block  m-0 p-0">
								<li><a href="#home-section" class="nav-link">Home</a></li>
								<li><a href="#courses-section" class="nav-link">Courses</a></li>
								<li><a href="#programs-section" class="nav-link">Programs</a></li>
								<li><a href="#teachers-section" class="nav-link">Teachers</a></li>
							</ul>
						</nav>
					</div>

					<div class="ml-auto w-25">
						<nav class="site-navigation position-relative text-right"
							role="navigation">
							<ul
								class="site-menu main-menu site-menu-dark js-clone-nav mr-auto d-none d-lg-block m-0 p-0">
								<li class="cta"><a href="#contact-section" class="nav-link"><span>Contact
											Us</span></a></li>
							</ul>
						</nav>
						<a href="#"
							class="d-inline-block d-lg-none site-menu-toggle js-menu-toggle text-black float-right"><span
							class="icon-menu h3"></span></a>
					</div>
				</div>
			</div>

		</header> 

		<div class="intro-section" id="home-section">

			<div class="slide-1"
				style="background-image: url('rs/images/hero_1.jpg');"
				data-stellar-background-ratio="0.5">
				<div class="container">
					<div class="row align-items-center">
						<div class="col-12">
							<div class="row align-items-center">
								<div class="col-lg-6 mb-4">
									<h1 data-aos="fade-up" data-aos-delay="100">Learn From The
										Expert</h1>
									<p class="mb-4" data-aos="fade-up" data-aos-delay="200">Lorem
										ipsum dolor sit amet consectetur adipisicing elit. Maxime ipsa
										nulla sed quis rerum amet natus quas necessitatibus.</p>
									<p data-aos="fade-up" data-aos-delay="300">
										<a href="#" class="btn btn-primary py-3 px-5 btn-pill">Admission
											Now</a>
									</p>
								</div>
								<div class="col-lg-5 ml-auto" data-aos="fade-up"
									data-aos-delay="500">
									<c:url value="/admin/edit" var = "url"/>
									<form:form modelAttribute="user" method="post" action="${url }"
										class="form-box">
											<h3 class="h4 text-black mb-4">Edit Student Info</h3>
											
										<div class="form-group">
											<form:label path="name">Name</form:label>
											<br>
											<form:input class="input" type="text" path="name"
												placeholder="Fullname" />
												<p style="color: red;"><form:errors path="name"></form:errors></p>
										</div>
										<%-- <div class="form-group">
											<form:label path="username">Username</form:label>
											<br>
											<form:input class="input" type="text" path="username"
												placeholder="Username" />
												<p style="color: red;"><form:errors path="username"></form:errors></p>
										</div>

										<div class="form-group">

											<form:label path="password">Password</form:label>
											<br>
											<form:input class="input" type="password" path="password"
												placeholder="Password" />
												<p style="color: red;"><form:errors path="password"></form:errors></p>
										</div>

										<div class="form-group mb-4">
											<form:label path="password">Re-type password</form:label>
											<br>
											<form:input class="input" type="password" path="password"
												placeholder="Re-type password" />

										</div> --%>

										<div class="form-group">
											<form:label path="telephonr_number">Telephone number</form:label>
											<br>
											<form:input class="input" type="text" path="telephonr_number"
												placeholder="Telephone number" />

										</div>
										<div class="form-group">
											<form:label path="dateOfBirth">Date of birth</form:label>
											<br>
											<form:input class="input" type="date" path="dateOfBirth"
												placeholder="Date of birth" />
										</div>
										<div class="form-group">
											<form:label path="email">E-mail address</form:label>
											<br>
											<form:input class="input" type="email" path="email"
												placeholder="E-mail address" />
												<p style="color: red;"><form:errors path="email"></form:errors></p>
										</div>
										<div class="form-group">
											<form:label path="gender">Gender</form:label>
											<br>
											<form:select path="gender">
												<form:option value="Male">Male</form:option>
												<form:option value="Female">Female</form:option>
											</form:select>

										</div>

										<div class="form-group">
											<input type="submit" class="btn btn-primary btn-pill"
												value="Submit">
										</div>
									</form:form>

								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
		 <footer class="footer-section bg-white">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<h3>About OneSchool</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Porro consectetur ut hic ipsum et veritatis corrupti. Itaque eius
							soluta optio dolorum temporibus in, atque, quos fugit sunt sit
							quaerat dicta.</p>
					</div>

					<div class="col-md-3 ml-auto">
						<h3>Links</h3>
						<ul class="list-unstyled footer-links">
							<li><a href="#">Home</a></li>
							<li><a href="#">Courses</a></li>
							<li><a href="#">Programs</a></li>
							<li><a href="#">Teachers</a></li>
						</ul>
					</div>

					<div class="col-md-4">
						<h3>Subscribe</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Nesciunt incidunt iure iusto architecto? Numquam, natus?</p>
						<form action="#" class="footer-subscribe">
							<div class="d-flex mb-5">
								<input type="text" class="form-control rounded-0"
									placeholder="Email"> <input type="submit"
									class="btn btn-primary rounded-0" value="Subscribe">
							</div>
						</form>
					</div>

				</div>

				<div class="row pt-5 mt-5 text-center">
					<div class="col-md-12">
						<div class="border-top pt-5">
							<p>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;
								<script>
									document.write(new Date().getFullYear());
								</script>
								All rights reserved | This template is made with <i
									class="icon-heart" aria-hidden="true"></i> by <a
									href="https://colorlib.com" target="_blank">Colorlib</a>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</p>
						</div>
					</div>

				</div>
			</div>
		</footer>



	</div>
	<!-- .site-wrap -->

	<script type="text/javascript"
		src="<c:url value='/rs/js/jquery-3.3.1.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/jquery-migrate-3.0.1.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/jquery-ui.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/popper.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/bootstrap.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/owl.carousel.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/jquery.stellar.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/jquery.countdown.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/bootstrap-datepicker.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/jquery.easing.1.3.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/rs/js/aos.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/jquery.fancybox.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/rs/js/jquery.sticky.js'/>"></script>


	<script type="text/javascript" src="<c:url value='/rs/js/main.js'/>"></script>




</body>
</html>



<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage Student</title>

<link href="<c:url value='/rs/css/style.css'/>" />
</head>
<body>
	<p>User Info Addition</p>
	<c:url value="/admin/edit" var = "url"/>
	<form:form modelAttribute="user" method="post" action="${url }" >
		<form:hidden path="id"/>
		<p>Name: </p><form:input path="name"/>
		<p style="color: red;"><form:errors path="name"></form:errors></p> 
		<p>Telephone number: </p><form:input path="telephonr_number"/>
		<p>Date of birth: </p><form:input path="dateOfBirth"/>
		<p>Email address: </p><form:input path="email"/>
		<p style="color: red;"><form:errors path="email"></form:errors></p>
		<p> Gender: </p> <form:select path="gender">
				<form:option value="Male">Male</form:option>
				<form:option value="Female">Female</form:option>
		</form:select>
		
		<button type="submit">Submit</button>
	</form:form>
</body>
</html> --%>