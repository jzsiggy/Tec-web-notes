<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" />
<title>Log in</title>
</head>
<body>
	<div class='container'>
		<div class='wrapper'>
			<h1>Log in</h1>
			<hr />
		
			<form action="${pageContext.request.contextPath}/login" method="post">
				usuário: <input type="text" name="nome" />
				</br/> 
				senha:&nbsp;&nbsp; <input type="password" name="passwd" />
				</br/> 
				<input type="submit" value="Enter">
			</form>
		
			<a href="signup.jsp">Sign up</a>
		</div>
	</div>
</body>
</html>