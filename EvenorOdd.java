/* Check whether a number is even or odd */
import java.util.Scanner;
class EvenorOdd{
     public static void main(String args[]){
          System.out.println("Enter a number: ");
          Scanner obj = new Scanner(System.in);
          int num = obj.nextInt();
          if(num%2==0)
          {
                     System.out.println("Even");
          }
          else 
          {
                     System.out.println("Odd");
          }
      }
}