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

	<style>
		.dynamicTableContainer {

			width: 21cm;
			margin: 0 auto
		}
		table {
			width:100%;/* 设置表格宽度为% */
			border-collapse: collapse; /* 合并边框 */
		}
		th{
			padding: 15px; /* 设置单元格内边距 */
			border: 1px solid rgb(16, 16, 16);

		}
		td {
			word-wrap: break-word;
			max-width: 100%; /* 设置最大宽度为100% */
			padding: 30px; /* 设置单元格内边距 */
			border: 1px solid black; /* 添加边框 */
		}
	</style>
</head>
<body >
<div class="dynamicTableContainer" >
	<h2>违纪处理</h2>

	<form action="ServletFindOneTable" method="post"></form>
	<c:forEach var="row" items="${list}" >
		<table>
			<tr>
				<th>违纪人员姓名</th>
				<th colspan="2">职务</th>
				<th>职级</th>
				<th>政治面貌</th>
			</tr>
			<tr>
				<td>${row.person}</td>
				<td colspan="2">${row.duty}</td>
				<td>${row.rank}</td>
				<td>${row.status}</td>
			</tr>


			<tr>
				<th >违纪时间</th>
				<th colspan="4">违纪事实</th>

			</tr>
			<tr>
				<td>${row.violationTime}</td>
				<td colspan="4">${row.violationFacts}</td>

			</tr>


			<tr>
				<th colspan="3">处理情况</th>
				<th colspan="2">处理文号</th>
			</tr>
			<tr>
				<td colspan="3">${row.handingSituation}</td>
				<td colspan="2">${row.processingNumber}</td>
			</tr>
		</table>
	</c:forEach>
	</form>
	<button id="prevPage">上一页</button>
	<button id="nextPage">下一页</button>
</div>
<script>
	document.addEventListener('DOMContentLoaded', function() {
		var tables = document.querySelectorAll('.dynamicTableContainer table');
		var currentPage = 0;
		var tablesPerPage = 1; // 每页显示的表格数量

		showPage(currentPage);

		document.getElementById('prevPage').addEventListener('click', function() {
			if (currentPage > 0) {
				currentPage--;
				showPage(currentPage);
			}
		});

		document.getElementById('nextPage').addEventListener('click', function() {
			if (currentPage < Math.ceil(tables.length / tablesPerPage) - 1) {
				currentPage++;
				showPage(currentPage);
			}
		});

		function showPage(page) {

			for (var i = 0; i < tables.length; i++) {
				if (i >= page * tablesPerPage && i < (page + 1) * tablesPerPage) {
					tables[i].style.display = 'table';
				} else {
					tables[i].style.display = 'none';
				}
			}
		}
	});
</script>
</body>

</html>