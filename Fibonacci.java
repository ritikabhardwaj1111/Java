/* Print Fibonacci series where limit is set by the user */

import java.util.Scanner;
class Fibonacci{
	public static void main(String args[])
		{
                   int num1=0, num2=1, sum=0;
                   System.out.println("Enter the limit of fibonacci series: ");
                   Scanner obj = new Scanner(System.in);
                   int lim = obj.nextInt();
                   System.out.print(num1+" , "+num2);
                   for(int i=2;i<=lim;i++)
			{
                             sum = num1 +num2;
                             System.out.print(" , "+sum);
                             num1 = num2;
                             num2 = sum;			
			}

		}
	}