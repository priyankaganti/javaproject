import java.util.Scanner;

public class UnicodeBefIndex {
	public void code() {
		String s;
		int n, index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		s = sc.nextLine();
		System.out.println("Enter the index value: ");
		index = sc.nextInt();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			n = (int) ch[i];
			if (i == index) {
				n = (int) ch[i - 1];
				System.out.println(" character before index point is" + ch[i - 1]);
				System.out.println("Unicode of character before index point is" + n);
				break;
			}
		}
	}

	public static void main(String[] a) {
		UnicodeBefIndex u = new UnicodeBefIndex();
		u.code();
	}

}
