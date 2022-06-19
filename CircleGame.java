import java.util.Scanner;
public class CircleGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int piles = sc.nextInt();
			
			int[] pile = new int[piles];
			for(int i=0;i<piles;i++) {
				pile[i] = sc.nextInt();
			}
			if (piles % 2 == 1) {
				System.out.println("Mike");
	            continue;
	        }

	        int smallest = 0;
	        for (int i = 0; i < piles; ++i) {
	        	if (pile[i] < pile[smallest]) {
	            	smallest = i;
	            }
	        }   

	        if (smallest % 2 == 0) {
	        	System.out.println("Joe");
	        }
	        else {
	        	System.out.println("Mike");
	        }
			
		}
		sc.close();
	}

}
