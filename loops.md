# Fill in the blanks

## Question 1
When the statements are repeated sequentially a number of times in a program, the construct is known as loop.

## Question 2
For loop is also known as entry controlled loop.

## Question 3
do-while loop is called an exit controlled loop.

## Question 4
do-while loop executes at least once, if the condition is false.

## Question 5
while loop checks the condition first before its execution.

## Question 6
To find the sum of any ten numbers, the loop will run ten times.

# Answer the following questions

## Question 1
What is 'for' loop? What are the parameters used in 'for' loop?
> for loop is an entry-controlled loop. The following parameters are commonly used in a for loop:

An initial value for the loop control variable.
A condition—loop will iterate as long as this condition remains true.
An update expression to modify the loop control variable after every iteration.
Body of the loop which consists of the statements that needs to be repeatedly executed.
Below is an example of for loop, it prints the table of 2 till 12:
```java
for (int i = 1; i <= 12; i++) {
    int a = 2 * i;
    System.out.println("2 x " + i + "\t= " + a);           
}
```

## Question 2

Define the following with their constructs:

(a) Entry controlled loop

An entry-controlled loop checks the condition at the time of entry. Only if the condition is true, the program control enters the body of the loop. for and while loops are entry-controlled loops.

(b) Exit controlled loop

An exit-controlled loop checks the condition after executing its body. If the condition is true, loop will perform the next iteration otherwise program control will move out of the loop. do-while loop is an exit-controlled loop.

## Question 3

Write down the syntax of:

(a) do - while
```java
do {
    //loop-body
} while (condition);
```
(b) while loop
```java
while (condition) {
    //loop-body
}
```

## Question 4

What is the purpose of using

(a) break statement

break statement is used to unconditionally jump out of the loop

(b) continue statement in a program?

continue statement is used to unconditionally jump to the next iteration of the loop, skipping the remaining statements of the current iteration.

## Question 5

Distinguish between while and do-while loop.

while	do-while
It is an entry-controlled loop.	It is an exit-controlled loop.
It is helpful in situations where numbers of iterations are not known.	It is suitable when we need to display a menu to the user.

## Question 6

What is meant by an infinite loop? Give an example.

A loop which continues iterating indefinitely and never stops is termed as infinite loop. Below is an example of infinite loop:
```java
for (;;)
    System.out.println("Infinite Loop");
```

## Question 7

State one difference and one similarity between while loop and do-while loop.

Similarity — Both while and do-while are suitable in situations where numbers of iterations is not known.
Difference — while is an entry-controlled loop whereas do-while is an exit-controlled loop

# Predict the output

## Question 1

The following is a segment of a program.
```java
x = 1; y = 1;
if(n>0)
{
x = x + 1;
y = y + 1;
}
```
What will be the value of x and y, if n assumes a value:

(i) 1

Output

x = 2
y = 2
Explanation

As n is 1, so if condition is true. x and y are incremented by 1 so both become 2.

(ii) 0

Output

x = 1
y = 1
Explanation

As n is 1, so if condition is false. Values of both x and y remain unchanged.

## Question 2

Analyze the following program segment and determine how many times the body of the loop will be executed (show the working).
```java
x = 5; y = 50;
while(x<=y)
{
y = y / x;
System.out.println(y);
}
```
Output

10
2
The loop will execute 2 times.

Explanation

x	y	Remarks
5	50	Initial values
5	10	After 1st iteration
5	2	After 2nd iteration
After 2 iterations y becomes less than x so condition of while loop becomes false and it stops executing.

## Question 3

What will be the output of the following code?
```java
int m=2;
int n=15; 
for(int i=1;i<5;i++)
m++;
--n;
System.out.println("m="+m);
System.out.println("n="+n);
```
Output

m=6
n=14
Explanation

As there are no curly braces after the for loop so only the statement m++; is inside the loop. Loop executes 4 times so m becomes 6. The next statement --n; is outside the loop so it is executed only once and n becomes 14.

## Question 4

Analyze the following program segment and determine how many times the loop will be executed. What will be the output of the program segment?

int k=1,i=2;
while(++i<6)
k*=i;
System.out.println(k);
Output

60
Explanation

This table shows the change in values of i and k as while loop iterates:

i	k	Remarks
2	1	Initial values
3	3	1st Iteration
4	12	2nd Iteration
5	60	3rd Iteration
6	60	Once i becomes 6, condition is false and loop stops iterating.
Notice that System.out.println(k); is not inside while loop. As there are no curly braces so only the statement k *= i; is inside the loop. The statement System.out.println(k); is outside the while loop, it is executed once and prints value of k which is 60 to the console.

Question 5

Give the output of the following program segment and also mention the number of times the loop is executed.

int a,b;
for(a=6;b=4; a <= 4; a=a+ 6)
{
if(a%b==0)
break;
}
System.out.println(a);
Output

6
The loop executes 0 times.

Explanation

a is initialized to 6 and as the loop condition is false before the first iteration itself so the loop doesn't execute.

Question 6

Give the output of the following program segment and also mention how many times the loop is executed.

int i;
for(i = 5; i > 10; i++)
System.out.println(i);
System.out.println(i * 4);
Output

20
The loop executes 0 times.

Explanation

i is initialized to 5 and as the loop condition is false before the first iteration itself so the loop doesn't execute. The statement System.out.println(i * 4); is outside the loop so it gets executed once, printing 20 to the console.

Rewrite the following programs

Question 1

Using for loop:

int i=1;
int d=5;
do
{
d=d*2;
System.out.println(d);
i++;
}
while (i<=5);
Answer

int d=5;
for (int i = 1; i <= 5; i++) {
    d=d*2;
    System.out.println(d);
}
Question 2

Using while loop:

import java.util.*;
class Number
{
public static void main(String args[])
{
int n,r;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number");
n=in.nextInt();
do
{
r=n%10;
n=n/10;
System.out.println(r);
}
while(n!=0); 
}
}
Answer

import java.util.*;
class Number
{
    public static void main(String args[])
    {
        int n,r;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n=in.nextInt();
        while (n != 0) {
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
