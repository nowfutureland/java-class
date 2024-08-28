<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ include file="layout/db_connect.jsp" %>

<%
	String sql = "select max(custno)+1 from member_tbl_02";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int num = rs.getInt(1)+1;
	// 회원번호 가장 큰 수 증가
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="styleeheet" href="css/style.css?ver111">
	<title>쇼핑몰 회원관리 ver1.0</title>
</head>
<body>
<header>
	<jsp:include page="layout/header.jsp"></jsp:include>
</header>
<nav>
	<jsp:include page="layout/nav.jsp"></jsp:include>
</nav>

	<main id="section">
		<h3 class="title">회원등록</h3>
		<form name="data" action="join_p.jsp" method="post" onsubmit="return checkValue()">
			<table class="table_line">
				<tr>
					<th>회원번호(자동발생)</th>
					<td><input type="text" name="custno" value="<%= num%>" readonly></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname" autofocus></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate"></td>
				</tr>
				<tr>
					<th>고객등급 A-VIP B-일반 C-직원</th>
					<td><input type="text" name="grade"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city"></td>
				</tr>
			
			</table>
		
		

		</form>
	</main>

<footer>
	<jsp:include page="layout/footer.jsp"></jsp:include>
</footer>

</body>
</html>