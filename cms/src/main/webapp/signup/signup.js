console.log('회원가입');

function signupbtn(){
	
	let input_id = document.querySelector('.input_id').value;
	let input_pw = document.querySelector('.input_pw').value;
	let input_pwcheck = document.querySelector('.input_pwcheck').value;
	let team_select = document.querySelector('.team_select').value;
	let input_name = document.querySelector('.input_name').value;
	
	
	let info = {input_id : input_id ,input_pw : input_pw ,
		team_select : team_select, input_name : input_name };
		
	$.ajax({
		url : "/cms/MemberControll",
		method : "post" ,
		data : info ,
		success : r => {console.log(r)
			console.log('된다');
			
		},
		error : e => {console.log(e);}
		
		
	})
}