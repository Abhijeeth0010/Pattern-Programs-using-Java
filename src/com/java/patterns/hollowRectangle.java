package com.java.patterns;

public class hollowRectangle {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i == 1 || i == 5 || j == 1 || j == 5) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		char x = 'A';
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(x);
			}
			System.out.println();
			x++;
		}
		
		char y = 'C';
		for(int i = 1; i <= 3; i++) {
			for(int j = 3; j >= i; j--) {
				System.out.print(y);			
			}
			System.out.println();
			y--;
		}
	}
}