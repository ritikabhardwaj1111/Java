import java.util.Scanner;

public class cal{
		static int add(int num1, int num2)
			{
   			    return num1+num2;
			}
		static int sub(int num1, int num2)
			{
      			    return num1-num2;
     			}
		static int div(int num1, int num2)
			{
      			    return num1%num2;
			}
		static int mul(int num1, int num2)
			{
      			   return num1*num2;
    		 	}
                 

public static void main(String args[]){
        System.out.println("******* Menu *******");
  	System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division ");
  	System.out.println("Choose the operation: ");
  	Scanner obj = new Scanner(System.in);
  	int choice = obj.nextInt();
    	System.out.println("Enter the First number: ");
     	Scanner sc = new Scanner(System.in);
     	int num1 = sc.nextInt();
     	System.out.println("Enter the Second number: ");
     	Scanner sc0 = new Scanner(System.in);
     	int num2 = sc0.nextInt();
  		if(choice<=5)
 			{
				switch(choice)
					{
						 case 1:
							System.out.println(add(num1,num2));
      							break;
 						 case 2:
    						        System.out.println(sub(num1,num2));
      							break;
 						 case 3:
      						        System.out.println(mul(num1,num2));
      							break;
 					         case 4:
      							System.out.println(div(num1,num2));
      							break;
					}
			}
	}
}

