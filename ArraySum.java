import java.util.*;
public class ArraySum
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int sum=0;
for(int i=0;i<=3;i++)
{
sum=sum+a[i];
}
System.out.println("Sum of array elements is :"+sum);
}
}
