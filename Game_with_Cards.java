package contest;

import java.util.Arrays;
import java.util.Scanner;

public class Game_with_Cards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int alice[] = new int[n];
			for(int i=0;i<n;i++) {
				alice[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			int bob[] = new int[m];
			for(int i=0;i<m;i++) {
				bob[i] = sc.nextInt();
			}
			Arrays.sort(alice);
			Arrays.sort(bob);
			if(alice[n-1] == bob[m-1]) {
				System.out.println("Alice");
				System.out.println("Bob");
			}
			else if(alice[n-1] > bob[m-1]) {
				System.out.println("Alice");
				System.out.println("Alice");
			}
			else {
				System.out.println("Bob");
				System.out.println("Bob");
			}
		}
		sc.close();
	}

}
