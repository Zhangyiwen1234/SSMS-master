<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
%>
<!DOCTYPE html>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>View Uploads</title>
</head>
<body>

<%@page import="com.example.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Uploads List</h1>

<%
	List<Upload> list = UploadDAO.listAllUploads();
	request.setAttribute("list", list);
%>

<table border="1" width="90%">
	<tr>
		<th>视屏名称</th>
		<th>路径</th>
		<th>操作</th>

	</tr>
	<c:forEach items="${list}" var="u">
		<tr>
			<td>${u.getId()}</td>
			<td>${u.getFilename()}</td>
			<td><a href="DBFileDownload?id=${u.getId()}">下载</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="fileupload.jsp">再次添加</a>

</body>
</html>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
%>
<!DOCTYPE html>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>View Uploads</title>
	<%@ page language="java" pageEncoding="UTF-8"%>
	<%@ page contentType="text/html;charset=UTF-8"%>
		<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
%>
	<!DOCTYPE html>

	<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>View Uploads</title>
	</head>
<body>

<%@page import="com.example.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Uploads List</h1>

<%
	List<Upload> list = UploadDAO.listAllUploads();
	request.setAttribute("list", list);
%>

<table border="1" width="90%">
	<tr>
		<th>视屏名称</th>
		<th>路径</th>
		<th>操作</th>

	</tr>
	<c:forEach items="${list}" var="u">
		<tr>
			<td>${u.getId()}</td>
			<td>${u.getFilename()}</td>
			<td><a href="DBFileDownload?id=${u.getId()}">下载</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="fileupload.jsp">再次添加</a>

</body>
</html>
</head>
<body>

<%@page import="com.example.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Uploads List</h1>

<%
	List<Upload> list = UploadDAO.listAllUploads();
	request.setAttribute("list", list);
%>

<table border="1" width="90%">
	<tr>
		<th>视屏名称</th>
		<th>路径</th>
		<th>操作</th>

	</tr>
	<c:forEach items="${list}" var="u">
		<tr>
			<td>${u.getId()}</td>
			<td>${u.getFilename()}</td>
			<td><a href="DBFileDownload?id=${u.getId()}">下载</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="fileupload.jsp">再次添加</a>

</body>
</html>