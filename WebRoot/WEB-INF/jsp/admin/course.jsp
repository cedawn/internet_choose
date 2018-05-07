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
					<h1 >课程管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" action="${pageContext.request.contextPath }/admin/course" method="post">
						<div class="form-group">
							<label for="courseName">课程名称</label> 
							<input type="text" class="form-control" id="courseName" value="${courseName }" name="courseName">
						</div>
						<button type="submit" class="btn btn-primary">查询</button>
						<a href="#" class="btn btn-primary " data-toggle="modal" data-target="#courseInsertDialog" >添加</a>
					</form>
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
									<th>课程名称</th>
									<th>教师</th>
									<th>教室</th>
									<th>学分</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="row">
									<tr>
										<td>${row.courseName}</td>
										<td>${row.icteacher.tea_name}</td>
										<td>${row.courseClassroom}</td>
										<td>${row.courseCredit}</td>
										<td>
											<a href="javascript:void(0);" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#courseEditDialog" onclick="editCourse('${row.courseId}')">修改</a>
											<a href="javascript:void(0);" class="btn btn-danger btn-xs" onclick="deleteCourse('${row.courseId}')">删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/admin/course" />
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
	<div class="modal fade" id="courseInsertDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
			<form class="form-horizontal" id="insert_course_form" action="<%=basePath%>admin/course/insert" method="post">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加课程信息</h4>
				</div>
				<div class="modal-body">
					
						<div class="form-group">
							<label for="insert_courseName" class="col-sm-2 control-label">课程名称</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_courseName" placeholder="课程名称" name="courseName">
							</div>
						</div>	
						<div class="form-group">
							
							<label for="teacherFrom" class="col-sm-2 control-label">选择教师</label> 
							<div class="col-sm-10">
							<select	class="form-control" id="teacherFrom" placeholder="教师" name="courseTeaId">
								
								<option value="">--请选择--</option>
								<c:forEach items="${teacherType}" var="item">
									<option value="${item.tea_id}">${item.tea_name }</option>
								</c:forEach>
							</select>
							</div>
						</div>
						<div class="form-group">
							<label for="insert_classroom" class="col-sm-2 control-label">教室</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_classroom" placeholder="教室" name="courseClassroom">
							</div>
						</div>
						<div class="form-group">
							<label for="insert_courseCredit" class="col-sm-2 control-label">学分</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="insert_courseCredit" placeholder="学分" name="courseCredit">
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
	<div class="modal fade" id="courseEditDialog" tabindex="-1" role="dialog"
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
					<form class="form-horizontal" id="edit_course_form">
						<input type="hidden" id="edit_course_id" name="courseId"/>
						<div class="form-group">
							<label for="edit_courseName" class="col-sm-2 control-label">课程名称</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_courseName" placeholder="课程名称" name="courseName">
							</div>
						</div>
						
						
						
						<div class="form-group">
							
							<label for="teacherFrom" class="col-sm-2 control-label">选择教师</label> 
							<div class="col-sm-10">
							<select	class="form-control" id="teacherFrom" placeholder="教师" name="courseTeaId">
								
								<option value="">--请选择--</option>
								<c:forEach items="${teacherType}" var="item">
									<option value="${item.tea_id}"<c:if test="${item.tea_id == courseTeaId}"> selected</c:if>>${item.tea_name }</option>
								</c:forEach>
							</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_courseClassroom" class="col-sm-2 control-label">教室</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_courseClassroom" placeholder="教室" name="courseClassroom">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_courseCredit" class="col-sm-2 control-label">学分</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_courseCredit" placeholder="学分" name="courseCredit">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateCourse()">保存修改</button>
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
		function editCourse(id) {
			$.ajax({
				type:"get",
				url:"<%=basePath%>admin/course/edit",
				data:{"id":id},
				success:function(data) {  
					$("#edit_course_id").val(data.courseId);
					$("#edit_courseName").val(data.courseName);
					$("#teacherFrom").val(data.courseTeaId);
					$("#edit_courseClassroom").val(data.courseClassroom);
					$("#edit_courseCredit").val(data.courseCredit);
					
					
				}
			});
		}
		<%-- function insertCourse() {
			$.post("<%=basePath%>admin/course/insert.action",$("#insert_course_form").serialize(),function(data){
				alert("课程信息添加成功！");
				window.location.reload();
			});
		} --%>
		function updateCourse() {
			$.post("<%=basePath%>admin/course/update",$("#edit_course_form").serialize(),function(data){
				alert("课程信息更新成功！");
				window.location.reload();
			});
		}
		
		function deleteCourse(id) {
			if(confirm('确实要删除该课程吗?')) {
				$.post("<%=basePath%>admin/course/delete",{"id":id},function(data){
					alert("课程删除更新成功！");
					window.location.reload();
				});
			}
		}
		$("#insert_course_form,#edit_course_form").bootstrapValidator({
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
