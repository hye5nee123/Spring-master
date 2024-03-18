package com.example.demo.board;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	Integer boardNo;
	String title;
	String content;
	String writer;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	Date writeDate;
	Integer clickCnt;
	String image;
}