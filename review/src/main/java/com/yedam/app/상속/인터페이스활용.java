package com.yedam.app.상속;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.yedam.app.EmpVO;

public class 인터페이스활용 {
	public static void main(String[] args) {
		List<EmpVO> list = new ArrayList<>();
		list.add(new EmpVO("김현준", "로봇",3000));
		list.add(new EmpVO("로봇은", "매일 아프다",4000));
		list.add(new EmpVO("집", "가고 싶다...",5000));
		list.add(new EmpVO("피곤", "하다...",6000));

//		Collections.sort(list,(EmpVO o1, EmpVO o2) -> o1.getFirstName().compareTo( o2.getLastName()) );
//		
//		for (EmpVO vo : list) {
//			System.out.println(vo.getFirstName() + "" + vo.getLastName());
//		}

		Collections.sort(list, (EmpVO o1, EmpVO o2) -> (o2.getSalary() - o1.getSalary()));
		for (EmpVO vo : list) {
			System.out.println(vo.getFirstName() + " " + vo.getLastName() + " " + vo.getSalary());
		}
	}
}

class EmpCompare implements Comparator<EmpVO> {
	@Override
	public int compare(EmpVO o1, EmpVO o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}
