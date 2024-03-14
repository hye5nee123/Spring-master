package com.example.demo.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.board.BoardVO;
import com.example.demo.board.mapper.BoardMapper;

@Controller
public class BoardController {
	@Autowired
	BoardMapper dao;

	@RequestMapping("/ajaxBoard")
	@ResponseBody
	public List<BoardVO> ajaxBoard() {
		return dao.getBoardList(null, null);
	}

	@RequestMapping("/boardList")
	public String boardList(Model model) {
		model.addAttribute("boardList", dao.getBoardList(null, null));
		return "boardList";
	}
}