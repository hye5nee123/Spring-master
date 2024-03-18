package com.example.demo.reply.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.reply.ReplyVO;

@Mapper
public interface ReplyMapper {
	public int insert(int ReplyVO);

	public ReplyVO read(ReplyVO bno);

}
