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
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">成绩录入列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped" >
							<thead>
								<tr>
									<th>学生学号</th>
									<th>学生姓名</th>
									<th>课程名称</th>
									<th>分数</th>
									<th>操作</th>
									
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${isc}" var="row">						
									
									<%-- ?id=${bor.courses.courseId}<form method="post" action="choose/deletecourse.action?b_id=${bor.courses.courseId}"> --%>
									<c:forEach items="${row.student }" var="bor">
									<form class="form-horizontal" id="gradeForm"  method="post" action="<%=basePath%>teacher/saveGrade.action">
										<tr>
											<input type="hidden" value="${row.iscId }" name="iscId">
											<input type="hidden" value="${bor.courses.courseId }" name="courseId">
											<td>${row.stu_number }</td>
											<td>${row.stu_name }</td>
											
											<td>${bor.courses.courseName}</td>
											<td style="width:100px"><input type="text" class="form-control"  size="10" name="iscScore" value="${bor.icStudentCourse.iscScore}" <c:if test="${row.iscScore != null}">disabled="true"</c:if>  id="iscScore"></td>
											<td>
											
											<button type="submit" class="btn btn-primary btn-xs" <c:if test="${row.iscScore != null}">disabled</c:if> >录入</button>  
											<%-- <a href="#" class="btn btn-primary btn-xs"  onclick="saveGrade('${row.iscId }')">录入</a> --%>
											</td>
											
											
										</tr>
									<!-- </form> -->
									</form>
									
									</c:forEach>	
									</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/customer/list.action" />
						</div>
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
	<script src="<%=basePath%>js/bootstrapValidator.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	<script type="text/javascript">
		<%-- function saveGrade(id) {
			
			$.ajax({				
				type:"get",
				url:"<%=basePath%>teacher/saveGrade.action",
				data:{"id":id},				
				success:function(data) {  					
									
					}
								
			});			
		} --%>
		
		$("#gradeForm").bootstrapValidator({
		          message: 'This value is not valid',
		          feedbackIcons: {
		              valid: 'glyphicon glyphicon-ok',
		              invalid: 'glyphicon glyphicon-remove',
		              validating: 'glyphicon glyphicon-refresh'
		          },
		          fields: {
		              
		              iscScore:{
		              	  message: '学分验证失败',
		                  validators: {
		                	  notEmpty: {
		                          message: '分数不能为空'
		                      },
		                      regexp: {
		                          regexp: /^[1-5]{1}$/,
		                          message: '分数范围在0-100'
		                      }
		                  }
		              
		              }
		             
		             

		          },

		          submitHandler: function (validator, form, submitButton) {
		              alert("submit");
		          }
		      });
	</script>
 	</body>
</html>
