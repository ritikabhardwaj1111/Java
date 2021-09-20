/* Armstrong number is a number that is equal to the sum of cubes of its digits */

import java.util.Scanner;
class Armstrong{
	public static void main(String args[])
		{
  			System.out.println("Enter a number: ");
  			Scanner sc = new Scanner(System.in);
 		 	int num = sc.nextInt();
  			int temp = num;
  			int rem,cube,result=0;  
  				while(num!=0)
					{
   						  rem = num%10;  
   						  result = result+(rem*rem*rem); 
   						  num= num/10;    
					}
				if(temp==result)
					{
  						   System.out.println("Armstrong number");
					}
					else
					{
  						   System.out.println("Not a Armstrong number");
					}
		}
}