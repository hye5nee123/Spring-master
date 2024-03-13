package com.example.demo.emp;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.mapper.EmpMapper;

@SpringBootTest
public class EmpMapperTest {
	
	@Autowired EmpMapper mapper;
	
	@Test
	public void 사원전체조회() {
		EmpVO vo = new EmpVO();
		SearchVO svo = new SearchVO();
//		vo.setDepartmentId("50");
//		vo.setFirstName("Kevin");
//		vo.setManagerId("103");
//		vo.setStart(1);
//		vo.setEnd(5); +01,102});
		List<EmpVO> list = mapper.getEmpList(vo ,svo);
		
		for (EmpVO evo : list) {
			System.out.println(evo.getEmployeeId() + " : " + evo.getLastName());
		}
		
		System.out.println("결과는 : " + list.size());
//		assertEquals(list);
	}
	
////	@Test
//	public void 사원단건조회() {
//		int employeeId = 100;
//		EmpVO vo = mapper.getEmpInfo(employeeId);
//		System.out.println(vo);
////		assertEquals(employeeId, vo.getEmployeeId());
//	}
//	
//	@Test
//	public void 사원등록() {
//	    // vo 객체 생성
//	    EmpVO vo = EmpVO.builder()
//	            .lastName("홍")
//	            .email("a1@a.com")
//	            .hireDate(new Date())
//	            .jobId("IT_PROG")
//	            .build();
//
//	    int result = mapper.insertEmp(vo);
//	    System.out.println("등록된 사번: " + vo.getEmployeeId());
//	    System.out.println("등록건수: " + result);
//	}
	
//    @Test
//    public void 사원삭제() {
//        // 삭제할 사원의 employeeId 지정
//        int employeeId = 300;
//        
//        // EmpMapper를 사용하여 사원 삭제
//        int deletedRows = mapper.deleteEmp(employeeId);
//        
//        // 삭제된 행의 수 출력
//        System.out.println("삭제된 행의 수: " + deletedRows);
//    }
//	
//	@Test
//	public void 사원통계() {
//		List<Map<String,Object>> list = mapper.getStat();
//		for(Map<String,Object> map :list) {
//			System.out.println(map.get("DEPARTMENT_NAME")+":"+ map.get("CNT"));
//		}
//	}
}
