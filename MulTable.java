/* Generate Multiplication Table */

import java.util.Scanner;
class MulTable
	{
	public static void main(String args[])
		{  
   			System.out.println("Table of : ");
   			Scanner sc = new Scanner(System.in);
   			int num = sc.nextInt();
   				for(int i = 1;i<=10;i++)
					{
   						System.out.println(num+" * "+i+" = "+(num*i));   
					}

		}

	}