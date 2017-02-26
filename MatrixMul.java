import java.util.*;

public class MatrixMul {
	public static void main(String args[]) {
		int n, m, p, q, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("Enter number of rows and columns of matrix 1:");
		m = s.nextInt();
		n = s.nextInt();
		System.out.println("Enter number of rows and columns of matrix 2:");
		p = s.nextInt();
		q = s.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[p][q];
		System.out.println("Enter first matrix elements:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = s.nextInt();
			}
		}
		if (n != p) {
			System.out.println("Matrix multiplication can't be done.");
		} else
			System.out.println("Enter elements of second matrix :");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				b[i][j] = s.nextInt();
			}
		}
		System.out.println(" Multiplying two matices :");
		int c[][] = new int[m][q];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				for (int k = 0; k < p; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}

		System.out.println("result of Matrix multiplication is:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
