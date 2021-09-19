/* Add two integers */

import java.util.Scanner;
class AddNum{
   public static void main(String Args[]){
            System.out.println("Enter first number :");
            Scanner obj1 = new Scanner(System.in);
            int Num1 = obj1.nextInt();
            System.out.println("Enter Second number: ");
            Scanner obj2 = new Scanner(System.in);
            int Num2 = obj2.nextInt();
            System.out.println("Sum of two numbers are: "+(Num1+Num2));
}
}
