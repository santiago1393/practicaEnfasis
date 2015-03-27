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
	<h2>Lista: </h2>
<table class="table table-hover text-center">	
		<c:forEach var = "item" items="${lista}">
			<tr>
				<td class="col-md-3">
					<img alt="" src="../img/${item.imagen}">
				</td>
				<td class="col-md-5 text-left">
					<div><label class="alert alert-info">${item.nombre}</label></div>
					<div><label class="alert alert-danger">${item.precio}</label></div>
					<div>${item.descripcion}</div>					
				</td>
				<td class="col-md-4">
					<button class="btn btn-warning"  onclick="location.href='detalle?id=${item.id}';">Ver Detalle</button>
			
				</td>								
			</tr>
		</c:forEach>
	</table>

</body>
</html>