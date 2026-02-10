import java.util.Arrays;
import java.util.Collections;

public class IntroTo2DArrays{

  public static void main(String[] args){
    
    int[][] twoDee = new int[3][5];

    //Store incremental values in row major order

    int value = 1;

    for(int row=0; row<twoDee.length;row++)
    {
      for(int col=0; col<twoDee[row].length;col++)
    
          {
            twoDee[row][col]=value;
            value++;
          }
          //This spot here represents the completion of one row
          System.out.println(Arrays.toString(twoDee[row]));
    }
    //Print out the total sum of each row in the following format:
    //Row 0: 15
    //Row 1: ...

    int sum = 0;
    for(int row=0; row<twoDee.length;row++)
    {
      for(int col=0; col<twoDee[row].length;col++)
    
          {
            sum += twoDee[row][col];
          }
          System.out.println("Row " + row + ": " + sum);
          sum = 0;
    }

    for(int col=0; col<twoDee[col].length;col++)
    {
      for(int row=0; row<twoDee.length;row++)
    
          {
            sum += twoDee[row][col];
          }
          System.out.println("Column " + col + ": " + sum);
          sum = 0;
    }
  }
}
