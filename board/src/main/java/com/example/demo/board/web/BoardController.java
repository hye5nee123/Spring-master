package com.example.demo.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.board.BoardVO;
import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.emp.EmpVO;
import com.example.demo.emp.mapper.EmpMapper;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class BoardController {
	
	final BoardMapper mapper;
	

//	@RequestMapping("/ajaxBoard")
//	@ResponseBody
//	public List<BoardVO> ajaxBoard() {
//		return mapper.getBoardList(null, null);
//	}
//	
	
	//list 조회.
	@GetMapping("/boardList")
	public String boardList(Model model,BoardVO vo) {
		model.addAttribute("boardList", mapper.getBoardList(vo));
		return "/boardList";
	}
}