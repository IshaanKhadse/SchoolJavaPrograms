/**
 * Name: Kanha Korgaonkar
 * Class : 10J
 * Roll No. : 14
 *
 * Java Program Assignment - Question 5 Solution
 *
 * Question (5)
 * >> WAP to accept 10 numbers in a SDA, display the largest and the smallest value of array
 */

import java.util.*;
public class ArrayProgram5 {
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

        // Finds the smallest and largest lements of the array
        int smallest= array[0];
        int largest = array[0];
        for(int i=1; i< array.length; i++) {
            if(array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        
        // Prints the largest and the smallest values
        System.out.println("Largest Value:" + largest);
        System.out.println("Smallest Value:" + smallest);
}
}
