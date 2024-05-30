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
    <title>详细信息查看</title>

    <meta charset="utf-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <style>
        body {
            margin: 0;
            padding: 0;
            background-color: #ffffff;/*背景颜色*/
            font-family: Arial, sans-serif;
        }

        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
            border: 1px solid black;
        }

        th, td {
            padding: 10px;
            text-align: left;
            /* border: none;  Remove border */
            border: 1px solid black;
        }

        input[type="text"] {
            width: 100%;
            padding: 5px;
            box-sizing: border-box;
            border: 1px solid #ffffff; /* Add border for input fields */
        }

        th {
            background-color: #ffffff; /*显示框颜色*/
        }

        tr:nth-child(even) {
            background-color: #ffffff;/*输入边框的颜色*/
        }

        tr:hover {
            background-color: #ffffff;/* 输入框中背后颜色 */
        }

        .container {
            margin: 0 auto;
            max-width: 800px; /* Adjust as needed */
        }
    </style>
</head>

<body>
<div class="container">
    <form action="ServletFindOneInformation" method="post">
        <table>
            <tbody>
            <tr>
                <th>姓名</th>
                <td><input type="text" value=""></td>
                <th>性别</th>
                <td><input type="text" value=""></td>
                <th>出生年月(岁)</th>
                <td><input type="text" value=""></td>
                <th>照片</th>
                <td><img src="your_photo.jpg" style="max-height: 100%; max-width: 100%;" width="150px" rowspan="4"></td>
            </tr>
            <tr>
                <th >民族</th>
                <td><input type="text" value=""></td>
                <th >籍贯</th>
                <td colspan="2"><input type="text" value=""></td>
                <th >出生地</th>
                <td colspan="2"><input type="text" value=""></td>
            </tr>

            <tr>
                <th>入党时间</th>
                <td colspan="2"><input type="text" value=""></td>
                <th>参加工作时间</th>
                <td colspan="2"><input type="text" value=""></td>
                <th>健康状况</th>
                <td><input type="text" value=""></td>

            </tr>
            <tr>
                <th>专业技术职务</th>
                <td colspan="3"><input type="text" value=""></td>
                <th>熟悉专业 有何专长</th>
                <td colspan="3"><input type="text" value=""></td>
                <
            </tr>
            <tr>
                <th colspan="1">学历学位</th>
                <th>全日制教育</th>
                <td colspan="2"><input type="text" value=""></td>
                <th>毕业院校及专业</th>
                <td colspan="4"><input type="text" value=""></td>
            </tr>
            <tr>
                <th>在职教育</th>
                <td colspan="2"><input type="text" value=""></td>
                <th>毕业院校及专业</th>
                <td colspan="4"><input type="text" value=""></td>
            </tr>
            <tr>
                <th colspan="1">现任职务</th>
                <td colspan="8"><input type="text" value=""></td>
            </tr>
            <tr>
                <th colspan="1">拟任职务</th>
                <td colspan="8"><input type="text" value=""></td>
            </tr>
            <tr>
                <th colspan="1">拟免职务</th>
                <td colspan="8"><input type="text" value=""></td>
            </tr>

            <tr height="200px">
                <th colspan="1">简历</th>

                <td colspan="8"><input type="text" style="width:1000px; height:200px;" ></td>

            </tr>
            <tr>
                <th colspan="1">奖惩情况务</th>
                <td colspan="8"><input type="text" value=""></td>
            </tr>
            <tr>
                <th colspan="1">年度考核结果</th>
                <td colspan="8"><input type="text" value=""></td>
            </tr>
            <tr>
                <th colspan="1">任免理由</th>
                <td colspan="8"><input type="text" value=""></td>
            </tr>




            <tr>
                <th colspan="1"></th>
                <th colspan="1">称谓</th>
                <th colspan="1">姓名</th>
                <th colspan="1">出生日期</th>
                <th colspan="1">政治面貌</th>
                <th colspan="3">工作单位及职务</th>
            </tr>


            <tbody>
            <tr>
                <th colspan="1" rowspan="9" >家庭主要成员及其重要社会关系</th>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td colspan="3"><input type="text" value=""></td>
            </tr>
            <tr>

                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td colspan="3"><input type="text" value=""></td>
            </tr>
            <tr>

                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td colspan="3"><input type="text" value=""></td>
            </tr>
            <tr>

                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td colspan="3"><input type="text" value=""></td>
            </tr>
            <tr>

                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td colspan="3"><input type="text" value=""></td>
            </tr>
            <tr>

                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td colspan="3"><input type="text" value=""></td>
            </tr>
            <tr>

                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td colspan="3"><input type="text" value=""></td>
            </tr>
            <tr>

                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td ><input type="text" value=""></td>
                <td><input type="text" value=""></td>
                <td colspan="3"><input type="text" value=""></td>
            </tr>

            <!-- Add more rows as needed -->



            <tr>
                <th colspan="1">呈报单位</th>
                <td colspan="7"><input type="text" value=""></td>
            </tr>
            <tr>
                <th>身份证号</th>
                <td><input type="text" value=""></td>
                <th>计算年龄时间</th>
                <td><input type="text" value=""></td>
                <th>填表时间</th>
                <td><input type="text" value=""></td>
                <th>填表人</th>
                <td><input type="text" value=""></td>
            </tr>
            </tbody>
        </table>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
