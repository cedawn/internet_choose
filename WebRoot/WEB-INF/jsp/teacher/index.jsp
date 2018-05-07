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

<title>网上选课教师页面</title>

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
  	<jsp:include page="/WEB-INF/jsp/teacher/top.jsp"></jsp:include>
  	<div class="container-fluid">
  	  <div class="row">
		<div  class="col-xs-2">
			<jsp:include page="/WEB-INF/jsp/teacher/menu.jsp"></jsp:include>
		</div>		
		<div  class="col-xs-10" >		
			<div class="row">
				<div class="col-lg-12">
					<h1 >主页</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel-heading">课程信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>课程名称</th>
									
									<th>教室</th>
									<th>学分</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
							
								<c:forEach items="${course}" var="row">
									<form method="post" action="<%=basePath%>teacher/writeGrade.action?id=${row.courseId}">
									<tr>
										<td>${row.courseName}</td>
										
										<td>${row.courseClassroom}</td>
										<td>${row.courseCredit}</td>
										<td>
										<a href="javascript:void(0);" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#studentEditDialog" onclick="lookStudent('${row.courseId}')">查看学生</a>
										<button class="btn btn-primary btn-xs" type="submit">录入成绩</button>
										</td>
									</tr>
									</form>
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
  	
		<div class="modal fade" id="studentEditDialog" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">学生列表</h4>
				</div>
				<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>学号</th>
									<th>学生姓名</th>
									<th>性别</th>
									
									<th>邮箱</th>
									<th>移动电话</th>		
								</tr>
							</thead>
							<tbody id="stuMessage">
								
										
									
							
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/admin/student.action" />
						</div>
		</div>
	</div>
	</div>
	<%-- <div class="modal fade" id="studentGradeDialog" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">学生成绩录入列表</h4>
				</div>
				<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>学号</th>
									<th>学生姓名</th>
									<th>课程名称</th>
									
									<th>成绩</th>
										
								</tr>
							</thead>
							<tbody id="stuGrade">
								
										
																
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/admin/student.action" />
						</div>
		</div>
	</div>
	</div> --%>
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
		function lookStudent(id) {
			$("#stuMessage").html("");
			$.ajax({				
				type:"get",
				url:"<%=basePath%>teacher/lookStudent.action",
				data:{"id":id},				
				success:function(data) {  					
					for(var i=0;i<data.length;i++){					
					$("#stuMessage").append(
					"<tr>"+	
					"<td>"+data[i].stu_number+"</td>"+				
						"<td>"+data[i].stu_name+"</td>"+
						
						"<td>"+data[i].stu_sex+"</td>"+						
						"<td>"+data[i].stu_email+"</td>"+	
						"<td>"+data[i].stu_mobile+"</td>"+										
					"</tr>"
					);					
					}
				},				
			});			
		}
		<%-- function writeGrade(id) {
		
			$.ajax({				
				type:"get",
				url:"<%=basePath%>teacher/writeGrade.action",
				data:{"id":id},					
			});			
		} --%>
	</script>
 	</body>
</html>
