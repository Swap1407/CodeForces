package matrix;
import java.util.Scanner;

public class Beautiful_Matrix_263A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int r=0,c=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(mat[i][j]==1) {
					r = i+1;
					c = j+1;
				}
			}
		}
		sc.close();
		System.out.println(Math.abs(r-3)+Math.abs(c-3));
	}

}
