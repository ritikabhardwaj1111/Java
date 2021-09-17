/* Check if the year entered is leap year*/

import java.util.Scanner;
class LeapYear{
	public static void main(String args[])
	{
		System.out.println("Enter a year: ");
        	Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
	        if(year%4==0)
			{ 
				System.out.println(year+": Leap year");
			}
 		else
			{
				System.out.println(year+": not a Leap year");
			}
	}
}