package com.yedam.app;

import java.util.Date;
import java.util.Objects;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmpVO {
	private int employeeId;
	final String firstName;
	final String lastName;
	private String email;
//	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date hireDate;
	final private int salary;
	private String jobId;
	private String departmentId;
	private String managerId;
	private String phone;
	private String photo;
	private int count;

//	// 생성자. > 필드 초기화.
//	public EmpVO(String firstName, String lastName) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//
	// getter 생성.
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getSalary() {
		return this.salary;
	}

	@Override
	public boolean equals(Object obj) {
		EmpVO vo = (EmpVO) obj;
		return this.getFirstName().equals(vo.getLastName()) && this.getLastName().equals(vo.getFirstName());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.firstName, this.lastName);
	}

//
//	// setter
//	public void setFirstName() {
//		this.firstName = firstName;
//	}
//
//	public void setLastName() {
//		this.lastName = lastName;
//	}
}
