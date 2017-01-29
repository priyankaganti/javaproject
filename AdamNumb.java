import java.util.*;
public class AdamNumb
{
public static void main(String []args)
{
Ex e=new Ex();
int i,sq,r,sqr,sqrr;
Scanner s= new Scanner(System.in);
System.out.println("Enter value of i:");
i=s.nextInt();
sq=i*i;
System.out.println("Squared value is:"+sq);
r=e.reverse(sq);
System.out.println("Reversed value of sq :"+r);
sqr=(int)Math.sqrt(r);
System.out.println("Square root of reversed num :"+sqr);
sqrr=e.reverse(sqr);
System.out.println("reverse of sqr num:"+sqrr);
if(i==sqrr)
{
System.out.println("It's an adam number.");
}
else
{
System.out.println("It's not an adam number.");
}
}
}

class Ex
{
public int reverse(int sq)
{
int r=0;
while(sq>0)
{
r=r*10+sq%10;
sq=sq/10;
}
return(r);
}
}

