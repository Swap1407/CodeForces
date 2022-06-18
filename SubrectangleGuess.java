import java.util.Scanner;

public class SubrectangleGuess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int mi=0,mj=0;
			int [][] arr = new int[n][m];
			int max = Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j] = sc.nextInt();
					max = Math.max(max, arr[i][j]);
					if(max == arr[i][j]) {
						mi = i+1;
						mj = j+1;
					}
				}
			}
			
			int h=0,w=0;
			if((n+(n%2))/2 < mi) {
				h = mi;
			}
			else {
				h = n-mi+1;
			}
			
			if((m+(m%2))/2 < mj) {
				w = mj;
			}
			else {
				w = m-mj+1;
			}
			System.out.println(h*w);

			
		}
		sc.close();
	}

}
