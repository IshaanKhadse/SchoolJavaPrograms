/*
Write a program to accept a word and display its alpahbets on separate lines
*/
import java.util.*
public class alphabetprogram;
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        String x = sc.next();
        int k = x.length();
        System.out.println("The characters of the string are --");
        for (int i = 0; i<k; i++)
        {
            char c = x.charAt(0);
            System.out.println(c);
        }
	}
}
