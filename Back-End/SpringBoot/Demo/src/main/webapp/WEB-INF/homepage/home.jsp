<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring project</title>
<style>
	*{
		margin : 0;
		padding : 0;
		box-sizing : borderBox;
	}
	
	.Container{
		width: 100vw;
		height: 100vh;
		background-color : red; 
		
	}
	.child{
		display : flex;
		justify-content : center;
		align-items : center;
		height : 100vh;
		
	}
	h1{
		color : red;
		font-size : 3rem;
		background-color : #fff;
		padding : 30px;
		border-radius : 50%;
		border : 4px solid #ffffff;
	}
	
</style>
</head>
<body>
	<div class="Container">
		<div class="child"><h1>Spring Boot</h1></div>
	</div>
</body>
</html>