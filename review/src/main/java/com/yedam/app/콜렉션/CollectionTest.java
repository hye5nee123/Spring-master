package com.yedam.app.콜렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.yedam.app.EmpVO;

public class CollectionTest {
	public static void main(String[] args) {

		// 중복값 제거.
		List<Integer> list = Arrays.asList(3, 3, 10, 11, 14, 3);
		System.out.println(list);

		// list => set
		HashSet set = new HashSet<>(list);
		System.out.println(set);

//		//List<EmpVO>
//		List<EmpVO> empList = new ArrayList<>();
//		empList.add(new EmpVO("김현준", "로봇",3000));
//		empList.add(new EmpVO("로봇은", "매일 아프다",4000));
//		empList.add(new EmpVO("집", "가고 싶다...",5000));
//		empList.add(new EmpVO("집", "가고 싶다...",5000));
//		
//		HashSet<EmpVO> empSet = new HashSet<>(empList);
//		System.out.println(empList.size());
////		List
//		for(i : empList) {
//			
//		}

		// List<EmpVO>
		List<EmpVO> empList = new ArrayList<>();
		empList.add(new EmpVO("전", "정국", 3000));
		empList.add(new EmpVO("서", "강준", 4000));
		empList.add(new EmpVO("차", "은우", 5000));
		empList.add(new EmpVO("김", "영훈", 5000));

		HashSet<EmpVO> empSet = new HashSet<>(empList);

		List<EmpVO> filterList = new ArrayList<>(empSet);

		System.out.println(filterList.size());
		for (EmpVO vo : filterList) {

			if (vo.getSalary() < 15000) {
				filterList.add(vo);
			}
		}
		filterList = empSet.stream().filter(vo -> vo.getSalary() >= 15000).collect(Collectors.toList());
		
		
		for(EmpVO vo : filterList) {
			if(vo.getFirstName().equals("전")) {
				System.out.println(filterList.size());
			}
		}
		

	}
}
