<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8");%>
<%@ page import="com.login.dao.MyMemberDao" %>
<%@ page import="com.login.dto.MyMemberDto" %>
<%@ page import = "java.util.List" %>

<!DOCTYPE html>b
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String command = request.getParameter("command");
	System.out.println("[command:"+command+"]");
	
	MyMemberDao dao = new MyMemberDao();
	
	if(command.equals("login")){
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MyMemberDto dto = dao.login(id,pw);
		
		if(dto.getMyid() != null){
			session.setAttribute("dto",dto);
			
			session.setMaxInactiveInterval(60*60);
			
			if(dto.getMyrole().equals("admin")){
				response.sendRedirect("adminmain.jsp");
			}else if(dto.getMyrole().equals("user")){ 
				response.sendRedirect("usermain.jsp");
			}
		}else{
			%>
			<script type="text/javascript">
				alert("login 실패");
				location.href="index.jsp"
			</script>
			<%
		}
	}else if(command.equals("logout")){
		session.invalidate();
		response.sendRedirect("index.jsp");
	}else if(command.equals("userlistall")){
		List<MyMemberDto> list = dao.selectAll();
		
		request.setAttribute("list",list);
		pageContext.forward("userlistall.jsp");
	}else if(command.equals("main")){
		if(((MyMemberDto)session.getAttribute("dto")).getMyrole().equals("admin")){
			
		}
	}
%>
</body>
</html>