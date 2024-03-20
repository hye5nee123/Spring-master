package com.example.demo.board;

import java.util.Date;

<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.format.annotation.DateTimeFormat;
=======
import org.springframework.format.annotation.DateTimeFormat;

>>>>>>> parent of 44a5876 (commit)
=======
import org.springframework.format.annotation.DateTimeFormat;

>>>>>>> parent of 44a5876 (commit)
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
<<<<<<< HEAD
<<<<<<< HEAD
	@DateTimeFormat(pattern = "yyyy/MM/dd")
=======
	@DateTimeFormat(pattern = "yyyy/MM/dd")
>>>>>>> parent of 44a5876 (commit)
=======
	@DateTimeFormat(pattern = "yyyy/MM/dd")
>>>>>>> parent of 44a5876 (commit)
	Date writeDate;
	Integer clickCnt;
	String image;
}