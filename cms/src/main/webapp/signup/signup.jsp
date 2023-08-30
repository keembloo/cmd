<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="signup.css" rel="stylesheet">
</head>
<body>
	<div class="wrap">
		<div class="container">
			<div class="title">
				<h3>회원가입</h3>
				<div class="page_textinfo">관리자 회원가입 페이지입니다</div>
				<div class="inputbox">
					<input class="input_id" type="text" placeholder="아이디">
					<div class="id_info">중복된 아이디입니다.</div>
					<input class="input_pw" type="password" placeholder="비밀번호">
					<div class="pw_info">비밀번호는 영문+숫자이어야합니다.</div>
					<input class="input_pwcheck" type="password" placeholder="비밀번호확인">
					<div class="pwcheck_info">비밀번호가 일치하지 않습니다.</div>
					<select class="team_select">
						<option>팀</option>
						<option>경영지원</option>
						<option>운영관리</option>
						<option>재고관리</option>
						<option>생산관리</option>
					</select>
					<select class="level_select">
						<option>직급</option>
						<option>사장</option>
						<option>팀장</option>
						<option>과장</option>
						<option>대리</option>
						<option>사원</option>
					</select>
					<input class="input_name" type="text" placeholder="이름">
					<div class="authbox">
						<input class="input_phone" type="text" placeholder="전화번호">
						<button class="auth_btn">인증번호받기</button>
					</div>
					<input class="input_num" type="text" placeholder="인증번호 입력">
					<button class="check_auth">인증확인</button>
				</div>
				<button onclick="signup()" class="btn_signup" type="button">회원가입</button>
			</div>
		</div>
	</div> <!-- 전체구역 end -->



	<!-- 최신 JQUERY 불러오기 : AJAX 메소드 사용하기 위해 : JS가 외부로부터 통신하기 위해 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	
	<script src="login.js" type="text/javascript"></script>
</body>
</html>