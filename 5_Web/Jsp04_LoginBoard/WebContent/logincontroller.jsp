<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<%@page import="com.login.dao.MyMemberDao"%>
<%@page import="com.login.dto.MyMemberDto"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String command= request.getParameter("command");
	System.out.println("[command: "+command+"]");
	
	MyMemberDao dao=new MyMemberDao();
	if(command.equals("login")){
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		MyMemberDto dto=dao.login(id,pw);
		
		if(dto.getMyid()!=null){
			session.setAttribute("dto", dto); //세션을 통해 로그인 처리 브라우저마다 세션이 하나씩 생성됨
			
			//session에 담긴 객체가 살아있는 시간 음수면 무제한
			session.setMaxInactiveInterval(60*60);
			
			if(dto.getMyrole().equals("ADMIN")){ //db안에 데이터와 동일하게 구분해야함
				response.sendRedirect("adminmain.jsp");
			}else if(dto.getMyrole().equals("USER")){
				response.sendRedirect("usermain.jsp");
			}
		}else{
%>
			<script type="text/javascript">
				alert("login 실패");
				location.href="index.jsp";
			</script>
<%
		}
	}else if(command.equals("logout")){
			//session정보 삭제
			session.invalidate();
			response.sendRedirect("index.jsp");
	}else if(command.equals("userlistall")){
		List<MyMemberDto> list=dao.selectAll();
		
		request.setAttribute("list", list);
		pageContext.forward("userlistall.jsp");
	}else if(command.equals("registform")){
		response.sendRedirect("registform.jsp");
	}else if(command.equals("idchk")){
		String myid=request.getParameter("id");
		String res=dao.idChk(myid);

		boolean idnotused=true;
		if(res!=null){
			idnotused=false;
		}
		response.sendRedirect("idchk.jsp?idnotused="+idnotused);
	}else if(command.equals("insertuser")){
		String myid=request.getParameter("myid");
		String mypw=request.getParameter("mypw");
		String myname=request.getParameter("myname");
		String myaddr=request.getParameter("myaddr");
		String myphone=request.getParameter("myphone");
		String myemail=request.getParameter("myemail");
		
		MyMemberDto dto= new MyMemberDto();
		dto.setMyid(myid);
		dto.setMypw(mypw);
		dto.setMyname(myname);
		dto.setMyaddr(myaddr);
		dto.setMyphone(myphone);
		dto.setMyemail(myemail);
		
		int res=dao.insertUser(dto);
		
		if(res>0){
%>
		<script type="text/javascript">
			alert("회원가입성공");
			location.href="index.jsp";
		</script>
<%			
		}else{
%>
		<script type="text/javascript">
			alert("회원가입 실패");
			location.href="logincontroller.jsp?command=registform";
		</script>
<%			
		}
	}else if(command.equals("updateroleform")){
		int myno =Integer.parseInt(request.getParameter("myno"));
		MyMemberDto dto=dao.selectUser(myno);
		
		//페이지전환을 위해 dto를 selectone이름으로 담음
		request.setAttribute("selectone", dto);
		pageContext.forward("updateroleform.jsp");
		
	}else if(command.equals("updaterole")){
		int myno =Integer.parseInt(request.getParameter("myno"));
		String myrole = request.getParameter("myrole");
		
		int res=dao.updateRole(myno,myrole);
		
		if(res>0){
%>
	<script type="text/javascript">
		alert("회원등급 조정 성공");
		location.href="logincontroller.jsp?command=userlistall";
	</script>
		
<%
		}else{
%>
	<script type="text/javascript">
		alert("회원등급 조정 실패");
		location.href="logincontroller.jsp?command=updateroleform&myno=<%=myno%>";
	</script>
<%
		}
	}
	
%>

</body>
</html>