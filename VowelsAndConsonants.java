import java.util.Scanner;
public class VowelsAndConsonants {
	public void logic()
	{
		String a;
		int count=0,other=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		a = s.nextLine();
		String b = a.toUpperCase();
		System.out.println("Modified String is:"+"\n"+b);
		char ch[] = b.toCharArray();
		for(char c: ch)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count++;
				break;
			}
			switch(c)
			{
				case ' ':
				case '.':
					other++;
					break;
			}
	}
		System.out.println("Number of vowels : "+count);
		int l = b.length();
		int con = l-(count+other);
		System.out.println("Number of consonants:"+con);
		}
	public static void main(String args[])
	{
		VowelsAndConsonants vc = new VowelsAndConsonants();
		vc.logic();
	}
}
