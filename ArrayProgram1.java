import java.util.*;
public class ArrayProgram1
{
    public static void main(String args[])
    {
        int a[] = new int[10];
        Scanner in = new Scanner (System.in);
        System.out.println("Enter 10 integers:");
        for(int i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.print("Even numbers:");
        for(int i = 0 ; i < 10 ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
                System.out.println("");
            }
        }
    }
}
        
