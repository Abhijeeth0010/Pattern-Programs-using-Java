package DSA_patterns;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			
			//P1
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			
			//P2
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			//P3
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			
			//P4
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
