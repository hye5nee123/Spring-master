package com.example.demo.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	String boardNo;
	String title;
	String content;
	String writer;
	String writeDate;
	int clickCnt;
	String image;
}


