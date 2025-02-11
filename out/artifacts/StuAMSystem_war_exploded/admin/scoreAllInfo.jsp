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
    
    <title>My JSP 'selectblurScore.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
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
table{
margin:0 auto;

}
table tr td{
text-align: center;
width:150px;
height:40px;
}
a{
text-decoration: none;
cursor:pointer;

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
  <form action="ServletSearchScore" method="post" id="frm">
    <div class="div_list">
		单    位：<input type="text" class="form-control form1"   name="cosName" value="${score.getCourseName() }" />&nbsp;&nbsp;&nbsp;&nbsp;
		工&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text"  class="form1 form-control" name="stuNum" value="${score.getStuNum() }" />&nbsp;&nbsp;&nbsp;&nbsp;
		姓&nbsp;&nbsp;&nbsp;&nbsp;名：<input type="text"  class="form1 form-control" name="stuName" value="${score.getStuName() }" /><br/><br/>
		性    别：<input type="text"  class="form1 form-control" name="stuClass" value="${score.getStuClass() }" />&nbsp;&nbsp;
		身份证号：<input type="text"  class="form1 form-control" name="major" value="${score.getMajor() }" /> &nbsp;&nbsp;
		<input type="submit" class="btn btn-primary" value="查询" /><br/><br/>
		<div class=" panel panel-default">
			<div class="panel-heading">干部廉政信息</div>
		<table class="table panel-body" id="tableClass">
			<tr>
				<td>廉政信息</td>
				<td>工号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>单位</td>
				<td>手机号</td>
				<td>身份证号码</td>
				<td>详情</td>
			</tr>
			<c:forEach var="list" items="${list.pbjs }">
			<tr>
				<td><a href="ServletSearchCredict1?stu_name=${list.getStuName()}&course_name=${list.getCourseName()}">廉政证明</a><%--最后链接到廉政证明中去--%>
				<td>${list.getStuNum() }</td>
				<td>${list.getStuName() }</td>
				<td>${list.getStuClass() }</td>
				<td>${list.getCourseName() }</td>
				<td>${list.getScoreGrade() }</td>
				<td>${list.getMajor() }</td>
				<td><a href="ServletFindOneCondition?stu_name=${list.getStuName()}&course_name=${list.getCourseName()}">查看详情</a><%--到时候更换路径到另一个详情页面--%>
				
			</tr>
			</c:forEach>
			<tr>
					<td colspan="7">
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
						每页记录数：<input type="text" name="pageCount" class="form-control form1"
						value="${list.pageCount }" /> 
						
						<input
						type="submit" class="btn btn-primary" value="跳转" /> 共有${list.totalPage }页</td>
				</tr>
		</table>
	</div>
	</div>
	</form>
  </body>
</html>
