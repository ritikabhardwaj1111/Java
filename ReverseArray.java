/* Reverse an array */

import java.util.Scanner;
class ReverseArray{
  public static void main(String[] args) {
    int i,temp;
    System.out.println("Enter the size of an array: ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter "+size+" elements: ");
    for(i=0;i<size;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Reversed array is: ");
    for(i=size-1;i>=0;i--)
    {
      System.out.print(arr[i]+"\t");
    }
  }
}
