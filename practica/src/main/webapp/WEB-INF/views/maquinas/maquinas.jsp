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
<body>
<table class="table table-bordered">
		<tr>
			<th>NOMBRE </th>			
			<th>IMAGEN </th>
			<th>PRECIO </th>
			<th>VER DETALLE</th>
			
		
		</tr>		
		<c:forEach var = "item" items="${lista}">
			<tr>
				<td>
					${item.nombre}					
				</td>
				<td>
					<img alt="" src="img/${item.imagen}">
				</td>
				<td>
					${item.precio}
				</td>
					<td>
				<input type="button" value="Ver Detalle" onclick="location.href='detalle?id=${item.id}';"/>
				</td>								
			</tr>
		</c:forEach>
	</table>

</body>
</html>