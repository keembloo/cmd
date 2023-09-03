//console.log('회원가입');
	

	
	let checkList = [false , false];
	
// 아이디 유효성검사
function idcheck(){
	let input_id = document.querySelector('.input_id').value;
	let id_info = document.querySelector('.input_id');
	
	let idj = /^[a-z0-9]{5,20}$/
	if (idj.test(input_id)){
		// 이거해야됨
		
		
		
		
		
		
	} else {
		id_info.innerHTML =`아이디는 5~20글자 사이면서 영문+숫자 조합이어야합니다.`
		checkList[0] = false;
	}
}



// 비번 유효성검사
function pwcheck(){
	let input_pw = document.querySelector('.input_pw').value;
	let input_pwcheck = document.querySelector('.input_pwcheck').value;
	let pwcheckbox=document.querySelector('.pwcheck_info');

	let pwj = /^(?=.*[a-z])(?=.*[0-9])[a-z0-9]{5,20}$/
	
	if (pwj.test(input_pw)){
		if(pwj.test(input_pwcheck)){
			if (input_pw==input_pwcheck){
				pwcheckbox.innerHTML=`사용가능한 비밀번호입니다.`;
				checkList[1]=true;
			}else {
				pwcheckbox.innerHTML=`비밀번호가 일치하지 않습니다.`;
				checkList[1]=false;
			}
		} else {
			pwcheckbox.innerHTML=`비밀번호는 영문+숫자이어야합니다. 5~20글자`;
			checkList[1]=false;
		}
	}else {
		pwcheckbox.innerHTML=`비밀번호는 영문+숫자이어야합니다. 5~20글자`;
		checkList[1]=false;
	}
}



function signupbtn(){
	if (checkList[0] && checkList[1]) {
		let input_id = document.querySelector('.input_id').value;
		let input_pw = document.querySelector('.input_pw').value;
		let team_select = document.querySelector('.team_select').value;
		let level_select = document.querySelector('.level_select').value;
		let input_name = document.querySelector('.input_name').value;
	
		
		
		let info = {input_id : input_id ,input_pw : input_pw ,
			team_select : team_select, level_select : level_select ,input_name : input_name };
			
		$.ajax({
			url : "/cms/MemberControll",
			method : "post" ,
			data : info ,
			success : r => {console.log(r)
				console.log('된다');
				if(r){
					//로그인창으로이동
				}
				
			},
			error : e => {console.log(e);}
			
			
		})
	} else {
		alert('정상적으로 입력 안된 내용이 있습니다.');
	}
}
