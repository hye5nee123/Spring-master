package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.BoardVO;
import com.example.demo.board.mapper.BoardMapper;

@SpringBootTest
class BoardApplicationTests {
@Autowired BoardMapper mapper;
	
	@Test
	public void 게시글단건조회() {
		int boardNo = 10;
		BoardVO bvo = mapper.getBoardInfo(boardNo);
		System.out.println(bvo);
		assertEquals(Integer.toString(boardNo), bvo.getBoardNo());
}
}
