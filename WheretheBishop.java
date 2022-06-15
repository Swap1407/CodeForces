import java.util.Scanner;

public class WheretheBishop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			char [][] chess = new char[8][8];

			for(int i=0;i<8;i++) {
				String s = sc.next();
				for(int j=0;j<8;j++) {
					chess[i][j] = s.charAt(j);
				}
			}
			find(chess);
		}
		sc.close();
	}

	private static void find(char[][] chess) {
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (chess[i][j] == '#' && chess[i - 1][j - 1] == '#' && chess[i - 1][j + 1] == '#' && chess[i + 1][j - 1] == '#' && chess[i + 1][j + 1] == '#') {
					i++;
					j++;
					System.out.println(i+" "+j);
					return;
				}
			}
		}
		
		
	}

}
