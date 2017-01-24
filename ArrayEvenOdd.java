import java.util.Scanner;

public class ArrayEvenOdd {
		public static void main(String args[])
		{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all elements:");
		for(int i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		System.out.println("Even elements are:");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print("\t"+a[i]);
			}
		}
			System.out.println("\n"+"Odd elements are:");
			for(int i=0;i<n;i++)
			{
			if(a[i]%2!=0)
			{
				
				System.out.print("\t"+a[i]);
			}
			}
	}

}
