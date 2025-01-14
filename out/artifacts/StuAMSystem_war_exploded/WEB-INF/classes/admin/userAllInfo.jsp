<%--

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<title>My JSP 'userAllInfo.jsp' starting page</title>

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
		.div_list {
			width: 75%;
			margin: 0 auto;
			margin-top: 50px;
			margin-left: 20%;

		}
		#tableClass{
			margin:0 auto;
			width: 100%

		}
		.form1{
			width: 200px;
			display: inline-block
		}

		font {
			color: red;
			font-weight: bold;
			text-align: center;
		}

		table {
			margin: 0 auto;
		}

		table tr td {
			text-align: center;
			width: 150px;
			height: 40px;
		}

		a {
			text-decoration: none;
		}
	</style>


</head>

<body>
<form action="PageServlet" method="post">
	<div class="div_list panel panel-default">

		<div class="panel-heading">用户信息</div>
		<table class="table panel-body" id="tableClass">
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>密码</td>
				<td>联系电话</td>
				<td>身份</td>
				<td>操作</td>
			</tr>
			<c:forEach var="list" items="${list.getPbjs()}">
				<tr>
					<td>${list.getUserNum() }</td>
					<td>${list.getUserName() }</td>
					<td>${list.getPassword() }</td>
					<td>${list.getPhone() }</td>
					<td>${list.getRoleName() }</td>
					<td>&nbsp;<a
							href="ServletSelectUser?userID=${list.getUserID() }">修改</a>&nbsp;</td>
				</tr>
			</c:forEach>



			<tr>

				<td colspan="6">

					<a href="PageServlet?pageNo=1&totalPage=${list.totalPage}">首页</a>
					<a href="PageServlet?pageNo=${list.pageNo-1}&totalPage=${list.totalPage}">上一页</a>
					<a href="PageServlet?pageNo=${list.pageNo+1}&totalPage=${list.totalPage}">下一页</a>
					<a href="PageServlet?pageNo=${list.totalPage}&totalPage=${list.totalPage}"> 最后一页 </a>
					<br/>
					跳转到： <input id="pageNo" type="text" class="form-control form1"
								   name="pageNo" value="${list.pageNo}" /> 每页记录数： <input class="form-control form1"
																							  type="text" name="pageCount" value="${list.pageCount}" /> <input class="btn btn-primary"
																																							   type="submit" value="跳转" /> 共有 ${list.totalPage} 页
				</td>

			</tr>
		</table>

	</div>
</form>
</body>
</html>
--%>



<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

    <title>My JSP 'userAllInfo.jsp'  starting page</title>

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
        .div_list {
            width: 75%;
            margin: 0 auto;
            margin-top: 50px;
            margin-left: 20%;

        }
        #tableClass{
            margin:0 auto;
            width: 100%

        }
        .form1{
            width: 200px;
            display: inline-block
        }
        font {
            color: red;
            font-weight: bold;
            text-align: center;
        }

        table {
            margin: 0 auto;
        }

        table tr td {
            text-align: center;
            width: 150px;
            height: 40px;
        }

        a {
            text-decoration: none;
            cursor: pointer;
        }
    </style>
    <script type="text/javascript">

        function page(s){
            var frm=document.getElementById("frm");
            var pageNo=document.getElementById("pageNo");
            pageNo.value=s;
            frm.submit();
        }
    </script>
</head>

<body>
<form action="ServletFindAllUser" method="post" id="frm">
    <div class="div_list">
        <div class=" panel panel-default">
            <div class="panel-heading">信息</div>
            <table class="table panel-body" id="tableClass">
                <tr>
                    <td>工号</td>
                    <td>姓名</td>
                    <td>密码</td>
                    <td>联系电话</td>
                    <td>身份</td>
                    <td>操作</td>
                  <%--  <td>操作</td>--%>
                </tr>
                <c:forEach var="list" items="${list.pbjs}">
                    <tr>
                        <td>${list.getUserNum() }</td>
                        <td>${list.getUserName() }</td>
                        <td>${list.getPassword() }</td>
                        <td>${list.getPhone() }</td>
                        <td>${list.getRoleName() }</td>
                        <td>&nbsp;<a href="ServletDeleteUser?usernum=${list.getUserNum() }">删除</a>&nbsp;</td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="8">
                        <a onclick="page(1);">首页</a>
                        <c:if test="${list.isPrevious() }">
                            <a onclick="page(${list.pageNo-1});">上一页</a>
                        </c:if>
                        <c:if test="${(list.pageNo+1)<list.totalPage }">
                            <a onclick="page(${list.pageNo+1 });">${list.pageNo+1 }</a>
                        </c:if>
                        <c:if test="${(list.pageNo+2)<list.totalPage }">
                            <a onclick="page(${list.pageNo+2 });">${list.pageNo+2 }</a>
                        </c:if>
                        <c:if test="${list.isNext() }">
                            <a onclick="page(${list.pageNo+1});">下一页</a>
                        </c:if>
                        <a onclick="page(${list.totalPage });">最后一页</a> <br />
                        跳转到：<input class="form-control form1"
                                      id="pageNo" type="text" name="pageNo" value="${list.pageNo }" />
                        每页记录数：<input type="text" class="form-control form1" name="pageCount"
                                          value="${list.pageCount }" />

                        <input class="btn btn-primary"
                               type="submit" value="跳转" /> 共有${list.totalPage }页</td>
                </tr>
            </table>
        </div>
    </div>
</form>

</body>
</html>




<%--

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<title>My JSP 'studentAll.jsp' starting page</title>

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
		.div_list {
			width: 75%;
			margin: 0 auto;
			margin-top: 50px;
			margin-left: 20%;

		}
		#tableClass{
			margin:0 auto;
			width: 100%

		}
		.form1{
			width: 200px;
			display: inline-block
		}
		font {
			color: red;
			font-weight: bold;
			text-align: center;
		}

		table {
			margin: 0 auto;
		}

		table tr td {
			text-align: center;
			width: 150px;
			height: 40px;
		}

		a {
			text-decoration: none;
			cursor: pointer;
		}
	</style>
	<script type="text/javascript">

		function page(s){
			var frm=document.getElementById("frm");
			var pageNo=document.getElementById("pageNo");
			pageNo.value=s;
			frm.submit();
		}
	</script>
</head>

<body>
&lt;%&ndash;<form action="ServletFindAllUser" method="post" id="frm">&ndash;%&gt;
<div class="div_list">
	<div class=" panel panel-default">
		<div class="panel-heading">信息</div>
		<table class="table panel-body" id="tableClass">
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>密码</td>
				<td>联系电话</td>
				<td>身份</td>
				<td>操作</td>
			</tr>
			<c:forEach var="list" items="${list.pbjs }">
				<tr>
					<td>${list.getUserNum() }</td>
					<td>${list.getUserName() }</td>
					<td>${list.getPassword() }</td>
					<td>${list.getPhone() }</td>
					<td>${list.getRoleName() }</td>
					<td>&nbsp;<a
							href="ServletSelectStu?userID=${list.getUserID() }">修改</a>&nbsp;</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="8">
					<a onclick="page(1);">首页</a>
					<c:if test="${list.isPrevious() }">
						<a onclick="page(${list.pageNo-1});">上一页</a>
					</c:if>
					<c:if test="${(list.pageNo+1)<list.totalPage }">
						<a onclick="page(${list.pageNo+1 });">${list.pageNo+1 }</a>
					</c:if>
					<c:if test="${(list.pageNo+2)<list.totalPage }">
						<a onclick="page(${list.pageNo+2 });">${list.pageNo+2 }</a>
					</c:if>
					<c:if test="${list.isNext() }">
						<a onclick="page(${list.pageNo+1});">下一页</a>
					</c:if>
					<a onclick="page(${list.totalPage });">最后一页</a> <br />
					跳转到：<input class="form-control form1"
								  id="pageNo" type="text" name="pageNo" value="${list.pageNo }" />
					每页记录数：<input type="text" class="form-control form1" name="pageCount"
									  value="${list.pageCount }" />

					<input class="btn btn-primary"
						   type="submit" value="跳转" /> 共有${list.totalPage }页</td>
			</tr>
		</table>
	</div>
</div>
</form>

</body>
</html>
--%>

