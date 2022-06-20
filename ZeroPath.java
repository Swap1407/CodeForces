import java.util.Scanner;

public class ZeroPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int minSum[][] = new int[n][m];
			int maxSum[][] = new int[n][m];
			minSum[0][0] =  maxSum[0][0]= arr[0][0];
			for(int i=1;i<n;i++) {
				minSum[i][0] = maxSum[i][0] = minSum[i-1][0] + arr[i][0];
			}
			for(int i=1;i<m;i++) {
				minSum[0][i] = maxSum[0][i] = minSum[0][i-1] + arr[0][i];
			}
			for(int i=1;i<n;i++) {
				for(int j=1;j<m;j++) {
						minSum[i][j] = Math.min(minSum[i][j-1], minSum[i-1][j]) + arr[i][j] ;
						maxSum[i][j] = Math.max(maxSum[i][j-1], maxSum[i-1][j]) + arr[i][j] ;
				}
			}
			int k = (maxSum[n - 1][m - 1] % 2);
			boolean q=false;
			if(k==1) q=true;
			boolean l = (minSum[n - 1][m - 1] > 0);
			if(q || l || (maxSum[n - 1][m - 1] < 0)) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
		sc.close();
	}
}