package com.example.demo.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.BoardMapper;

@SpringBootTest
public class BoardMapperTest {
	@Autowired BoardMapper mapper;
	
	@Test
	public void 단건조회() {
		BoardVO vo = new BoardVO();
		vo.setBoardNo(null);
	}
}
