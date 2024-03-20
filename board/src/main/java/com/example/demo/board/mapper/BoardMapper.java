package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.board.BoardVO;
import com.example.demo.board.SearchVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> getBoardList(@Param("vo") BoardVO vo, SearchVO svo);

	BoardVO getBoardInfo(int boardNo);

	int insertBoard(BoardVO vo);

	int updateBoard(BoardVO vo);

	int deleteBoard(int boardNo);
<<<<<<< HEAD

	int getBoardList(BoardVO vo);
=======
	public long getCount(BoardVO vo,SearchVO svo);

>>>>>>> parent of 44a5876 (commit)
}