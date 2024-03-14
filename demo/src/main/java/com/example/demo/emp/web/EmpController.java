package com.example.demo.emp.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.mapper.EmpMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // 컨테이너 빈 등록 사용자 요청 처리 커멘트 핸들러 변환.
public class EmpController {

	@RequestMapping("/ajaxEmp")
	@ResponseBody
	public List<EmpVO> ajaxEmp() {
		return mapper.getEmpList(null, null);
	}
	
	final EmpMapper mapper; // 의존성 주입 dependency injection

	@PostMapping("/insert2")
	public ResponseEntity<EmpVO> insert2(EmpVO vo) {
		return new ResponseEntity<>(vo,HttpStatus.OK);
	}
	
	@RequestMapping("/empResult")
	public String result() {
		return "result";
	}
	
	@RequestMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("empList", mapper.getEmpList(null, null));
		return "empList";
	}
	
	@PostMapping("/insert3")
	public String insert3(EmpVO vo, RedirectAttributes rttr ) {
		System.out.println("등록 " + vo);
		rttr.addAttribute("inserResult","성공");
		rttr.addAttribute("flashResult","한번만");
		return "redirect:empResult";
	}

	@PostMapping("/insert")
	public ModelAndView insert(@ModelAttribute("emp") EmpVO vo, Model model) {
		System.out.println(vo);
//		mapper.insertEmp(vo);
		// 커맨드 객체는 model에 추가.
//		model.addAttribute("insertResult","success");
		ModelAndView mv = new ModelAndView();
		mv.addObject("insertResult", "success");
		mv.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		return mv;
	}

	@GetMapping("/")
	public String test() {
		return "Index";
	}



}
