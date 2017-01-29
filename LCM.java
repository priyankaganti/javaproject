import java.util.*;
public class LCM
{
public static void main(String []args)
{
int a,b,min,max,lcm=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter value of a");
a=s.nextInt();
System.out.println("Enter value of b");
b=s.nextInt();
if(a>b)
{
max=a;
min=b;
}
else
{
max=b;
min=a;
}
for(int i=1;i<=min;i++)
{
int x;
x=max*i;
if(x%min==0)
{
lcm=x;
break;
}
}
System.out.println("Lcm value is:"+lcm);
}
}