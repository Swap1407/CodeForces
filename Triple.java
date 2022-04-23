import java.util.Scanner;

public class Triple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int ans = -1;
			int cnt[] = new int[n+1];
	    	for(int i = 0; i < n; i++) {
	    		int x = sc.nextInt(); 
	    		int count = ++cnt[x];
	    		if(count >= 3) {
	    			ans = x;
	    		}
	    	}
	    	System.out.println(ans);
			
		}
		sc.close();
	}

}
