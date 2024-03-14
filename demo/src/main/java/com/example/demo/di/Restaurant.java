package com.example.demo.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
@Data
@Scope("prototype") //Singleton,Prototype,Request,Session 
public class Restaurant {
	
	final private Chef chef;


	
	
	}
