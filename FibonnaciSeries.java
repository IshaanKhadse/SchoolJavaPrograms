import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int n, firstTerm = 0, secondTerm = 1;
    Scanner in = new Scanner (System.in);
    n=in.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
