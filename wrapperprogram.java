import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException {
       //throws IOException handles runtime error which occurs during input
       //accept input using java.util;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a number");
        // Demonstrating wrapper class - Integer is the wrapper class.
        /* Uses of Wrapper class:
        1. Converts input value (String) to its respective primitive data type.
        */
        int xx = Integer.parseInt(in.readLine());
        double k = Double.parseDouble(in.readLine());
        
    }
}
