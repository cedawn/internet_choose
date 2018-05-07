<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="itheima" uri="http://itcast.cn/common/"%>
<%@ page isELIgnored="false" %> 
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

<title>网上选课学生页面</title>

<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">

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
  	<jsp:include page="/WEB-INF/jsp/student/top.jsp"></jsp:include>
  	<div class="container-fluid">
  	  <div class="row">
		<div  class="col-xs-2">
			<jsp:include page="/WEB-INF/jsp/student/menu.jsp"></jsp:include>
		</div>		
		<div  class="col-xs-10" >		
			<div class="row">
				<div class="col-lg-12">
					<h1 >选课操作</h1>
				</div>
				<!-- /.col-lg-12 -->
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">选课列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>课程名称</th>
									<th>教师</th>
									<th>学分</th>
									
									<th>操作</th>
									
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="row">
									<form method="post" action="choose/course.action?c_id=${row.courseId}&s_id=${icStudent.stu_id }">
									<tr>
										<td>${row.courseName}</td>
										<td>${row.icteacher.tea_name}</td>
										<td>${row.courseCredit}</td>
										
										<td>
											<%-- <a href="" class="btn btn-primary btn-xs" onclick="chooseCourse('${row.courseId}','${icStudent.stu_id }')">选择</a> --%>
											<button class="btn btn-primary btn-xs" type="submit">选择</button>
										</td>
									</tr>
									</form>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/student/choose.action" />
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">已选课程</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>课程名称</th>
									<th>教师</th>
									<th>学分</th>
									
									<th>操作</th>
									
								</tr>
							</thead>
							
								<tbody>	
								<c:forEach items="${icStuCou}" var="row">						
									<c:forEach items="${row.student}" var="bor">
									<%-- <form method="post" action="choose/deletecourse.action?b_id=${bor.courses.courseId}"> --%>
									<tr>
										<td>${bor.courses.courseName}</td>
										<td>${bor.courses.icteacher.tea_name}</td>
										<td>${bor.courses.courseCredit}</td>
										
										<td>
										<!-- <button class="btn btn-danger btn-xs" type="submit">退选</button> -->
											<a href="javascript:void(0);" class="btn btn-danger btn-xs" onclick="deleteCourse('${bor.courses.courseId}')">退选</a>
										</td>
									</tr>
									<!-- </form> -->
									</c:forEach>
									</c:forEach>			
								</tbody>
							
						</table>
						<!-- /.panel-body -->
					</div>
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

	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
 	<script type="text/javascript">
 		function deleteCourse(b_id){
				if(confirm('确实要退选该门课程吗?')) {
				$.post("<%=basePath%>student/choose/deletecourse.action",{"b_id":b_id},function(data){
					alert("课程退选成功！");
					window.location.reload();
				});
			}
 		}
 	</script>
 	
 	</body>
</html>
