import java.util.Scanner;

public class CharLoc {
	public void fun() {
		String s;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		s = sc.nextLine();
		System.out.println("Enter index number:");
		n = sc.nextInt();
		int index = s.charAt(n);
		System.out.println("Character at the given location is :" + (char) index);

	}

	public static void main(String a[]) {
		CharLoc cl = new CharLoc();
		cl.fun();
	}

}
