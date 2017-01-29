import java.util.*;
public class CelToFarh
{
public static void main(String []args)
{
double d;
Scanner s=new Scanner(System.in);
System.out.println("Enter celsius value:");
d=s.nextDouble();
double e,f,n;
e=d*9;
f=e/5;
n=f+32;
System.out.println("Fahrenheit value is:"+n);
}
}
 
