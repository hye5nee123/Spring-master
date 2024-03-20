package com.example.demo.reply.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.reply.ReplyVO;

@Mapper
public interface ReplyMapper {
	public int insert(int ReplyVO);

<<<<<<< HEAD
<<<<<<< HEAD
	public ReplyVO read(ReplyVO rno);
=======
	public ReplyVO read(ReplyVO bno);
>>>>>>> parent of 44a5876 (commit)
=======
	public ReplyVO read(ReplyVO bno);
>>>>>>> parent of 44a5876 (commit)

}
