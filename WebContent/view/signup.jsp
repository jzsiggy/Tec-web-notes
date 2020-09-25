<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ page
	import="java.util.*,br.edu.insper.joaoz.model.*,br.edu.insper.joaoz.controller.*"%>

<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" />
<title>Log in</title>
</head>
<body>
	<div class='container'>
		<div class='wrapper'>
			<h1>sign up</h1>
			<hr />
		
			<form action="${pageContext.request.contextPath}/signup" method="post">
				usuário: <input type="text" name="nome" />
				</br/> 
				senha:&nbsp;&nbsp; <input type="password" name="passwd" />
				</br/>
				<input type="submit" value="Enter">
			</form>
			
			<a href="index.jsp">Log in</a>
		</div>
	</div>
</html>