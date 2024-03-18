package com.example.demo.reply.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyMapper {
	int insert(int ReplyVO);

	int read(int ReplyVO);
}
