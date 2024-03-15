<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix=""%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>now.jsp</title>
</head>
<body>
	<my:myselect></my:myselect>
	<h2>시간 알림 서비스</h2>
	현재 날짜와 시간은
	<%=request.getAttribute("today")%>
	<br>
	<hr>
	<br>
	<font color=green> ${today} </font> 입니다.
	<br>클라이언트 IP
	<%=request.getRemoteAddr()%>
	<hr>
	<br>클라이언트 브라우저 EL ${pageContext.request.remoteAddr}
	<p><%=request.getHeader("User-Agent")%></p>
	EL은? ${header["User-Agent"]}
	<hr>
	<br><%=request.getParameter("name")%>
	<hr>
	EL ${param.name }
	<br><%=request.getCookies()[0].getValue()%>
	<br>EL ${cookie.popupyn.value }
</body>
</html>