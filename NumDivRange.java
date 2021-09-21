/*  Find the number of integers within the range of two specified numbers and that are divisible by another number */

import java.util.*;
class NumDivRange{
	public static void main(String args[])
				{      
 					System.out.println("Enter a first num: ");
					Scanner sc0 = new Scanner(System.in);
					int num1 = sc0.nextInt();
					System.out.println("Enter a Second num: ");
					Scanner sc = new Scanner(System.in);
					int num2 = sc.nextInt();
					System.out.println("Enter the num to be divisible by : ");
					Scanner sc1 = new Scanner(System.in);
					int numDiv = sc1.nextInt();
						for(int i=num1; i<=num2 ; i++)
								{
									if(i%numDiv==0)
										{
		                                                                   	System.out.println(i);
										}    
								}
				}
}