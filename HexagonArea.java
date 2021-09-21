/* compute the area of a hexagon */

import java.util.*;
class HexagonArea{
	public static void main(String args[])
				{
					System.out.println("Enter a side of hexgon: ");
					Scanner sc = new Scanner(System.in);
					int side = sc.nextInt();
					double area = 6*side/4*Math.tan(Math.PI/6);
					System.out.println("Area: "+area);
				}
}