<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> ${name}</title>	
</head>
<body class="alert">
<h2>Detalle: </h2>
<table class="table table-hover">	
			<tr>
				<td class="col-md-6" align = "center">
					<img height ="350" width="350" alt="" src="../img/${maquina.imagen}">
				</td>
				<td class="col-md-6">
					<div><label class="alert alert-success">${maquina.nombre}</label></div>			
					<div><label class="alert alert-info">Precio en la lista: ${maquina.precio}</label></div>
					<div><label class="alert alert-danger">Precio: ${maquina.precioDescuento}</label></div>
					<div><label class="alert alert-warning"> Descuento: ${maquina.descuento*100}%</label></div>
					<div>${maquina.descripcion}</div>
				</td>					
			</tr>
	
	</table>

</body>

</body>
</html>