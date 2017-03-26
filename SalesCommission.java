import java.util.Scanner;

public class SalesCommission {
	public void commission() {
		int sales, comm = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sales value:");
		sales = s.nextInt();
		if (sales < 1000) {
			System.out.println("No Commission:");
		} else if (sales > 1000 && sales < 10000) {
			comm = (sales * 10) / 100;
			System.out.println("Commission is:" + comm);
		}
		if (sales > 10000) {
			comm = sales + (sales * 12) / 100;
			System.out.println("Commission is:" + comm);
		}
	}

	public static void main(String args[]) {
		SalesCommission sc = new SalesCommission();
		sc.commission();
	}
}
