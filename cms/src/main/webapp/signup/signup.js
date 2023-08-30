console.log('회원가입');
//location.href ='/jspweb/member/login.jsp'; -> 회원가입후 로그인화면으로 자동 연결

//회원가입함수
function signup(){
	
	let inputId = document.querySelector('.input_id');
	let inputPw = document.querySelector('.input_pw');
	let inputTeam = document.querySelector('.team_select');
	let inputName = document.querySelector('.input_name');
	let inputPhone = document.querySelector('.input_phone');
	let info = {
		id : inputId ,pw : inputPw , team : inputTeam , name : inputName , phone : inputPhone
	}
	
	$.ajax({
		 url: "/cms/MemberController" ,
		 method: "post" ,			// 첨부파일 form 전송은 무조건 post 방식 
		 data :  info,		// FormData 객체를 전송 
		 success : r => {
		 
			 if (r){ // 회원가입 성공 [ 1. 알린다 2.페이지 전환]
				 alert('회원가입 성공');
				 location.href ='/jspweb/member/login.jsp';
			 } else { // 회원가입 실패
				  alert('회원가입 실패[관리자문의]');
			 }
		 
		 } ,
		 error : e => { console.log(e) } ,
	 })
}