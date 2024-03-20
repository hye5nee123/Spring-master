package com.example.demo.board;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.BoardMapper;

@SpringBootTest
public class BoardMapperTest {
	
	@Autowired BoardMapper mapper; 
	
	// 게시글 검색, 페이징
	@Test
	public void boardList() {
		BoardVO vo = BoardVO.builder()
//						.title("글")
						.content("공부")
//						.writer("김")
						.build();
		SearchVO svo = new SearchVO();
		
		List<BoardVO> list = mapper.getBoardList(vo, svo);
		
		for(BoardVO bvo : list) {
			System.out.println(bvo.getBoardNo() + " : " 
								+ bvo.getTitle() + " : "
								+ bvo.getContent() + " : "
								+ bvo.getWriter());
		}
		System.out.println("결과는 : " + list.size());
	}
	
	// 게시물 단건조회
//	@Test
	public void boardInfo() {
		int boardNo = 1;
		BoardVO vo = mapper.getBoardInfo(boardNo);
		
		System.out.println(vo);
	}
	
	// 게시글 등록
//	@Test
	public void insertBoard() {
		BoardVO vo = BoardVO.builder()
							.title("test title1")
							.content("test content1")
							.writer("조혜원")
							.writeDate(new Date())
							.clickCnt(0)
							.build();
		int result = mapper.insertBoard(vo);
		
		System.out.println("등록된 사번 : " + vo.getBoardNo());
		System.out.println("등록건수 : " + result);
	}
	
	// 게시글 수정
//	@Test
	public void updateBoard() {
		BoardVO vo = BoardVO.builder()
							.boardNo(41)
							.title("title update")
							.content("content update")
							.build();
		int result = mapper.updateBoard(vo);
		System.out.println("수정건수 : " + result);
	}
	
	// 게시글 삭제

//	@Test
	public void deleteBoard() {
		int boardNo = 41;
		int result = mapper.deleteBoard(boardNo);
		System.out.println("삭제건수 : " + result);
	}
}