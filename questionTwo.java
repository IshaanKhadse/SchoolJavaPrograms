import java.util.*;
public class questionTwo {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n,i,series=0;
		System.out.printf("Enter the value of n:");
	    n=sc.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        pr=(pr**2)+1;
	    	System.out.print(pr+" ");
	    }
	}
}
