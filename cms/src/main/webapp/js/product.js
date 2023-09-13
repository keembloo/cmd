console.log('product실행');
pview();
// 제품 출력 함수
function pview(){
	let pTable = document.querySelector('.pTable');
		
		let html = '';
		let basic = `<tr class="pTitle">
						<th>등록번호</th>
						<th>제품명</th>
						<th>가격</th>
						<th>사이즈</th>
						<th>컬러</th>
						<th>생산자</th>
						<th>등록일</th>
						<th>재고</th>
						<th>제품코드</th>
						<th>비고</th>
					</tr>`;
				
	$.ajax({
		url : "/cms/ProductControll" , 
		method : "get" ,
		data : {},
		success : r=>{
			console.log(r);	
			r.productDto.forEach( p => {
					html += `<tr class="pContent">
						<td>1</td>
						<td>무지반팔티셔츠</td>
						<td>15000원</td>
						<td>100(L)</td>
						<td>블랙</td>
						<td>김사원</td>
						<td>2023-09-01</td>
						<td>100</td>
						<td>AA001</td>
						<td>
							<button class="peditBtn" type="button">수정</button>
							<button class="pdeleteBtn" type="button">삭제</button>
						</td>
					</tr>`;	
					
			pTable.innerHTML = basic+html;
			
			});	

		},
		error : e=>{console.log(e);}
	})
	
}

