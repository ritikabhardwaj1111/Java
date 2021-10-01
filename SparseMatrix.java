/* Find if the matrix is sparse or not.
   SPARSE MATRIX:
   Matrix that has a greater number of zero elements than the non-zero elements. */

import java.util.Scanner;
class SparseMatrix{
	public static void main(String agrs[]){
 				int arr[][]= new int[3][3];
 				int i,j,count=0;
 				Scanner obj = new Scanner(System.in);
				   for(i=0;i<3;i++)
				       {
 					for(j=0;j<3;j++)
						{
  							System.out.println("Enter the element at arr["+i+"]["+j+"]");
  							arr[i][j]=obj.nextInt();
						}
					}		
				    for(i=0;i<3;i++)
					{
					 for(j=0;j<3;j++)
						{
							if(arr[i][j]==0)
								{
 									count++;
								}
						}
					}
				    if(count>(3*3)/2)
						System.out.println("Its a sparse Matrix");
				             else
						System.out.println("Its not a sparse Matrix");
				}
		}