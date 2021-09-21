/* compute the area of a polygon */

import java.util.*;
class PolygonArea{
	public static void main(String args[])
				{       System.out.println("Enter number of sides: ");
					Scanner sc0 = new Scanner(System.in);
					int n = sc0.nextInt();
					System.out.println("Enter a side of polygon: ");
					Scanner sc = new Scanner(System.in);
					int side = sc.nextInt();
					double area = (n*(side*side))/4*Math.tan(Math.PI/n);
					System.out.println("Area: "+area);
				}
}