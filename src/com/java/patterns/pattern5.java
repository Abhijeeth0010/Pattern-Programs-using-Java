package com.java.patterns;

public class pattern5 {
	public pattern5() {
		// TODO Auto-generated constructor stub
		for(int j = 5; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
