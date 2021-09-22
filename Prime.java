/* check if the number enter is prime or not */
import java.util.Scanner;
class Prime{
	public static void main(String args[]){
			System.out.println("Enter a number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int count=0;
			for(int i=1;i<=num;i++)
				{
 				    if(num%i==0)
					{
 					    count++;
					}
				}
				    if(count==2)
					System.out.println("Prime number");
				    else
					System.out.println("Not a prime number");
					}
	   }