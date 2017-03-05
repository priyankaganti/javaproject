import java.util.Scanner;

public class Unicode {
	public void code() {
		String x; 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String:");
		x = s.nextLine();
		System.out.println("Enter index values:");
		int index = s.nextInt();
		int uniCode = x.charAt(index);
		System.out.println("unicode value is:"+uniCode);
	}

	public static void main(String[] args) {
		Unicode un = new Unicode();
		un.code();

	}
}
