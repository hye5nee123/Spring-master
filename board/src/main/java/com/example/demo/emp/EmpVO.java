package com.example.demo.emp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
 public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	Date hireDate;
	Integer salary;
	String jobId;
	String departmentId;
	String managerId;
	String phoneNumber;
	String photo;
	//integer int 차이 생각.
	Integer commissionPct;
	}
