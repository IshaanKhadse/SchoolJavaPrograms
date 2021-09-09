import java.util.*;
public class BubblesortNameScore
{
    public static void main()
    {
        String m[]=new String[5];
        int s[]=new int[5];
        Scanner ob=new Scanner(System.in);
        int i,j,t=0; String t1=""; 
        System.out.println("Enter names and the marks");
        for(i=0;i<5;i++)
        {
            m[i]=ob.next();
            s[i]=ob.nextInt();
        }
         for(i=0;i<4;i++)
        {
            for(j=0;j<4-i;j++)
            {
                if(s[j]<s[j+1])
                {
                    t=s[j];         t1=m[j];
                    s[j]=s[j+1];    m[j]=m[j+1];
                    s[j+1]=t;       m[j+1]=t1;
                }
            }
        }
        System.out.println("Sorted names and marks ");
        for(i=0;i<5;i++)
        {
            System.out.println(m[i] +"\t\t\t"+s[i]);
        }
    }
}
