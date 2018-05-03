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

<title>网上选课学生页面</title>

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
  	<jsp:include page="/WEB-INF/jsp/student/top.jsp"></jsp:include>
  	<div class="container-fluid">
  	  <div class="row">
		<div  class="col-xs-2">
			<jsp:include page="/WEB-INF/jsp/student/menu.jsp"></jsp:include>
		</div>		
		<div  class="col-xs-10" >		
			<div class="row">
				<div class="col-lg-12">
					<h1 >个人信息</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-2">
				</div>
				<div class="col-lg-6">
				<form method="post" action="<%=basePath%>student/updateStudent.action" id="person">
					<div class="panel-heading"></div>
						<!-- /.panel-heading -->
						<div class="form-group">
							<label for="insert_stuName" class="col-sm-2 control-label">学生名称</label>
							<div class="col-sm-10">
								<input type="text" disabled="true" class="form-control" id="insert_stuName" placeholder="学生名称" name="stu_name" value="${obj.stu_name} ">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_stuNumber" class="col-sm-2 control-label">学生学号</label>
							<div class="col-sm-10">
								<input type="text" disabled="true" class="form-control" id="insert_stuNumber" placeholder="学生名称" name="stu_number" value="${obj.stu_number }">
							</div>
						</div>
						
						<div class="form-group">
							<label for="insert_stuSex" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<input type="text" disabled="true" class="form-control" id="insert_stuSex" placeholder="性别" name="stu_sex" value="${obj.stu_sex }">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_stuPassword" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuPassword" placeholder="密码" name="stu_password" value="${obj.stu_password}">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_stuEmail" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuEmail" placeholder="邮箱" name="stu_email" value="${obj.stu_email} ">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_stuMobile" class="col-sm-2 control-label">移动电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuMobile" placeholder="移动电话" name="stu_mobile" value="${obj.stu_mobile}">
							</div>
						</div>
						<div >
							<button type="submit" class="btn btn-primary btn-xs" style="position:relative;left:420px;top:20px;width:80px;height:30px">修改信息</button>
						</div>
						<!-- /.panel-body -->
					</div>
					</form>
					<!-- /.panel -->
				</div>
				<div class="col-lg-4">
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
	<script type="text/javascript">
	$("#person").bootstrapValidator({
		          message: 'This value is not valid',
		          feedbackIcons: {
		              valid: 'glyphicon glyphicon-ok',
		              invalid: 'glyphicon glyphicon-remove',
		              validating: 'glyphicon glyphicon-refresh'
		          },
		          fields: {
		              stu_password:{
		              	  message: '密码验证失败',
		                  validators: {
		                	  notEmpty: {
		                          message: '密码不能为空'
		                      },
		                      regexp: {
		                          regexp: /^[A-Za-z0-9]+$/,
		                          message: '密码错误，密码由数字和字母组成'
		                      },
		                      regexp: {
		                          regexp: /^[A-Za-z0-9]{6,12}$/,
		                          message: '密码至少输入六位'
		                      }
		                  }
		              
		              },
		              stu_email: {
		            	  message: '邮箱验证失败',
		                  validators: {
		                	  notEmpty: {
		                          message: '邮箱不能为空'
		                      },
		                      regexp: {
		                          regexp: /.+@.+\.[a-zA-Z]{2,4}$/,
		                          message: '请输入正确的邮箱'
		                      }
		                  }
		              },
		             stu_mobile: {
		            	  message: '手机号验证失败',
		                  validators: {
		                      notEmpty: {
		                          message: '手机号不能为空'
		                      },
		                      regexp: {
		                          regexp: /^1(3|4|5|7|8)\d{9}$/,
		                          message: '请输入正确的手机号'
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
