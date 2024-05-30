<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title></title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            /*  margin: 20px auto;*/
        }
        th, td {
            border: 1px solid rgb(16, 16, 16);
            padding: 8px;
        }



    </style>
</head>
<body>
<div style="width: 21cm; margin: 0 auto;">
    <h2>问题线索处置</h2>
    <form action="ServletFindOneCondition" method="post"></form>
    <c:forEach var="row" items="${list}">
        <table>
            <tr>
                <th>姓名（或单位）</th>
                <th>职务</th>
                <th>职级</th>
                <th>政治面貌</th>
            </tr>


            <tr>
                <td>${row.name}</td>
                <td>${row.duty}</td>
                <td>${row.rank}</td>
                <td>${row.politicalLook}</td>
            </tr>

        </table>
        <table>
            <tr>
                <th colspan="4">问题摘要</th>
            </tr>
            <tr><td colspan="4" style="height: 100px;"> ${row.issues}</td></tr>
        </table>
        <table>
            <tr>
                <th>处置时间</th>
                <th>处置方式</th>
                <th>办结时间</th>
                <th>承办人</th>
            </tr>
            <tr>
                <td>${row.processingTime}</td>
                <td>${row.processingMethod}</td>
                <td>${row.processingTime}</td>
                <td>${row.undertaker}</td>
            </tr>

        </table>
        <table>
            <tr>

                <th>处置结果</th>
                <th>线索分类</th>
                <th>案管编号</th>
            </tr>
            <tr>

                <td>${row.disposalResult}</td>
                <td>${row.clueClassfication}</td>
                <td>${row.caseNumber}</td>
            </tr>
        </table>
        <table>
            <tr>
                <th>是否违纪违法</th>

            </tr>
            <tr>
                <td>${row.violationDiscipline}</td>

            </tr>
        </table>



        </form>
    </c:forEach>
</div>
</body>
</html>
