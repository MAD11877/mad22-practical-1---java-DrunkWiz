import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    Scanner in = new Scanner(System.in);
    //System.out.println( "Enter a number");
    double num = in.nextDouble();
    for(double i = (num -1); i>-1; i--)
    {
      System.out.println("");
      for(int n = 0; n<=i; n++)
      {
        System.out.print("*");
      }
    }
  }
}
