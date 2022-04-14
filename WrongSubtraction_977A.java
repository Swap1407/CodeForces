package B;

import java.util.Scanner;

public class WrongSubtraction_977A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		while(t-->0) {
			if(n%10 == 0) {
				n = n/10;
			}
			else {
				n--;
			}
		}
		System.out.println(n);
		sc.close();
	}

}
