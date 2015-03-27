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

<table class="table table-bordered">
		<tr>
			<th class="text-center col-md-3">NOMBRE </th>			
			<th class="text-center col-md-3">IMAGEN </th>
			<th class="text-center col-md-3">PRECIO </th>
			<th class="text-center col-md-3">DESCRIPCION </th>
			<th class="text-center col-md-3">PRECIO CON DESCUENTO</th>
			<th class="text-center col-md-3">DESCUENTO </th>
		
		</tr>		
		
			<tr>
				<td>
					${maquina.nombre}					
				</td>
				<td>
					<img alt="" src="../img/${maquina.imagen}">
				</td>
				<td>
					${maquina.precio}
				</td>
				<td>
					${maquina.descripcion}
				</td>
				<td>
					${maquina.precioDescuento}
				</td>
				<td>
					${maquina.descuento}
				</td>						
			</tr>
	
	</table>

</body>

</body>
</html>