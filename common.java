/* Write a Java Program to input integers in two single dimensional arrays of size 'n' (accept n from the user). Define a function void getCommon 
(int m[], int n[]) to search for common values in both the arrays and store it in a third array com[]. Assume that there are no duplicate values
in the individual arrays. */

/* Sample Input:
Enter size of array: 5
m[] = {5,6,8,10,16}
n[] = {2,6,16,20,25}
*/

/* Sample Output:
com[]={6,16}
*/

import java.util.*;
public class Main {
  public static void main(String[] args) {

    int[] num = {1, 2, 3, 4, 5};
    int[] num2 = {6,7,5,3,1};
    int x[] = {};

    for (int i = 0; i < 5; i++){
        for (int j = 0; j<5; j++){
            if (num[i] == num2[j]){
                int numx = num[i];
               int k = 0;
               k = x.length;
               System.out.println(numx);
               x = addelement(k,x,numx);

            }
        }
    }
    String printed = Arrays.toString(x);
    System.out.println(printed);
  }
 public static int[] addelement(int n, int arr[], int x)
    {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;
        return newarr;
    }
}

/*Kanha Korgaonkar*/
