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
					<h1 >学生管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" action="${pageContext.request.contextPath }/admin/student" method="post">
						<div class="form-group">
							<label for="stuName">学生姓名</label> 
							<input type="text" class="form-control" id="stuName" value="${stuName }" name="stuName">
						</div>
						<div class="form-group">
							<label for="stuNumber">学生学号</label> 
							<input type="text" class="form-control" id="stuNumber" value="${stuNumber }" name="stuNumber">
						</div>
						<button type="submit" class="btn btn-primary">查询</button>
						<a href="javascript:void(0);" class="btn btn-primary " data-toggle="modal" data-target="#studentInsertDialog" >添加</a>
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
									<th>性别</th>
									<th>密码</th>
									<th>邮箱</th>
									<th>移动电话</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="row">
									<tr>
										<td>${row.stu_number }</td>
										<td>${row.stu_name}</td>
										<td>${row.stu_sex}</td>
										<td>${row.stu_password}</td>
										<td>${row.stu_email}</td>
										<td>${row.stu_mobile}</td>
										<td>
											<a href="javascript:void(0);" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#studentEditDialog" onclick="editStudent('${row.stu_id}')">修改</a>
											<a  class="btn btn-danger btn-xs" onclick="deleteStudent('${row.stu_id}')">删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/admin/student" />
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
	<!-- 客户编辑对话框 -->
	<div class="modal fade" id="studentEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改学生信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_student_form">
						<input type="hidden" id="edit_stu_id" name="stu_id"/>
						<div class="form-group">
							<label for="edit_stuName" class="col-sm-2 control-label">学生名称</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_stuName" placeholder="学生名称" name="stu_name">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_stuNumber" class="col-sm-2 control-label">学号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_stuNumber" placeholder="学号" name="stu_number">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_stuSex" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_stuSex" placeholder="性别" name="stu_sex">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_stuPassword" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_stuPassword" placeholder="密码" name="stu_password">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_stuEmail" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_stuEmail" placeholder="移动电话" name="stu_email">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_stuMobile" class="col-sm-2 control-label">移动电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_stuMobile" placeholder="移动电话" name="stu_mobile">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateStudent()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	<!-- /#wrapper -->
	<div class="modal fade" id="studentInsertDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
			<form class="form-horizontal" id="insert_student_form" action="<%=basePath%>admin/student/insert" method="post">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加学生信息</h4>
				</div>
				<div class="modal-body">
					
						<div class="form-group">
							<label for="insert_stuName" class="col-sm-2 control-label">学生名称</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuName" placeholder="学生名称" name="stu_name">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_stuNumber" class="col-sm-2 control-label">学生学号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuNumber" placeholder="学生学号" name="stu_number">
							</div>
						</div>
						
						<div class="form-group">
							<label for="insert_stuSex" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuSex" placeholder="性别" name="stu_sex">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_stuPassword" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuPassword" placeholder="密码" name="stu_password">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_stuEmail" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuEmail" placeholder="邮箱" name="stu_email">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_stuMobile" class="col-sm-2 control-label">移动电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_stuMobile" placeholder="移动电话" name="stu_mobile">
							</div>
						</div>
					
				</div>
				<div class="modal-footer">
					<button type="reset" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="submit" class="btn btn-primary" >确认</button>
				</div>
				</form>
			</div>
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
		function editStudent(id) {
			$.ajax({
				type:"get",
				url:"<%=basePath%>admin/student/edit",
				data:{"id":id},
				success:function(data) {  
					$("#edit_stu_id").val(data.stu_id);
					$("#edit_stuName").val(data.stu_name);
					$("#edit_stuNumber").val(data.stu_number);
					$("#edit_stuSex").val(data.stu_sex);
					$("#edit_stuPassword").val(data.stu_password);
					$("#edit_stuEmail").val(data.stu_email);
					$("#edit_stuMobile").val(data.stu_mobile);
					
				}
			});
		}
		<%-- function insertStudent() {
			$.post("<%=basePath%>admin/student/insert.action",$("#insert_student_form").serialize(),function(data){
				alert("学生信息添加成功！");
				window.location.reload();
			});
		} --%>
		function updateStudent() {
			$.post("<%=basePath%>admin/student/update",$("#edit_student_form").serialize(),function(data){
				alert("学生信息更新成功！");
				window.location.reload();
			});
		}
		function deleteStudent(id) {
			if(confirm('确实要删除该学生吗?')) {
				$.post("<%=basePath%>admin/student/delete",{"id":id},function(data){
					alert("学生删除更新成功！");
					window.location.reload();
				});
			}
		}
		$("#insert_student_form,#edit_student_form").bootstrapValidator({
		          message: 'This value is not valid',
		          feedbackIcons: {
		              valid: 'glyphicon glyphicon-ok',
		              invalid: 'glyphicon glyphicon-remove',
		              validating: 'glyphicon glyphicon-refresh'
		          },
		          fields: {
		              stu_name: {
		                  message: '姓名验证失败',
		                  validators: {
		                      notEmpty: {
		                          message: '姓名不能为空'
		                      },
		                      regexp: {
		                          regexp: /^[a-zA-Z\u4e00-\u9fa5]{2,10}$/,
		                          message: '姓名2-10个字，只能是中文或英文'
		                        }
		                  }
		              },
		              stu_number: {
		        		  threshold: 4,//有6字符以上才发送ajax请求
		                  validators: {
		                	  notEmpty: {
		                          message: '学号不能为空'
		                      },
		                      regexp: {
		                          regexp: /^\d{8}$/,
		                          message: '工号只能8位'
		                           },
		                      remote : {  
		                          url : '<%=basePath%>/student/checkStuNumber.action',  
		                          message : "该学号已存在！不能输入相同的学号",  
		                          delay : 3000,
		                          type : 'post',
		                          data: {
		                        	   stu_number: $('#insert_stuNumber').val()
		                                }
		                    } 
		                  }
		              },
		              stu_sex:{
		              	  message: '性别验证失败',
		                  validators: {
		                	  notEmpty: {
		                          message: '性别不能为空'
		                      },
		                      regexp: {
		                          regexp: /^[男女]$/,
		                          message: '请输入正确的性别'
		                      }
		                  }
		              
		              },
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
