import java.util.Scanner;

public class StringSplit {
	public void split() {
		String a;
		int sum = 0, count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		a = s.nextLine();
		char ch[] = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case '0':
				sum = sum + 0;
				continue;
			case '1':
				sum = sum + 1;
				continue;
			case '2':
				sum = sum + 2;
				continue;
			case '3':
				sum = sum + 3;
				continue;
			case '4':
				sum = sum + 4;
				continue;
			case '5':
				sum = sum + 5;
				continue;
			case '6':
				sum = sum + 6;
				continue;
			case '7':
				sum = sum + 7;
				continue;
			case '8':
				sum = sum + 8;
				continue;
			case '9':
				sum = sum + 9;
				break;
			}
			System.out.println(ch[i]);
		}
		System.out.println(sum);
	}

	public static void main(String args[]) {
		StringSplit sp = new StringSplit();
		sp.split();
	}

}
