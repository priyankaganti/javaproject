import java.util.*;
public class DecimalToBinary
{
public static void main(String []args)
{
int i;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number: ");
i=s.nextInt();
String strBinary= Integer.toBinaryString(i);
System.out.println("Binary number of"+i+"is"+strBinary);
}
}