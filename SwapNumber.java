/* METHOD 1: Swapping of two numbers using a temporary variable */

import java.util.Scanner;
class SwapNumber{
    public static void main(String Args[]){
           System.out.println("Enter First number: ");
           Scanner sc = new Scanner(System.in);
           int num1 = sc.nextInt();
           System.out.println("Enter the second number: \n");
           Scanner sc0 = new Scanner(System.in);
           int num2 = sc0.nextInt();
           System.out.println("First number: "+num1);
           System.out.println("Second number: \n"+num2);
           int temp = num1;
           num1 = num2;
           num2 = temp;
           System.out.println("After Swapping numbers");
           System.out.println("First number: "+num1);
           System.out.println("Second number: "+num2);
}
}
