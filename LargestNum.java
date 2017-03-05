import java.util.Scanner;
public class LargestNum {
	public void logic()
	{
		int n,t=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter all elements:");
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; ++j) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("Largest number in an array is: "+t);
	}
public static void main(String args[])
{
	LargestNum l= new LargestNum();
	l.logic();
}
}


