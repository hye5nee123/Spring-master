package com.example.demo.emp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.emp.EmpSearchVO;
import com.example.demo.emp.EmpVO;
import com.example.demo.emp.mapper.EmpMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // 컨테이너 빈 등록 사용자 요청 처리 커멘트 핸들러 변환.
public class EmpController {
	final EmpMapper mapper;

	@GetMapping("/emp/insert")
	public void insert(@ModelAttribute EmpVO vo) throws Exception {
		empService.create(vo);
		return "redirect:/emp/list";
	}

	// 수정 페이지 이동.
	@GetMapping("/emp/update")
	public void update() {

	}

	@GetMapping("/emp/list")
	public String empList(Model model, EmpVO vo, EmpSearchVO svo) {
		model.addAttribute("empList", mapper.getEmpList(vo, svo));
		return "/emp/list";
	}

//	@PostMapping("/insert")
//	public String insert(@ModelAttribute("emp") EmpVO vo) {
////		vo.setPhoto(photoFile.getOriginalFilename());
//		System.out.println(vo);
////		mapper.insertEmp(vo);
//		// 커맨드 객체는 model에 추가.
////		model.addAttribute("insertResult","success");
//		return "redirect:/emp/list";
//	}
	// 수정처리

	// 삭제처리
	@DeleteMapping("emp/delete")
	public String delete(@ModelAttribute("emp") EmpVO vo, Model model) {
		return "redirect:/emp/list";
	}
	// 상세조회 페이지 이동

	// 등록페이지로 이동
	@GetMapping("/")
	public String test() {
		return "Index";
	}

}
