/* 3) WAP to accept the names of 10 cities and
        their respective rainfall. Display the name
        of the city that has maximum rainfall. */
import java.util.*;
public class arrays
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String cities[] = new String[10];
        int rainfall[] = new int[10];
        System.out.println("Enter " + 10 + " cities and their rainfall:");

        for (int i=0;i<10;i++)
        {
            System.out.println("Enter City Name: ");
            cities[i] = in.nextLine();
            System.out.println("Enter its Rainfall: ");
            rainfall[i] = in.nextInt();
        }

        int maxrainfall = rainfall[0];
        for(int i=1; i<10; i++)
        {
            if(rainfall[i] > maxrainfall)
            maxrainfall = rainfall[i];
        }

        int index = Arrays.binarySearch(rainfall, maxrainfall);

        System.out.println(cities[index]);
    }
}
