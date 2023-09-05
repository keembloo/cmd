//console.log('로그인실행');

function login(){
	let id = document.querySelector('.input_id').value;
	let pw = document.querySelector('.input_pw').value;
	
		//console.log('실행');
	$.ajax({
		url : "/cms/MemberFindControll" ,
		method : "post" ,
		data : {id : id , pw : pw} ,
		success : r => {
			if (r){
				//console.log('서공');
				location.href="/cms/index.jsp";
			} else {
				document.querySelector('.logincheckbox').innerHTML ='동일한 회원정보가 없습니다.';
			}
		} ,
		error: e => {console.log(e);}
	})
}