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

public class common
{
    public static void main(String[] args)
    {
        int k[] = {5,6,8,10,16};
        int a[] = {2,6,16,20,25};
        int x[] = {};
        int n = 5;
 
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(a[i].equals(x[i]))
                {
                  int ele = a[i];
                  int n = x.length();
                  int x[] = add_element(n, x, ele);
                }
            }
        }
 
        System.out.println(x[]);   
    }
    public static int[] add_element(int n, int myarray[], int ele) 
    { 
         int i; 
         int newArray[] = new int[n + 1]; 
        for (i = 0; i<n; i++){
              newArray[i] = myarray[i]; 
        }
         newArray[n] = ele; 
 
        return newArray; 
    } 
}
