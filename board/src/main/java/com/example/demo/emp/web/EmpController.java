package com.example.demo.emp.web;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.common.Paging;
import com.example.demo.emp.EmpSearchVO;
import com.example.demo.emp.EmpVO;
import com.example.demo.emp.mapper.EmpMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // 컨테이너 빈 등록 사용자 요청 처리 커멘트 핸들러 변환.
public class EmpController {
	final EmpMapper mapper;

	// 등록페이지 이동
	@GetMapping("/emp/insert")
	public void insert() {
	}

	// 등록처리
	@PostMapping("/insert")
	public String insert(@ModelAttribute("emp") EmpVO vo, MultipartFile photoFile)
			throws IllegalStateException, IOException {
		// 파일업로드
		File file = new File("d:/upload", photoFile.getOriginalFilename());
		photoFile.transferTo(file);

		vo.setPhoto(photoFile.getOriginalFilename());
		System.out.println(vo);
		mapper.insertEmp(vo);
		return "redirect:/emp/list";
	}

//	// 수정 페이지 이동.
//	@GetMapping("/emp/update{empId}")
//	public String update(@PathVariable int empId) {
//		System.out.println(empId);
//		return "Index";
//	}
	// 수정 페이지 이동.
	@GetMapping("/emp/update/{empId}")
	public String update(@PathVariable int empId, Model model) {
		model.addAttribute("emp", mapper.getEmpInfo(empId));
		System.out.println(empId);
		return "emp/update";
	}

	@GetMapping("/emp/list")
	public String empList(Model model, EmpVO vo, EmpSearchVO svo, Paging pvo) {
		// 페이징처리
		svo.setStart(pvo.getFirst());
		svo.setEnd(pvo.getLast());
		pvo.setTotalRecord(mapper.getCount());
<<<<<<< HEAD
		model.addAllAttribute("paging", pvo);
=======
		model.addAttribute("paging", pvo);
>>>>>>> parent of 44a5876 (commit)
		// 목록조회

		model.addAttribute("empList", mapper.getEmpList(vo, svo));
		return "emp/list";
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
