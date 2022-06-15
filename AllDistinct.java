import java.util.HashSet;
import java.util.Scanner;

public class AllDistinct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			HashSet<Integer> set = new HashSet<>();
			for(int i=0;i<n;i++) {
				set.add(sc.nextInt());
			}
			int s = set.size();
			if((n-s)%2 == 0){
				System.out.println(s);
			}
			else{
				System.out.println(s-1);
			}
		}
		sc.close();
	}

}
