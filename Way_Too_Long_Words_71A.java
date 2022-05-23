package string;
import java.util.Scanner;

public class Way_Too_Long_Words_71A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->-1) {
			String s = sc.nextLine();
			int n = s.length();
			if(n>10) {
				String c = Integer.toString(n-2);
				System.out.println(s.charAt(0)+c+s.charAt(n-1));
			}
			else {
				System.out.println(s);
			}
		}
		sc.close();
	}

}
