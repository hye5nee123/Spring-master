package com.example.demo.board.web;

<<<<<<< HEAD
<<<<<<< HEAD
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
	
=======
=======
>>>>>>> parent of 44a5876 (commit)
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.board.BoardVO;
import com.example.demo.board.SearchVO;
import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.common.Paging;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BoardController {

	final BoardMapper mapper;
<<<<<<< HEAD
>>>>>>> parent of 44a5876 (commit)
=======
>>>>>>> parent of 44a5876 (commit)

//	@RequestMapping("/ajaxBoard")
//	@ResponseBody
//	public List<BoardVO> ajaxBoard() {
//		return mapper.getBoardList(null, null);
//	}
//	
<<<<<<< HEAD
<<<<<<< HEAD
	
	//list 조회.
	@GetMapping("/boardList")
	public String boardList(Model model,BoardVO vo) {
		model.addAttribute("boardList", mapper.getBoardList(vo));
		return "/boardList";
=======
=======
>>>>>>> parent of 44a5876 (commit)

	// list 조회.
	// 목록페이지 이동
	@RequestMapping("/board/list")
	public String boardList(Model model, BoardVO vo, SearchVO svo, Paging pvo) {

		// 페이징처리
		pvo.setPageUnit(5); // 데이터수
		pvo.setPageSize(3); // 페이지번호
		svo.setStart(pvo.getFirst());
		svo.setEnd(pvo.getLast());
		pvo.setTotalRecord(mapper.getCount(vo, svo));
		model.addAttribute("paging", pvo);

		model.addAttribute("boardList", mapper.getBoardList(vo, svo));
		return "board/list";
	}

	@GetMapping("info/{boardNo}")
	public String info(@PathVariable int boardNo, Model model) {
		model.addAttribute("board", mapper.getBoardInfo(boardNo));
		return "/board/info";

<<<<<<< HEAD
>>>>>>> parent of 44a5876 (commit)
=======
>>>>>>> parent of 44a5876 (commit)
	}
}