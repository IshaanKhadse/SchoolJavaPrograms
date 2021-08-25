import java.util.*;
public class checkprime {
    public static void isPrime() {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int f=0;
        for(int i=2;i<x;i++)
        {
            if (x%i==0)
            {
                f=1;
                break;
            }
        }
        if (f==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
    public static void main(String[] args)
    {
        isPrime();
    }
}
