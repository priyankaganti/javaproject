import java.util.Scanner;

public class Collatz {
	public void collatz() {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = s.nextInt();
		System.out.print(n + "\t ");
		for (;;) {
			if (n == 1) {
				break;
			} else if (n % 2 == 0) {
				n = (n / 2);
				System.out.print(n + "\t ");
			} else {
				n = (3 * n) + 1;
				System.out.print(n + "\t");

			}
		}
	}

	public static void main(String a[]) {
		Collatz c=new Collatz();
		c.collatz();
	}
}
