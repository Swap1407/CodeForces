import java.util.Scanner;

public class OptimalPath_1700A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextInt();
			long m = sc.nextInt();
			long ans = ((m-1)*(m)/2) + m*(n*(n+1)/2);
			System.out.println(ans);
		}
		sc.close();
	}

}

