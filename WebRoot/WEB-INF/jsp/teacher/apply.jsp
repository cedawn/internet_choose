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

<title>网上选课课程申请页面</title>

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
					<h1 >课程申请</h1>
					<a href="javascript:void(0);" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#courseApplyDialog" >申请表</a>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">课程申请列表</div>
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
								<c:forEach items="${cou}" var="row">
									<tr>
										<td>${row.courseName}</td>
										
										<td>${row.courseClassroom}</td>
										<td>${row.courseCredit}</td>
										<td>
											
											<a href="javascript:void(0);" class="btn btn-danger btn-xs" onclick="deleteCourse('${row.courseId}')">撤销申请</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						
						<!-- /.panel-body -->
					</div>
					<c:if test="${empty cou}"><p align="center" style="font-size:20">未查询到相关记录！</p></c:if>
					<!-- /.panel -->
				</div>
				
				
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- /#page-wrapper -->
		</div>
  	</div>
	<div class="modal fade" id="courseApplyDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">申请课程信息</h4>
				</div>
				<form class="form-horizontal" id="apply_course_form" action="<%=basePath%>teacher/applyCourse.action" method="post">
				<div class="modal-body">
					
						<div class="form-group">
							<label for="apply_courseName" class="col-sm-2 control-label">课程名称</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="apply_courseName" placeholder="课程名称" name="courseName" value="">
							</div>
						</div>
						<div class="form-group">
							<label for="apply_courseClassroom" class="col-sm-2 control-label">教室</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="apply_courseClassroom" placeholder="教室" name="courseClassroom" value="">
							</div>
						</div>			
						<div class="form-group">
							<label for="apply_courseCredit" class="col-sm-2 control-label">学分</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="apply_courseCredit" placeholder="学分" name="courseCredit" value="">
							</div>
						</div>
					
				</div>
				<div class="modal-footer">
					<button type="reset" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="submit" class="btn btn-primary ">申请授课</button>
				</div>
				</form>
			</div>
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
 		$("#apply_course_form").bootstrapValidator({
		          message: 'This value is not valid',
		          feedbackIcons: {
		              valid: 'glyphicon glyphicon-ok',
		              invalid: 'glyphicon glyphicon-remove',
		              validating: 'glyphicon glyphicon-refresh'
		          },
		          fields: {
		              courseName: {
		                  message: '课程名称验证失败',
		                  validators: {
		                      notEmpty: {
		                          message: '课程名不能为空'
		                      },
		                      regexp: {
		                          regexp: /^[a-zA-Z\u4e00-\u9fa5\#\+]{2,10}$/,
		                          message: '课程名2-10个字，只能是中文或英文'
		                        }
		                  }
		              },
		              courseClassroom: {
		        		  threshold: 1,//有6字符以上才发送ajax请求
		                  validators: {
		                	  notEmpty: {
		                          message: '教室不能为空'
		                      },
		                      regexp: {
		                          regexp: /^\d{4}$/,
		                          message: '教室号只能4位'
		                           },
		                      remote : {  
		                          url : '<%=basePath%>/course/checkClassRoom.action',  
		                          message : "该教室已被占用！请重新选择教室",  
		                          delay : 3000,
		                          type : 'post',
		                          data: {
		                        	   courseClassroom: $('#insert_classroom').val()
		                                }
		                    } 
		                  }
		              },
		              courseCredit:{
		              	  message: '学分验证失败',
		                  validators: {
		                	  notEmpty: {
		                          message: '学分不能为空'
		                      },
		                      regexp: {
		                          regexp: /^[1-5]{1}$/,
		                          message: '学分范围大概在1-5分'
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
