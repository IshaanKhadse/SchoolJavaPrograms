import java.util.*;
public class armstrongnumber {

    public static void main(String[]args){
    
    }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r=0,c=0,s=0,k=n,a=n;
        while(n>0)
        {
            c=c+1;
            n=n/10;
        }
        while(a>0)
        {
            r=a%10;
            s=s+(int)Math.pow(r,c);
            a=a/10;
        }
        if(s==k)
        {
            System.out.println("It is a narcisst no");
        }
        else
        {
            System.out.println("It is not a narcisst no");
        }
    }
}
