# Practice Questions
August 28, 2021

## Question 1
1. State any two tokens of Java with an example. 
2. Predict the output of the following statement in Java where `int n1=15, n2=20;`
   ```
   System.out.println((n1<n2)&&(n1==5));
   ```
3. How are primitive data types passed in Java?
4. Write the prototype of a function check() which accepts one integer and one character argument and returns a boolean value.
5. Differentiate between the `equals() `and `compareTo()` functions of the String class.

## Question 2
1. Differentiate between pure and impure functions in Java.
2. Write the Java statement to -
   a. Find if a character variable called `var` contains a letter or not. 
   b. Allow the user to use classes defined in a package.
3. Write the Java statement for the following. 
   a. x = a⁵ + b + a/b²;
   b. y = (-b + b² - 4ac)/2a;
4. State the use of the default statement in Java.
5. Explain delay loop with an example.

## Question 3
1. Predict the output of the following program code (show working)
   ```
   int s = 0;
   int a[] = {2,4,6,8};
   for (int i=0; i <= 1; i++)
   {
       s = a[i]+a[3-i];
       System.out.print(s);
   }
   ```
2. Predict the output of the following code (show working)
   ```
   int val = 0;
   int ctr = 1;
   val = ++ctr;
   System.out.println("value ="+val+"\n count ="+ctr);
   ```
3. Given the following statement - `final double pi = 3.14;`, what does the keyword `final` signify?
4. Rewrite the following program code using `for` statement.
   ```
   int amt=0;
   while(amt>0)
   {
       System.out.println(amt);
       amt-=1;
   }
   ```
5. Predict the output of the following program code. 
   ```
   void t3()
   {
       int a = 25;
       if (a>25)
           a++;
       
6. Write the definition of a function `int sum(int x)` which calculates and returns the sum of the digits present in `x`.
7. Predict the output of the following program code. (show the working)
   ```
   void main ()
   {
        for(int ctr = 1; ctr <= 10; ctr++)
        {
             System.out.print(ctr+" ");
             if (ctr%2 == 0)
                 continue;
             System.out.println(" ");
        }
    }
8. Write the equivalent `while` loop for the following.
   ```
   for (; ;)
   {
        System.out.println("Welcome");
   }
   ```
9. Differentiate between Type Casting and Coercion in Java with an example.
10. Why is Java called a _Platform Independent Language_?
