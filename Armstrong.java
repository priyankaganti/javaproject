import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
int n,temp,a,b=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
n=s.nextInt();
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
b=b+(a*a*a);
}
if(temp==b)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not an Armstrong number");
}
}
}



 