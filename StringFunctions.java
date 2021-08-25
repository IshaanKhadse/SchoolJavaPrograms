/*String Programs done on Jun 11*/
import java.util.*;
public class Junior
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
       /*
       .equalsIgnoreCase gives boolean value.
      .compareTo checks the ASCII Value and compares the difference.
         that is, if we had to compare Mango and apple, The difference is negative 20. (77 - 97=-20)
         so first string is smaller than the second string.
         
        when .compareToIgnoreCase is used, the difference is 0, so it is same.
        
       So these functions return an integer value.
      
      If strings are of irregular lengths; Java returns difference in length.
       
       Leading spaces = spaces before the text
       Preceeding Spaces = After text
       
       .trim function removes spaces before and after.m
       */
      String x = "Malayalam";
      String n = "Malayalam";
       System.out.println(x.equalsIgnoreCase(n));
       System.out.println(x.compareTo(n));
       System.out.println("Mango".compareTo("apple"));
       System.out.println("apple".compareTo("apple"));
       System.out.println("Appel".compareToIgnoreCase("apple"));
       System.out.println("banana".compareTo("apple"));
       System.out.println("Shubha".compareTo("Shubham"));
       System.out.println("it".compareTo("its"));
       String q="   Wel    Come    ";
       System.out.println(q.trim);
       System.out.println(n.startsWith("M"));
       System.out.println(n.endsWith("yam"));
       System.out.println("Item".compareTo("It"));
	}

}
