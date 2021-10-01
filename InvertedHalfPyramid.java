/*

Print pattern:
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/

import java.util.Scanner;
class InvertedHalfPyramid{
  public static void main(String args[]){
          System.out.println("Enter the number of rows: ");
          Scanner obj = new Scanner(System.in);
          int r = obj.nextInt();
            for(int i=r;i>=1;--i)
              {
                for(int j=1;j<=i;++j)
                  {
                        System.out.print("* ");
                  }
            System.out.println("\n");
             }
      }
  }
