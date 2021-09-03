1. Read the program segment given below and answer the following questions.
```java
    public static void sample(){
      int ctr;
      for (ctr = 1; ctr <= 4; ++ctr){
          int u = func(ctr);
          System.out.print(u+" ");
      }
    }
    int func(int k){
        int z = 0;
        z+=k;
        return z;
    }
```
a. Give the output of the above code snippet. 
b. Identify the formal parameters and the actual parameters.
c. What is the function prototype of the called function?

2. Predict the output of the following code segment.
```java
int x = 10, y = 5, z;
if (x>y || x == y)
  z = ++x + --y;
System.out.println(z + " " + x + " " + y);
```
3. Write the Java Statement for the folowing expression. 
`c=a⁵+d*3/2k - √d`

4. Do as directed.
   a. State the keyword that allows users to use a package in Java.  
   b. State the default package in Java.
   
5. `int a[] = {5,8,9,7,0};` Can you perform binary search on the given array? Justify your answer.
6. `int a[] = {5, 8, 9, 7, 0};` Write the first 4 passes for sorting array `a[]` using selection sort technique.
7. Write the Java statement to declare an array containing 5 real numbers.
8. `int i = 1, j = 2, k = 3, m = 2` What do the following statements print?
   a. `System.out.println(k + m < j || 3 - j >= k);` 
   b. `System.out.println(!(k>m));`
9. Predict the output of the following. 
   a. `System.out.println(Math.floor(q++ * -2));` if `int q = 3;`.
   b. `System.out.println("WONDERFUL".substring(6));`



