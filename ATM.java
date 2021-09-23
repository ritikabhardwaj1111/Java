/* ATM Program is a simple JAVA code which performs different tasks like deposit and withdrawal based on user's selection from given options */

import java.util.Scanner;
class ATM{
public static void main(String args[]){
		    float total_amount = 12000.86f;	
		    System.out.println("***********MENU************");
    		    System.out.println("1. Withdraw");
    		    System.out.println("2. Deposit");
    		    System.out.println("3. Check balance");
    		    System.out.println("4. Exit");
    	            System.out.println("Enter your choice: ");
		    Scanner sc = new Scanner(System.in);
		    int choice = sc.nextInt();
			if(choice<5)
				{  
    				switch(choice)
					{
						case 1:
						System.out.println("Enter the amount to withdraw");
						float withdaw_amount = sc.nextFloat();
						if(total_amount<0)
						{
						System.out.println("Insufficient Balance");
						}
						else
						{
						total_amount -= withdaw_amount ;
					        System.out.println("Current Balance: RS "+total_amount);
  						System.out.println("Please collect your money");
						}	
                          			break;

						case 2:
              		  			System.out.println("Enter the amount to deposit");
						float deposit_amount = sc.nextFloat();
						total_amount += deposit_amount;	
						System.out.println("Updated Balance: RS "+total_amount);
                          			break;	

						case 3:
              					System.out.println("Current Balance: RS "+total_amount);
                          			break;

						case 4:
              		  			System.exit(0);
                          			
					}
				}
	           }
       }
