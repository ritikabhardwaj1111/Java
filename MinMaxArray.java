/* Find the Maximum and Minimum number in an array */

import java.util.Scanner;
class MinMaxArray{
	public static void main(String args[])
		{
  			int[] arr = new int[20];
  			int i;
  			int pos = arr[0];
  			System.out.println("Enter the size of an array: ");
  			Scanner sc = new Scanner(System.in);
  			int size = sc.nextInt();
  			System.out.println("Enter "+size+" elements in array: ");
  				for(i=0;i<size;i++)
  					{
   						arr[i]= sc.nextInt();
   						System.out.println(arr[i]); 
  					}
  				for(i=0;i<size;i++)
  					{
   						if(arr[i]>=pos)
   							{
     								pos=arr[i];
   							}
  					}
  			System.out.println("Maximum : "+pos);
  				for(i =0 ; i<size; i++)
  					{
   						if(arr[i]<=pos)
   							{
     								pos=arr[i];
   							}
  					}
 			System.out.println("Minimum : "+pos);
					}
	}