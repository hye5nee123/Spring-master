package com.example.demo.reply.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.reply.ReplyVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ReplyController {
	
	
	@PostMapping("/replyinsert")
	public ModelAndView insert(@ModelAttribute("reply") ReplyVO vo) {
	
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result");
		
		mv.addObject("suinsertRelt", "success");
	
		mv.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
	
		return mv;

	}
	@RequestMapping
}
