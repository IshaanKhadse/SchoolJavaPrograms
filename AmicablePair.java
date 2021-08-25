/* Question - An amicable pair of numbers is a pair x and y such that the sum of the factors
of y is equal to x. Design a function int sumOfFactors(int n) for calculating the sum of the factors of a number
n and returning it. Write a program to input two integers and check and display if they form amicable pairs and display accordingly.*/
import java.util.*;
public class AmicablePair {
    public static void main(String[] args){
        int num1, num2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int sum1 = sumOfFactors(num1);
        int sum2 = sumOfFactors(num2);
        if (sum1 == num2 && sum2==num1){
            System.out.println("Yes, the numbers are an amicable pair.");
        }
        else
        {
            System.out.println("Yes, the numbers are an amicable pair.");
        }
    }
    public static int sumOfFactors(int n){
            int num1 = n;
            int sum = 0;
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0)
                    sum += i;
            }
            return sum;
    }
}
