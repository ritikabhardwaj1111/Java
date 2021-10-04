/* Intersection of two arrays */

import java.util.Scanner;
class IntersectionSet{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,j;
    int[] arr1 = new int[5];
    int[] arr2 = new int[5];
    System.out.println("Enter 5 elements in first Array: ");
    for(i=0;i<5;i++)
    {
      arr1[i] = sc.nextInt();
    }
    System.out.println("\nEnter 5 elements in second Array: ");
    for(i=0;i<5;i++)
    {
      arr2[i] = sc.nextInt();
    }
    System.out.println("Intersection of two arrays: ");
    for(i=0;i<5;i++)
    {
      for(j=0;j<5;j++)
      {

      if(arr1[i]==arr2[j])
      {
        System.out.print(arr2[j]+" ");
      }
    }
  }

  }
}
