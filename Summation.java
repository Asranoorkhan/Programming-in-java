//to print sum of number to the nth term
import java.util.Scanner;
public class Summation
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of teerms");
        int n=sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum+=i;
        }
        System.out.println("the summation is "+sum);
    }
}
