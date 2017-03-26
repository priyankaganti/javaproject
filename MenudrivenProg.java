import java.util.Scanner;

public class MenudrivenProg {
	public void code() {
		int a, b = 0, n, c, fact = 1, temp, r;
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		a = s.nextInt();
		do {
			System.out.println("List of Choices:");
			System.out.println("1, Palandrome");
			System.out.println("2, Prime");
			System.out.println("3, Armstrong");
			System.out.println("4, Factorial");
			System.out.println("5. Exit");
			System.out.println("**********************");
			System.out.println("Please enter your choice:");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				temp = a;
				while (a > 0) {
					r = a % 10;
					b = b * 10 + r;
					a = a / 10;
				}
				if (b == temp) {
					System.out.println("Number is palandrome.");
				} else
					System.out.println("Number is not Palandrome.");
				break;
			case 2:
				if (a % 2 == 0) {
					System.out.println("number is not prime");
				} else
					System.out.println("number is prime");
				break;
			case 3:
				temp = a;
				while (a > 0) {
					n = a % 10;
					a = a / 10;
					b = b + (n * n * n);
				}
				if (temp == b) {
					System.out.println("Armstrong number");
				} else
					System.out.println("Not an Armstrong number");
				break;
			case 4:
				if (a < 0)
					System.out.println("Number should be non-negative.");
				else {
					for (c = 1; c <= a; c++)
						fact = fact * c;

					System.out.println("Factorial of " + a + " is = " + fact);
				}
				break;
			case 5:
				System.out.println("You have chose exit!");
				break;
			default:
				System.out.println("You entered an invalid choice");
			}

		} while (choice != 4);
	}

	public static void main(String args[]) {
		MenudrivenProg mp = new MenudrivenProg();
		mp.code();
	}
}
