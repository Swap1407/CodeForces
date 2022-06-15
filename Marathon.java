import java.util.Scanner;

public class Marathon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a[] = new int[4];
			for(int i=0;i<4;i++) {
				a[i] = sc.nextInt();
			}
			int count = 0;
			int aa = a[0];
			for(int i=1;i<4;i++) {
				if(aa<a[i]) {
					count++;
				}
			}
			System.out.println(count);
			
		}
		sc.close();
	}

}
