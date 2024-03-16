package com.yedam.app;

import java.util.List;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

	@Test
	public void testImmutableCollections() {

		List<String> fruits = List.of("Mangosteen", "Durian fruit", "Longan");

		assertThrows(UnsupportedOperationException.class, () -> {
			fruits.add("Mango");
			fruits.remove(1);
		});

		assertEquals(3, fruits.size());

	}
}
