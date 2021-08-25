import java.util.*;
public class SumAscii {
    public static void sum(String a) {
        int sum=0;
        for (int i = 0; i<a.length(); i++)
        {
            char ch=a.charAt(i);
            int c=(int)ch;
            sum = sum + c;
        }
        System.out.println("The sum is " + sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String k = sc.next();
        sum(k);
    }
}
