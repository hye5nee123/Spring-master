package com.example.demo.ex;

import java.util.List;

import lombok.Data;

@Data
public class ExVO {
	private String username;
	private String password;
	private List<String> hobby;
}
