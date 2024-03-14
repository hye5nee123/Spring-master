package com.example.demo.di;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.Setter;
@SpringBootTest
public class DiTest {
	
	@Autowired
	private Restaurant restaurant;
	
//	@Test
//	public void test() {
//		System.out.println(restaurant);
//		assertThat(restaurant).isNull();
////		assertThat(restaurant).isNotNull();
//	}
//	
	@Setter(onMethod_ = { @Autowired } )
	private Restaurant restaurant1;
	@Test
	public void 스코프비교() {
		assertThat(restaurant == restaurant1).isTrue();
	}
////	@Test
//	public 	void test() {
//		assertThat(restaurant.getChef()).isNotNull();
//}
}
