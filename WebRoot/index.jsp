<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itheima" uri="http://itcast.cn/common/"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>网上选课系统</title>

<!-- Bootstrap Core CSS -->

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>css/login.css" rel="stylesheet">
<script src="<%=basePath%>js/jquery.min.js"></script>
<body>
 <div class="container">
	<div class="row">
		<div>
			<h1>网上选课系统</h1>
		</div>
		<div>
	      <form class="form-signin" method="post" action="<%=basePath%>/login.action" >
	        <div class="close"><span><font color="red">${vo.errorMessage }</font></span></div>
	         <div class="form-group">
                <label for="userID">用户Id</label>
                <input type="text" class="form-control" value="" name="userID" id="userID"  placeholder="请输入用户名">
            </div>
            
            <div class="form-group">
                <label for="password">密码</label>
                <input type="password" class="form-control" name="password" id="password"  placeholder="请输入密码" >
            </div>
           
			<div class="form-group">				
				<label for="loginType" >选择登录窗口</label> 				
				<select	class="form-control" id="loginType" placeholder="" name="loginType">								
					<option value="">--请选择--</option>
					<option value="admin">管理员</option>
					<option value="teacher">教师</option>
					<option value="student">学生</option>
				</select>		
			</div>		
            <button type="submit" class="btn btn-primary btn-block"   >登录</button>
	      </form>
	    </div>
	</div>
</div> <!-- /container -->

	
	
	
<%-- <script type="text/javascript">
$(document).ready(function(c) {  
    $('.close').on('click', function(c){  
        $('.login_form').fadeOut('slow', function(c){  
            $('.login-form').remove();  
        });  
    });     
});
$(document).ready(function(){
	$("#btn").click(function(){  
          if($("#userID").val()=="请输入用户名" || $("#userID").val()==""||$("#password").val()=="请输入密码"|| $("#password").val()==""||$("#loginType").val()==''){  
              $("#msg").html("用户名不能为空！");  
             return false;  
         }else{  
            $.ajax({  
                 type:"post",  
                 url:"<%=basePath%>/login.action",  
                 data:{userID:$("#userID"),password:$("#password"),loginType:$("#loginType")},
                 dataType:"text",  
                 beforeSend:function(){  
                     $("#btn").val("正在提交，请稍等...");  
                 },   
                 success:function(data){  
                     //判断输入是否成功，成功则跳转     
                     if("登录成功"==data){  
                         $.post("<%=basePath%>admin/student.action");     
                     }else{  
                         $("#key").addClass("key");  
                        $("#btn").val("Login");  
                         return false;  
                     }                           
                }     
             });  
         }  
      });
    });
    
</script>	 --%>

</body>

</html>
