/* Search a number and its position in array */

import java.util.Scanner;
class LinearSearch{
         public static void main(String args[])
                     {  
                           int i;
                           System.out.println("Enter the size of array: ");
                           Scanner obj = new Scanner(System.in);
                           int size = obj.nextInt();
                           int[] arr= new int[size];
                           System.out.println("Enter "+size+" elements in the array: ");
                              for(i=0;i<size;i++)
                                             {
                                                      arr[i]= obj.nextInt();
                                             }
                           System.out.println("Find element: ");
                           int num= obj.nextInt();
                              for(i=0;i<size;i++)
                                              {
                                                   if(arr[i]==num)
                                                               {
                                                                     System.out.println(num+" is present at "+(i+1)+" position");   
                                                               }
                                              }
                     }
         }