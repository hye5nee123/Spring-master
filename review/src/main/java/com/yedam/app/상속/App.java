package com.yedam.app.상속;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Rect());
		list.add(new Circle());

		for (Shape s : list) {
			s.draw();
		}
	}
}
