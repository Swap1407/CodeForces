import java.util.Scanner;

public class Creep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int zeros = sc.nextInt();
			int ones = sc.nextInt();
			for (int i = 0; i < Math.min(zeros, ones); ++ i) {
				System.out.print("01");
			}
			for (int i = 0; i < Math.abs(zeros - ones); ++ i) {
				System.out.print(zeros < ones ? 1 : 0);
			}
			System.out.println();
		}
		sc.close();
	}
}
