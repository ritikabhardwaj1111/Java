// Calculate Average Using Arrays

import java.util.Scanner;
class ArrayAverage{
public static void main(String args[]){
int i,avg=0,sum=0;
Scanner obj = new Scanner(System.in);
System.out.println("Enter the size of an array ");
int n = obj.nextInt();
int arr[] = new int[n];
System.out.println("Enter "+n+" elements in the array");
for(i=0;i<n;i++)
{
  arr[i] = obj.nextInt();
  sum+=arr[i];	
}
avg = sum/n;
System.out.println(" "+avg);
}

}