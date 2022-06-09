package contest;

import java.util.Scanner;

public class PrintaPedestal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			if(n%3 == 0) {
				System.out.println(n/3 +" "+ ((n/3)+1) +" "+ ((n/3)-1));
			}
			else if(n%3 == 2) {
				System.out.println(((n/3)+1) +" "+ ((n/3)+2) +" "+ ((n/3)-1));
			}
			else {
				System.out.println((n/3) +" "+ ((n/3)+2) +" "+ ((n/3)-1));
			}
		}
		sc.close();
	}

}
