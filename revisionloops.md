# Predict the output:

## Question 1
```java
public class Test_1
{
    static void t1()
    {
        int s=0;
        int a[] = {2,4,6,8};
        for (int i=0; i<=1; i++)
        {
            s = a[i] + a[3-i];
            System.out.print(s);
        }
    }
    static void t2()
    {
        int val = 0;
        int ctr = 1;
        val = ++ctr;
        System.out.println("value =" + val + "\n count = " + ctr);
    }
    static void t3()
    {
        int a = 25;
        if (a>25)
           a++;
        a+=a;
        System.out.print(a);
    }
    static void t4()
    {
      for (int ctr = 1; ctr<= 10; ctr++)
      {
          System.out.print(ctr+" ");
          if (ctr%2 == 0)
            continue;
          System.out.println(" ");
      }
    }
    static void t5()
    {
    }
    static void t6()
    {
        for (int i = 1, j=i+10; i<5;i++,j=i*2)
          System.out.println("i = " + i + " j = " +j);
    }  
    static void t7()
    {
       boolean x = true;
       while (x) // INFINITE LOOP
       {
       
       }
    }
}
}                         
```
