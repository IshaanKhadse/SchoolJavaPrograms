import java.util.*;

public class KrishnamurthyNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(“Enter the number”);
		int x=sc.nextInt();
		int f=1;
		int s=0;
		int y=x;
		while(x!=0)
		{
			f=1;
			int r=x%10;
			for(int i=1; i<=r;i++)
			{
				int r=f*i;
			}
			s=s+f;
			x=x/10;
		}
		if(s==y)
		{
			System.out.println(“Is a Krishnamurthy number”);
		}
		else
		{
			System.out.println(“Is NOT a Krishnamurthy number”);
		}

	}

}
