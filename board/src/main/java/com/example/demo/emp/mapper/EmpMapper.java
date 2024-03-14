package com.example.demo.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.emp.EmpSearchVO;
import com.example.demo.emp.EmpVO;

@Mapper
public interface EmpMapper {
	public EmpVO getEmp(EmpVO empVO);

	// 조회
	public List<EmpVO> getEmpList(EmpVO vo, EmpSearchVO svo);

	public void empInsert(EmpVO empVO);

	EmpVO getEmpInfo(int employeeId);

	int insertEmp(EmpVO empVO);

	int deleteEmp(int employeeId);

	List<Map<String, Object>> getStat();

	@Select("select * from employees")
	public List<EmpVO> getList();

}
