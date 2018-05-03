<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
 
	<div class="navbar-default sidebar" role="navigation">		
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<li class="sidebar-search">
						<div class="input-group custom-search-form">
							<input type="text" class="form-control" placeholder="查询内容...">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button">
									<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
								</button>
							</span>
						</div> <!-- /input-group -->
					</li>
					<li><a href="<%=basePath%>/admin/student.action" class="active"><i
							class="fa fa-edit fa-fw"></i> 学生管理</a></li>
					<li><a href="<%=basePath%>/admin/teacher.action" ><i
							class="fa fa-edit fa-fw"></i> 教师管理</a></li>
					<li><a href="<%=basePath%>/admin/course.action" ><i
							class="fa fa-edit fa-fw"></i> 课程管理</a></li>
					<li><a href="<%=basePath%>admin/course/nowAgreeCourse.action" ><i
							class="fa fa-edit fa-fw"></i> 课程申请表</a></li>
					<li><a href="<%=basePath%>admin/course/nowAgreeCourse.action" ><i
							class="fa fa-edit fa-fw"></i> 选课结果</a></li>
					<li><a href="<%=basePath%>exit.action" ><i
							class="fa fa-edit fa-fw"></i> 退出</a></li>
					
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
</body>
</html>
