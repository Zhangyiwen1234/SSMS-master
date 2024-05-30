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
    <title>廉政证明(格式二）</title>

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

    <h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;关于${name}的廉政证明</h2><br><br>


    <p>&nbsp;&nbsp;截止目前，河南师范大学纪委监察专员办公室未收到有关${name}同志的问题线索，且该同志未受到过党纪政务处分及诫勉谈话等处理。</p>
    <p>&nbsp;&nbsp;特此证明。</p><br>
    <br>
    <br>

</div>
<div class="signature">
    <p>中共河南师范大学纪律检查委员会</p>
    <p><%= formattedDate %></p>
</div>
</body>
</html>
