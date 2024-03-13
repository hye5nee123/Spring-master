package com.example.demo.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.SearchVO;
@Mapper
public interface EmpMapper {
	public EmpVO getEmp(EmpVO empVO); 
	//조회
	public List<EmpVO> getEmpList(EmpVO vo, SearchVO svo); 
	public void empInsert(EmpVO empVO);
	EmpVO getEmpInfo(int employeeId);
	int insertEmp(EmpVO empVO);
	int deleteEmp(int employeeId);
	List<Map<String,Object>> getStat();
	
}
