<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'addTeacher.jsp' starting page</title>

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

        .div_ads {
            width: 75%;
            margin: 0 auto;
            margin-top: 50px;
            margin-left: 10%;
        }

        table {
            margin: 0 auto;
            width:100%;
            border-collapse:separate;
            border-spacing:0px 10px;
        }
        table tr td {
            text-align: center;
            width:150px;
            height:44px;
        }

        .put.form-control {
            width: 100%; /* 设置下拉选择框的宽度与文本框相同 */
        }
    </style>

</head>

<body>
<form action="ServletaddUser" method="post">
    <div class="div_ads">
        <table>
            <tr>
                <td>账&nbsp;&nbsp;&nbsp;号：</td>
                <td><input type="text" name="userNum" class="put form-control" /></td>
            </tr>
            <tr>
                <td>姓&nbsp;&nbsp;&nbsp;名：</td>
                <td><input type="text" name="userName" class="put form-control" /></td>
            </tr>
            <tr>
                <td>密&nbsp;&nbsp;&nbsp;码：</td>
                <td><input type="password"  name="Password" class="put form-control" /></td>
            </tr>

            <tr>
                <td>电&nbsp;&nbsp;&nbsp;话：</td>
                <td><input type="text" name="phone" class="put form-control" /></td>
            </tr>
            <tr>
                <td>角色：</td>
                <td>
                    <select name="roleName" class="put form-control">
                        <option value="信息录入人员">信息录入人员</option>
                        <option value="信息查询人员">信息查询人员</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="添加" class="btn btn-primary" /></td>
                <td><input type="reset" value="清空" class="btn btn-danger" /></td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
