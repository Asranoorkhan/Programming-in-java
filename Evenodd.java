//to find whether a given number is even or odd
import java.util.Scanner;
public class Evenodd
{
	public static void main(String[] args) {
	    //int a;
	    Scanner sc=new Scanner (System.in);
		System.out.println("enter the integer ");
		int a=sc.nextInt();
		//System.out.println(a);
		if(a%2==0)
		System.out.println("the integer is even");
		else
		System.out.println("the integer is odd");
	}
}
