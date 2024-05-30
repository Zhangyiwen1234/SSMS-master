
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>

<head>
	<base href="<%=basePath%>">

	<title></title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
        <link rel="stylesheet" type="text/css" href="styles.css">
        -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<style type="text/css">
		.div_pwd {
			width: 75%;
			margin: 0 auto;
			margin-top: 50px;
			margin-left: 20%;
		}
		#tableClass{
			margin:0 auto;
			width: 100%

		}
		font {
			color: red;
			font-weight: bold;
			text-align: center;
		}
		table{
			margin:0 auto;
		}
		table tr td{
			text-align: center;
			width:150px;
			height:50px;
		}
		.button {
			display: inline-block;
			padding: 10px 20px;
			background-color: #007bff;
			color: #fff;
			text-decoration: none;
			border-radius: 5px;
			text-align: center;
		}

		.button:hover {
			background-color: #0056b3;
		}

	</style>

</head>

<body>
<form action="ServletselectPwd" method="post">
<div class="div_pwd panel panel-default">
	<div class="panel-heading">个人信息</div>
	<table class="table panel-body" id="tableClass">
		<tr>
			<td>账&nbsp;&nbsp;号：</td>
			<td>${usernum }</td>
		</tr>
		<tr>
			<td>姓&nbsp;&nbsp;名：</td>
			<td>${username }</td>
		</tr>
		<tr>
			<td>密&nbsp;&nbsp;码：</td>
			<td>${password }</td>
		</tr>

		<tr>
			<td>电&nbsp;&nbsp;话：</td>
			<td>${phone }</td>
		</tr>
		<tr>
			<td>身&nbsp;&nbsp;份：</td>
			<td>${rolename }</td>
		</tr>

	</table>

	<p><a href="ServletSelectUser?user_id=${userid}" target="mainRight" class="button">转让</a></p>





</div>
</form>
</body>
</html>


