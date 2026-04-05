package DSA_patterns;

public class hollow_trianle {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			//loop for 1st pattern
			for (int j = 4; j >= i ; j--) {
				System.out.print("-");
			}
			
			//loop for 2nd pattern
			for (int j = 1; j <= i; j++) {
				if (i == 1 || i == 5 || j == 1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
