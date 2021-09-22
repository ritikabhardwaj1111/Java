/* Factors of a number */

import java.util.Scanner;
class FactorsOfNumbers{
	public static void main(String args[]){
			System.out.println("Enter a number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println("The factors of "+num+" are :");
			for(int i=1;i<=num;i++)
				{
 				    if(num%i==0)
					{
 					    System.out.println(i);
					}
				}				
	   }
}