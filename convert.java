/* Design a class to overload a function convert() as follows:
a. float convert(double a) - It converts double value a to float and returns.
b. void convert(char s) - It converts char s to integer and prints.
*/

public class convert {
    public static void main(String args[]) {
      System.out.println(convert(0.8));
      convert('k');
    }
    static float convert (double a){
        float converted = (float)a;
        return converted;
    }
   static void convert (char s){
        System.out.println((int)s);
    }
}

/* Kanha Korgaonkar, 08-26-2021, Function Overloading Question 4 */
