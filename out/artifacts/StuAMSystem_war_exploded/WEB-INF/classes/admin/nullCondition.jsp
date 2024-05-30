<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = dateFormat.format(currentDate);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>暂无线索</title>

    <meta charset="utf-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <style>
        body{
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* 让body占据整个视口高度 */
            margin: 0;
            padding: 0;
            font-family: 宋体, Arial, sans-serif;
        }

        .content {
            width: 18cm;
            padding: 1cm;
            text-align: left;
            font-size: 22px;
            margin-right: 10%;
        }
        .signature {
            font-size: 22px;
           position: absolute;
            right:18%;
            bottom:25%;
        }
    </style>
</head>
<body>
<div class="content">

    <h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp截止目前，暂无${name}的信息处理</h2><br><br>

</div>
</body>
</html>
