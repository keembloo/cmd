<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="login.css"  rel="stylesheet">
</head>
<body>
	<div class="wrap"> <!-- 전체구역 --> 
		<div class="container">
			<div class="title">
				<h3>cms</h3>
				<div class="page_textinfo">관리자페이지입니다</div>
				<div class="inputbox">
					<input maxlength="20" class="input_id" type="text" placeholder="아이디">
					<input maxlength="20" class="input_pw" type="password" placeholder="비밀번호">
				</div>
				<button onclick="login()" class="btn_login" type="button">로그인</button>
				<div class="logincheckbox"></div>
			</div> <!-- title end -->
			<div class="etc_info">
				아이디, 비밀번호 분실 및 로그인 관련 문의는 담당부서 담당자에게 문의하시기 바랍니다. <br>
				관리자 계정 신규등록시 신청버튼을 통해 신청내용을 작성해주시기 바랍니다.
			</div>
		</div> <!-- container end -->
		<a href="../signup/signup.jsp" class="signup">관리자 계정 신청</a>
	</div> <!-- 전체구역 end -->


	<!-- 최신 JQUERY 불러오기 : AJAX 메소드 사용하기 위해 : JS가 외부로부터 통신하기 위해 -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	
	<script src="login.js" type="text/javascript"></script>
</body>
</html>