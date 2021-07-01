<%@ page session="false" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="./css/main.css" rel="stylesheet" type="text/css">
<title>Home</title>
</head>
<body>
	<div class="wrapper">
		<h1>LOGIN</h1>
		<form id="loginForm">
			<div class="inputWrap">
				<input type="text" id="userId" name="userId"
					placeholder="아이디를 입력하세요" autofocus="autofocus" />
			</div>
			<div class="inputWrap">
				<input type="password" id="userPw" name="userPw"
					placeholder="비밀번호를 입력하세요" />
			</div>
			<div class="btnWrap">
				<button type="submit">submit</button>
				<button type="reset">cancel</button>
			</div>

		</form>
	</div>

	<script src="../../../resources/js/login.js"></script>
</body>
</html>
