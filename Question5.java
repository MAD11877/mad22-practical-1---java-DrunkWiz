import java.util.Scanner;
import java.util.ArrayList;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    ArrayList<Integer> data = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    //System.out.print( "Enter a number: ");
    Integer num = in.nextInt();
    for(int i = 0; i<=num; i++)
    {
      //System.out.print( "> ");
      Integer num1 = in.nextInt();
      data.add(num1);
      }
    int m = mode(data);
    System.out.print(m);    
  }
  public static int mode(ArrayList<Integer> il){
    int mode = -1;
    int highest = 0;
    for(int i = 0 ;i < il.size(); i++)
    {
      Integer tempdata = il.get(i);
      int tempcount = 0;
      for(int n = 0 ;n < il.size(); n++)
      {
        if(tempdata == il.get(n)){
          tempcount ++;
        }
      }
      if(tempcount > highest){
        mode = tempdata;
        highest = tempcount;
      }
    }
    if(mode == -1){
      return 0;
    }
    else{
      return mode;
    }
  }
}
