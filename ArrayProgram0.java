/**
 * Name: Kanha Korgaonkar
 * Class : 10J
 * Roll No. : 14
 *
 * Java Program Assignment - Question 5 Solution
 *
 * Question (4)
 * >> WAP to accept 10 numbers in an SDA.
 * Calculate and display the sum of the elements in the array.
 */

import java.util.*;
public class ArrayProgram5 {
public static void main(String args[]){
        
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
        
        // Computes the sum of elements of the array
        int sum = 0;
        for(int i=0; i<10;i++){
            sum+=array[i];
        }
        
        // Prints the sum
        System.out.println(sum);

}
