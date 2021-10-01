/* Find the roots of given Quadratic Equation */

import java.util.Scanner;
class QuadraticEquation{
	public static void main(String args[]){
		double r1,r2;		//root1, root2
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter First number: ");
		double a = obj.nextDouble();
		System.out.print("Enter Second number: ");
		double b = obj.nextDouble();
		System.out.print("Enter Third number: ");
		double c = obj.nextDouble();
		double result = b*b-(4*a*c);
			if(result>0.0)
				{
   					r1=(-b+Math.sqrt(result))/2*a;
   					r2=(-b-Math.sqrt(result))/2*a;
   					System.out.println("Roots:"+r1+" , "+r2);
				}
			else if(result<0.0)
				{
   					r1=(-b/2*a);
   					System.out.println("Root: "+r1);
				}
			else
				{
   					System.out.println("Euation has no real roots ");
				}
			}
	}
