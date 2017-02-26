import java.util.Scanner;

public class PascalTriangle {
	public void pascal()
	{
		int r,n;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of rows:"+"\n");
		r= s.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int k=r; k>i; k--)
			{
				System.out.print(" ");
			}
			n=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(n+ " ");
                 n = n * (i - j) / (j + 1);
			}
			System.out.println();
			
		}
	}
public static void main(String a[])
{
	PascalTriangle p= new PascalTriangle();
	p.pascal();
}
	}


