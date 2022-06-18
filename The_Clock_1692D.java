import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class The_Clock_1692D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			int n = sc.nextInt();
			int minutes[] = {600, 60, 0, 10, 1};
			int pminutes[] = {0, 70, 140, 210, 280, 350, 601, 671, 741, 811, 881, 951, 1202, 1272, 1342, 1412};
			
			int totalMinutes = 0;
			for(int i=0;i<5;i++) {
				int a = s.charAt(i) - '0';
				totalMinutes += a * minutes[i];
			}
			
			
			Set<Integer> x = new HashSet<Integer>();
			for (int i = 0; i < 2022; i++) {
				x.add(totalMinutes);
				totalMinutes += n;
				totalMinutes %= 1440;
			}
			int res = 0;
			for (int i : x) {
				for (int j = 0; j < 16; j++) {
					if (pminutes[j] == i) {res++;}
				}
			}
			System.out.println(res);
		}
		sc.close();
	}

}
