import java.util.*;
public class UsingReturn3 {
    // Function to extract substring of string k from position n
    public static String extract(String k, int n) {
        String extracted = k.substring(n);
        return extracted;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Accepts input for string and position
        System.out.println("Enter the string");
        String k = sc.nextLine();
        System.out.println("Enter the position");
        int n = sc.nextInt();
        // Calls function
        String extracted = extract(k,n);
        // Prints result
        System.out.println("The string extracted is --");
        System.out.println(extracted);
    }
}
