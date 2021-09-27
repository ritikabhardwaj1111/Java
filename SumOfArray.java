import java.util.Scanner;
class SumOfArray{
	public static void main(String args[])
			{
   				int i,sum=0;
   			        System.out.println("Enter the size of an array: ");
   				Scanner sc = new Scanner(System.in);
   				int size = sc.nextInt();
   				int[] arr = new int[size];
   				System.out.println("Enter "+size+" elements in array: ");
   				for(i=0;i<size;i++)
						{
          						arr[i] = sc.nextInt();
         					}
   				for(i=0;i<size;i++)
						{
          						sum += arr[i];
						}  
  				System.out.println("Sum of elements is "+sum);
			}
	}
