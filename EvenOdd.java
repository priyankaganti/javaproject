import java.util.*;
public class EvenOdd
{
public static void main(String args[])
{
int n;
Scanner s= new Scanner(System.in);
System.out.println("Enter the number:");
n= s.nextInt();
if(n%2==0)
{
System.out.println("Number is Even");
}
else
{
System.out.println("Number is Odd");
}
}
}
