<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Maquinas</title>
	<h2 class="col-md-12">Hello ${name}</h2>
</head>
<body>
<table class="table table-striped">		
		<c:forEach var = "item" items="${maquinas}">
			<tr>
				<td>
					${item.nombre}
				</td>			
			</tr>
		</c:forEach>
	</table>

</body>
</html>