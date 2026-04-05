package com.java.patterns;

public class spacePattern1 {
	public static void main(String[] args) {
		
		//1.
//		for(int i = 1; i <= 5; i++) {
//			for (int k = 4; k >= i; k--) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		
		//2
//		for(int i = 1; i <= 5; i++) {
//			for(int k = 1; k <= i; k++) {
//				System.out.print(" ");
//			}
//			for(int j = 5; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//3
		for(int i = 1; i <= 5; i++) {
			for(int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 4; i++) {
			for(int k = 1; k <= i ; k++) {
				System.out.print(" ");
			}
			
			for(int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
