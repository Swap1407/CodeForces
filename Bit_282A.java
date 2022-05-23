
import java.util.Scanner;
public class Bit_282A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < t; ++i) {
			String s = sc.next();
			if(s.charAt(0) == '+')
	            ans++;
	        if(s.charAt(0) == '-')
	            ans--;
	        if(s.charAt(2) == '+')
	            ans++;
	        if(s.charAt(2) == '-')
	            ans--;
		}
		System.out.println(ans);
		sc.close();
	}

}
