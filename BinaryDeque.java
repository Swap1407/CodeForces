import java.util.Scanner;

public class BinaryDeque {
	public static long query(int l, int r, int [] p) {
	    //return p[r] - (l ? p[l - 1] : 0);
	    if(l!=0) {
	    	return p[r]-p[l-1];
	    }
	    else {
	    	return p[r];
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			int sum = 0;
			int arr[] = new int[n];
			int psum[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
				psum[i] = sum;
			}
			
			int ans = Integer.MAX_VALUE;
			
			for(int i = 0; i < n; ++i) {
				int l = i, r = n - 1, pos = -1;
				while(l <= r) {
					int mid = l + r >> 1;
				    if(query(i, mid, psum) <= s) {
				    	pos = mid;
					    l = mid + 1;
					} 
				    else {
					    r = mid - 1;
				    }
				}
				if(pos == -1 || query(i, pos, psum) != s) {
					continue;
				}
				
				ans = Math.min(ans, n - (pos - i + 1));
			}
			System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
		}
		sc.close();
	}

}
