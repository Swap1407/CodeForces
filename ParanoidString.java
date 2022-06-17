import java.util.Scanner;

public class ParanoidString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long count = n;
			String s = sc.next();
			for(int i=1;i<n;++i) {
				
				if(s.charAt(i) != s.charAt(i-1)) {
					count += i;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
