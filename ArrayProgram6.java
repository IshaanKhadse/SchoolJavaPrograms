/**
 * Name: Kanha Korgaonkar
 * Class : 10J
 * Roll No. : 14
 *
 * Java Program Assignment - Question 6 Solution
 *
 * Question (6)
 * >> WAP to accept 10 numbers in an SDA, display only the palindrome numbers of the array.
 */

import java.util.*;
public class ArrayProgram6 {
    public static void main(String args[]) {

        // Creates a scanner class
        Scanner sc = new Scanner(System.in);

        // Creates a single dimension array
        int array[] = new int[10];

        // Accepts ten integer elements of array
        System.out.println("Enter ten integers in a SDA when prompted");
        for (int k=0;k<10;k++){
            System.out.println("Enter an integer");
            array[k]=sc.nextInt();
        }

        // Finds the palindromes
        int remainder,sum=0,temp;
        for(int i=0; i<10; i++) {
            temp = array[i];
            while(array[i]>0) {
                remainder=array[i]%10;   
                sum=(sum*10)+remainder;
            }
            if(temp==sum) {
                System.out.println(array[i]);    
            }
        }
}
}
