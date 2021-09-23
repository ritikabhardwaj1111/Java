/* 
  Buzz Number: 
  special number in java that ends with digit '7' or it is divisible by 7
*/

import java.util.Scanner;
class Buzz{
public static void main(String args[]){
         System.out.println("Enter a number: ");
	 Scanner obj = new Scanner(System.in);
	 int num = obj.nextInt();
	 if(num%7==0 || num%10==7) 
		System.out.println("Its a Buzz number.");
	 else
		System.out.println("Its not a Buzz number.");
}
}