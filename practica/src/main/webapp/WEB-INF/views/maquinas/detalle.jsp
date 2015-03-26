<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
			
			
		
		</tr>		
		
			<tr>
				<td>
					${maquina.nombre}					
				</td>
				<td>
					<img alt="" src="img/${maquina.imagen}">
				</td>
				<td>
					${maquina.precio}
				</td>
										
			</tr>
	
	</table>

</body>

</body>
</html>