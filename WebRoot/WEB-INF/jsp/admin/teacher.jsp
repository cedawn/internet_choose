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

<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">
<link href="<%=basePath%>css/bootstrapValidator.css" rel="stylesheet">
<link href="<%=basePath%>css/jquery-confirm.css" rel="stylesheet">
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

<style>

.error{
	color:red
}
</style>
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
					<h1 >教师管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" action="${pageContext.request.contextPath }/admin/teacher" method="post">
						<div class="form-group">
							<label for="teaName">教师姓名</label> 
							<input type="text" class="form-control" id="teaName" value="${teaName }" name="teaName">
						</div>
						<div class="form-group">
							<label for="teaNumber">教师工号</label> 
							<input type="text" class="form-control" id="teaNumber" value="${teaNumber }" name="teaNumber">
						</div>
						<button type="submit" class="btn btn-primary">查询</button>
						<a href="javascript:void(0);" class="btn btn-primary " data-toggle="modal" data-target="#teacherInsertDialog" >添加</a>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">教师信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>工号</th>
									<th>教师姓名</th>
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
										<td>${row.tea_number}</td>
										<td>${row.tea_name}</td>
										<td>${row.tea_sex}</td>
										<td>${row.tea_password}</td>
										<td>${row.tea_email}</td>
										<td>${row.tea_mobile}</td>
										
										<td>
											<a href="javascript:void(0);" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#teacherEditDialog" onclick="editTeacher('${row.tea_id}')">修改</a>
											<a href="javascript:void(0);" class="btn btn-danger btn-xs example5-3-2" data-toggle="tooltip" data-placement="top"
												data-original-title="删除后将无法恢复"  onclick="deleteTeacher('${row.tea_id}')" >删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/admin/teacher" />
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
	<!-- 客户编辑对话框 -->
	<div class="modal fade" id="teacherInsertDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加教师信息</h4>
				</div>
				<form class="form-horizontal" id="insert_teacher_form" action="<%=basePath%>admin/teacher/insert" method="post" >
				<div class="modal-body">
					
						
						<div class="form-group">
							<label for="insert_teaName" class="col-sm-2 control-label">教师姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_teaName" placeholder="教师姓名" name="tea_name">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_number" class="col-sm-2 control-label">教师工号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_number" placeholder="教师工号" name="tea_number">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_sex" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_sex" placeholder="性别" name="tea_sex">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_password" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_password" placeholder="密码" name="tea_password">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_email" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_email" placeholder="邮箱" name="tea_email">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_mobile" class="col-sm-2 control-label">移动电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_mobile" placeholder="移动电话" name="tea_mobile">
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
	<!-- 客户编辑对话框 -->
	<div class="modal fade" id="teacherEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改教师信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_teacher_form">
						<input type="hidden" id="edit_tea_id" name="tea_id"/>
						<div class="form-group">
							<label for="edit_teaName" class="col-sm-2 control-label">教师姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_teaName" placeholder="教师姓名" name="tea_name">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_teaNumber" class="col-sm-2 control-label">教师工号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_teaNumber" placeholder="教师工号" name="tea_number">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_teaSex" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_teaSex" placeholder="性别" name="tea_sex">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_teaPassword" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_teaPassword" placeholder="密码" name="tea_password">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_teaEmail" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_teaEmail" placeholder="邮箱" name="tea_email">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_teaMobile" class="col-sm-2 control-label">移动电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_teaMobile" placeholder="移动电话" name="tea_mobile">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateTeacher()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>
	
	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<!--输入检测  -->
	<script src="<%=basePath%>js/bootstrapValidator.js"></script>
	<script src="<%=basePath%>js/jquery-confirm.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	
	<script type="text/javascript">
		<%-- var path=<%=basePath%>; --%>
		
		
		  
		function editTeacher(id) {
			$.ajax({
				type:"get",
				url:"<%=basePath%>admin/teacher/edit",
				data:{"id":id},
				success:function(data) {  
					$("#edit_tea_id").val(data.tea_id);
					$("#edit_teaName").val(data.tea_name);
					$("#edit_teaNumber").val(data.tea_number)
					$("#edit_teaSex").val(data.tea_sex)
					$("#edit_teaPassword").val(data.tea_password)
					$("#edit_teaEmail").val(data.tea_email);
					
					$("#edit_teaMobile").val(data.tea_mobile);
					
					
				}
			});
		}
		<%-- function insertTeacher() {	
			
			$.post("<%=basePath%>admin/teacher/insert.action",$("#insert_teacher_form").serialize(),function(data){
				alert("教师信息添加成功！");
				window.location.reload();
			});
			
		} --%>
		function updateTeacher() {
			$.post("<%=basePath%>admin/teacher/update",$("#edit_teacher_form").serialize(),function(data){
				alert("教师信息更新成功！");
				window.location.reload();
			});
		}
		
		function deleteTeacher(id) {
			if(confirm('确实要删除该教师吗?')) {
				$.post("<%=basePath%>admin/teacher/delete",{"id":id},function(data){
					alert("教师删除更新成功！");
					window.location.reload();
				});
			}
		}
		 $("#insert_teacher_form,#edit_teacher_form").bootstrapValidator({
		          message: 'This value is not valid',
		          feedbackIcons: {
		              valid: 'glyphicon glyphicon-ok',
		              invalid: 'glyphicon glyphicon-remove',
		              validating: 'glyphicon glyphicon-refresh'
		          },
		          fields: {
		              tea_name: {
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
		              tea_number: {
		        		  threshold: 4,//有6字符以上才发送ajax请求
		                  validators: {
		                	  notEmpty: {
		                          message: '工号不能为空'
		                      },
		                      regexp: {
		                          regexp: /^\d{8}$/,
		                          message: '工号只能8位'
		                           },
		                      remote : {  
		                          url : '<%=basePath%>/teacher/checkTeaNumber.action',  
		                          message : "该工号已存在！不能输入相同的工号",  
		                          delay : 3000,
		                          type : 'post',
		                          data: {
		                        	   tea_number: $('#insert_number').val()
		                                }
		                    } 
		                  }
		              },
		              tea_sex:{
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
		              tea_password:{
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
		              tea_email: {
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
		             tea_mobile: {
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
		      
		  
		   
		    	<%-- $('[data-toggle="tooltip"]').tooltip();
	        
	        
	        $("body").on("click",'.example5-3-2', function(){
	        alert('sdsd');
	        	var id=$(this).attr("id");
	        	$.confirm({
	        	    title: '是否同意删除该信息?',
	        	    content: '删除后将无法恢复！！',
	        	    type: 'red',
	        	    typeAnimated: true,
	        	    buttons: {
	        	        tryAgain: {
	        	            text: 'AGREE',
	        	            btnClass: 'btn-red',
	        	            action: function(){
	        	            location.href="<%=basePath%>admin/teacher/delete.action?id="+id";
	        	            }
	        	        },
	        	        close: function () {
	        	        }
	        	    }
	        	});
	        });
		    
		    }); --%>
		  
		      
			
	
	
	
	</script>
 	</body>
</html>
