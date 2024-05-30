、<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">

	<title>超级管理员</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.css">
	<link rel="stylesheet" href="css/nprogress.css">
	<link rel="stylesheet" href="css/admin.css">
	<script src="js/nprogress.js"></script>
	<style type="text/css">
		* {
			margin: 0;
			padding: 0;
		}
		.li-sty{
			position: absolute;
			left: 70%;
			height: 50px;
			font-size: 40px;
			cursor: pointer;
			line-height: 100px;
			color: aliceblue;
		}
		.navbar{
			height: 100px;
			margin: 0;
			background-image: linear-gradient( #82a2a8 20%, #727e8f 70%)
		}
		.navbar ul{
			width: 100%;
			height: 100px;
			position: relative;

		}
	</style>

	<script type="text/javaScript" src="js/jquery-1.8.1.js"></script>
	<script>
		window.onload = function(){
			var oUl = document.getElementsByClassName('nav')[0];
			var aLi = oUl.getElementsByTagName('li');
			for(var i=0;i<aLi.length;i++){
				aLi[i].onclick = function(){
					for(var j in aLi){
						aLi[j].className = '';
					}
					this.className='active';
				}

			}
		}
	</script>
	<style>
		.aside{
			width:15%;
		}
		.li-sty{
			position: absolute;
			left: 70%;
			height: 50px;
			font-size: 40px;
			cursor: pointer;
			line-height: 100px;
			color: aliceblue;
		}
		.navbar{
			height: 100px;
			margin: 0;
			background-image: linear-gradient( #82a2a8 20%, #727e8f 70%)
		}
		.navbar ul{
			width: 100%;
			height: 100px;
			position: relative;

		}
	</style>
</head>

<body>
<div class="div_body">
	<nav class="navbar">
		<ul class="nav navbar-nav " style="border-bottom:#517fa4 2px">
			<li class="li-sty">干部廉政管理平台<i class="fa fa-magic" aria-hidden="true"></i></li>
		</ul>
	</nav>
	<div class="aside">
		<div class="profile">
			<img class="avatar" src="images\微信图片_20240321203041.jpg">
			<h3 class="name">${username}</h3>
		</div>
		<ul class="nav">
			<li>
				<a href="#menu-grades" data-toggle="collapse">
					<i class="fa fa-comments"></i>信息管理<i class="fa fa-angle-right"></i>
				</a>
				<ul id="menu-grades" class="collapse">
					<li><a href="ServletFindAllScore" target="mainRight">信息查看</a></li>

				</ul>
			</li>
			<li>
				<a href="ServletFindAllCondition" target="mainRight"><i class="fa fa-dashboard"></i>问题检索</a>
			</li>

			<li>
				<a href="#menu-man" data-toggle="collapse">
					<i class="fa fa-comments"></i>账号管理<i class="fa fa-angle-right"></i>
				</a>
				<ul id="menu-man" class="collapse">
					<a href="PageServlet" target="mainRight"><i class="fa fa-bank"></i>查看账号</a>

					<a href="ServletaddUser" target="mainRight"><i class="fa fa-bank"></i>添加账号</a>
				</ul>
			</li>
			<li>
				<a href="ServletselectPwd" target="mainRight"><i class="fa fa-dashboard"></i>个人信息</a>
			</li>


		</ul>
	</div>
	<div class="div_right">
		<iframe frameBorder="0" id="main"
				name="mainRight" scrolling="yes" src="main.jsp"
				style="HEIGHT:130%; VISIBILITY: inherit; WIDTH: 100%; Z-INDEX: 1"></iframe>
	</div>
</div>

<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>