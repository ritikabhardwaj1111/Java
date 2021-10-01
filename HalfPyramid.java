/*
Print pattern:
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
*/

import java.util.Scanner;
class HalfPyramid{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int r = obj.nextInt();
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<i;j++)
      {
         System.out.print("* ");
      }
        System.out.println("\n");
    }
  }
}
