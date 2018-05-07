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
					<h1 >教务人员管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">	
					<a href="#" class="btn btn-primary " data-toggle="modal" data-target="#managerInsertDialog" >添加</a>					
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">课程信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>用户名</th>
									<th>姓名</th>
									<th>密码</th>
									
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${man}" var="row">
									<tr>
										<td>${row.manUsername}</td>
										<td>${row.manTurename}</td>
										<td>${row.manPassword}</td>
										
										<td>
											<a href="javascript:void(0);" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#managerEditDialog" onclick="editManager('${row.manId}')">修改</a>
											<a href="javascript:void(0);" class="btn btn-danger btn-xs" onclick="deleteManager('${row.manId}')">删除</a>
										</td>
									</tr>
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
	<div class="modal fade" id="managerInsertDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
			<form class="form-horizontal" id="insert_manager_form" action="<%=basePath%>admin/manager/insert" method="post">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加课程信息</h4>
				</div>
				<div class="modal-body">
					
						<div class="form-group">
							<label for="insert_manUsername" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_manUsername" placeholder="用户名" name="manUsername">
							</div>
						</div>	
						<div class="form-group">
							<label for="insert_manTurename" class="col-sm-2 control-label">真实姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_manTurename" placeholder="真实姓名" name="manTurename">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_manPassword" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_manPassword" placeholder="密码" name="manPassword">
							</div>
						</div>
					
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="submit" class="btn btn-primary">确认</button>
				</div>
				</form>
			</div>
		</div>
	</div>
	<!-- 客户编辑对话框 -->
	<div class="modal fade" id="managerEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改课程信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_manager_form">
						<input type="hidden" id="edit_manager_id" name="manId"/>
						<div class="form-group">
							<label for="edit_manUsername" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_manUsername" placeholder="用户名" name="manUsername">
							</div>
						</div>	
						<div class="form-group">
							<label for="edit_manTurename" class="col-sm-2 control-label">真实姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_manTurename" placeholder="真实姓名" name="manTurename">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_manPassword" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_manPassword" placeholder="密码" name="manPassword">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateManager()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	<!-- /#wrapper -->

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
		function editManager(id) {
			$.ajax({
				type:"get",
				url:"<%=basePath%>admin/manager/edit",
				data:{"id":id},
				success:function(data) {  
					$("#edit_manager_id").val(data.manId);
					$("#edit_manUsername").val(data.manUsername);
					$("#edit_manTurename").val(data.manTurename);	
					$("#edit_manPassword").val(data.manPassword);		
				}
			});
		}
		<%-- function insertCourse() {
			$.post("<%=basePath%>admin/course/insert.action",$("#insert_course_form").serialize(),function(data){
				alert("课程信息添加成功！");
				window.location.reload();
			});
		} --%>
		function updateManager() {
			$.post("<%=basePath%>admin/manager/update",$("#edit_manager_form").serialize(),function(data){
				alert("教务人员更新成功！");
				window.location.reload();
			});
		}
		
		function deleteManager(id) {
			if(confirm('确实要删除该课程吗?')) {
				$.post("<%=basePath%>admin/manager/delete",{"id":id},function(data){
					alert("教务人员更新成功！");
					window.location.reload();
				});
			}
		}
		<%-- $("#insert_manager_form,#edit_manager_form").bootstrapValidator({
		          message: 'This value is not valid',
		          feedbackIcons: {
		              valid: 'glyphicon glyphicon-ok',
		              invalid: 'glyphicon glyphicon-remove',
		              validating: 'glyphicon glyphicon-refresh'
		          },
		          fields: {
		              manUsername: {
		                  message: '用户名验证失败',
		                  validators: {
		                      notEmpty: {
		                          message: '用户名不能为空'
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
		      }); --%>
	</script>
 	</body>
</html>
