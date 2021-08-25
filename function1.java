/*Write a function that returns the sum of first n natural numbers.*/
import java.util.*;
public class function1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum2 = summ(n);
        System.out.println("The sum is" + sum2);
    }

    static int summ(int n)
    {
        int sum = 0;
        for (int i=0; i<=n; i++)
        {
            sum = sum + i;
        }
        return sum;
    }

}
    
