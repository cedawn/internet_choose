<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="itheima" uri="http://itcast.cn/common/"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>网上选课管理页面</title>

<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>css/bootstrapValidator.css" rel="stylesheet">
<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">

<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
	type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
  
  <body>
  	<jsp:include page="/WEB-INF/jsp/admin/top.jsp"></jsp:include>
  	<div class="container-fluid">
  	  <div class="row">
		<div  class="col-xs-2">
			<jsp:include page="/WEB-INF/jsp/admin/menu.jsp"></jsp:include>
		</div>		
		<div  class="col-xs-10" >		
			<div class="row">
				<div class="col-lg-12">
					<h1 >选课结果</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" id="downloadForm" action="${pageContext.request.contextPath }/admin/course/chooseResult" method="post">						
						<div class="form-group">
							<label for="stuNumber">学生学号</label> 
							<input type="text" class="form-control" id="stuNumber" value="${stuNumber }" name="stuNumber">
						</div>
						<div class="form-group">
							<label for="teaName">教师姓名</label> 
							<input type="text" class="form-control" id="teaName" value="${teaName }" name="teaName">
						</div>
						<div class="form-group">
							<label for="courseName">课程名称</label> 
							<input type="text" class="form-control" id="courseName" value="${courseName }" name="courseName">
						</div>
						<button type="submit" class="btn btn-primary">查询</button>
												
					</form>
					<form action="${pageContext.request.contextPath }/admin/export" method="post" enctype="multipart/form-data">
					<button type="submit" class="btn btn-primary">下载</button>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">学生信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>学号</th>
									<th>学生姓名</th>
									<th>课程名称</th>
									<th>教师姓名</th>
									<th>分数</th>													
								</tr>
							</thead>
							<tbody>
							
								<c:forEach items="${page.rows}" var="row">
								<%-- <c:forEach items="${row.student} " var="sc">
									<tr>
										<td>${sc.stu_number}</td>
										<td>${sc.stu_name}</td>	
										<td>${sc.courses.courseName}</td>
										<td>${sc.courses.icteacher.tea_name}</td>																							
										
									</tr>
									</c:forEach> --%>
									<tr>
										<td>${row.stu_number}</td>
										<td>${row.stu_name}</td>
										<td>${row.courseName}</td>
										<td>${row.tea_name}</td>
										<c:if test="${row.iscScore !=null}"><td>${row.iscScore}</td></c:if>
										<c:if test="${row.iscScore ==null}"><td>未录入</td></c:if>
									</tr>
								</c:forEach>
								
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/admin/course/chooseResult" />
						</div>
						<!-- /.panel-body -->
					</div>
					<c:if test="${empty page.rows}"><p align="center" style="font-size:20">未查询到相关记录！</p></c:if>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- /#page-wrapper -->
		</div>
  	</div>
	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<script src="<%=basePath%>js/bootstrapValidator.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
 	
 	</body>
</html>
