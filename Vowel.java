//to check whether the given character is vowel or consonant
import java.util.Scanner;
public class Vowel
{
	public static void main(String[] args) {
	    //int a;
	    Scanner sc=new Scanner (System.in);
		System.out.println("enter the character");
		string inp=sc.nextChar();
		if(inp=='a'||inp=='A'||inp=='a'||inp=='e'||inp=='E'||inp=='i'||inp=='I'||inp=='o'||inp=='O'||inp=='u'||inp=='a'||inp=='U')
		System.out.println("the input is vowel");
		else
		System.out.println("the input is consonant");
	}
}

