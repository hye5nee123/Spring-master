	var empService = (function (){

		
		// 날짜 포맷
	function dateFormat(dt) {
		let date = new Date(dt);
		
		let year = date.getFullYear();
		let month = ('0' + (date.getMonth() + 1)).slice(-2);
		let day = ('0' + date.getDate()).slice(-2);
		let dateStr = `${year}-${month}-${day}`;
		
		return dateStr;
	}	
	
	// 상세조회 요청
	function infoReq(employeeId) {
		fetch("/ajax/emp/" + employeeId)
		.then(res => res.json())
		.then(res => infoRes(res))
	}
	
	// 상세조회 응답 
	function infoRes(res) {
		// input 태그에 표시
		frm.email.value = res.email;
		frm.lastName.value = res.lastName;
		frm.hireDate.value = res.hireDate;
		frm.jobId.value = res.jobId;
	}
		
	// 등록 요청
	// 1.QueryString  => Controller에서 EmpVO로 받음
	function saveReq1() {
		const lastName = frm.lastName.value;
		const email = frm.email.value;
		const hireDate = frm.hireDate.value;
		const jobId = frm.jobId.value;
		let param = `lastName=${lastName}&email=${email}&hireDate=${hireDate}&jobId=${jobId}`;
		
		fetch("/ajax/emp", {
			method : "post",
			headers: {
		        "Content-Type": "application/x-www-form-urlencoded",
		      },
			body : param,
		})
		.then(res => res.json())
		.then(res => saveRes(res))
		
		
		
	}
	// 2. FormData(제일 쉬움) => EmpVO로 받음
	function saveReq2() {
		let param = new FormData(document.frm);
		fetch("/ajax/emp",{
			method : "post",
			body : param
		})
		.then(res => res.json())
		.then(res => saveRes(res))
	}
	
	// 3. JsonString(payload) => @RequestBody로 받음
	function saveReq() {
		const lastName=frm.lastName.value;
		const email=frm.email.value;
		const jobId=frm.jobId.value;
		const hireDate=frm.hireDate.value;
		let param = {lastName, email, jobId, hireDate }
		/*fetch("/ajax/emp",{
			method : "post",
			headers: {
			      "Content-Type": "application/json",
			    },
			body : JSON.stringify(param)
		})
		.then(res => res.json())
		.then(res => saveRes(res))*/
		
		axios.post("/ajax/emp",param)
		.then(res => saveRes(res))
	}
	
	// 등록 응답
	function saveRes(res) {
		listReq();
	}
	
	// 리스트 요청
async function listReq(p){

		const param = "?page=" + p
		
		// get 방식
	/*	fetch("/ajax/empList" + param)
		.then(res => res.json())
		.then(res => {
			listRes(res)
//			})*/
//비동기     fetch
		/* axios.get("/ajax/empList" + param)
		 .then(res => listRes(res.data))*/
		 
		  const res = await axios.get("/ajax/empList" + param)
		 listRes(res.data);
	}
	
	// 리스트 응답
	function listRes(res) {
		empList.innerHTML = '';
		let i = 0;
	
		// 목록출력
		for(obj of res.data) {
			empList.innerHTML += makeTr(++i, obj);
		}
		
		// 페이징 처리
		nav.innerHTML = makePage(res.paging);
	}
	
	// 목록 출력 함수
	function makeTr(i, obj) {
		// 신청/미신청 버튼
		let bonusBtn = '<button>신청</button>';
		if(obj.salary > 10000) {
			bonusBtn = '<button>미신청</button>'
		}
		
		// 목록 출력
		let newTag = 
		`<tr>
			<td>${i}</td>
			<td onclick="infoReq(${obj.employeeId})">${obj.employeeId}</td>
			<td>${obj.firstName} ${obj.lastName}</td>
			<td>${dateFormat(obj.hireDate)}</td>
			<td>${obj.salary}</td>
			<td>${bonusBtn}</td>
			<td>
				<button type="button" onclick="move(${obj.employeeId})">조회</button>
			</td>
		</tr>`;
		
		return newTag;
	}
	
	function makePage(paging) {
		let tag = `<nav aria-label="...">
				   <ul class="pagination">`;
		
		// 이전버튼
		if(paging.startPage > 1) {
			tag += `<li class="page-item">
						<a class="page-link" href="javascript:gopage(${paging.startPage - 1})">Previous</a>
					</li>`;
		}
		// 페이지 번호
		for(i = paging.startPage; i<=paging.endPage; i++){
			tag += `<li class="page-item">
						<a class="page-link" href="javascript:gopage(${i})">${i}</a>
					</li>`	
		}
		// 다음버튼
		if(paging.endPage <= paging.lastPage) {
			tag += `<li class="page-item">
						<a class="page-link" href="javascript:gopage(${paging.endPage + 1})">Next</a>
					</li>`
		}
		tag += 	`</ul>
				</nav>`;
				
		return tag;
	}

	function move(empId){
		console.log(empId);
	}
			
		return{infoReq, saveReq,listReq}
		})();