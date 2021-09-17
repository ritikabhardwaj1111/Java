/* Calculate the Sum of Natural Numbers*/

import java.util.Scanner;
class SumofNaturalNum{
	public static void main(String args[])
	{
		System.out.println("Enter number: ");
        	Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
  		int sum=0;
	        	for(int i = 1; i<=num ;i++)
				{
					sum+=i;	
				}
		System.out.println("Sum: "+sum);
	}
}