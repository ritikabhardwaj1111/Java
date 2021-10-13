import java.util.Scanner;
class Count_vowels{
public static void main(String[] args) {
  int count=0,A=0,E=0,I=0,O=0,U=0;
  Scanner obj = new Scanner(System.in);
  System.out.println("Enter a String: ");
  String s = (obj.nextLine()).toLowerCase();
  char[] arr = new char[s.length()];
  for(int i=0 ;i<s.length();i++)
  {
    arr[i] = s.charAt(i);
  if(arr[i]=='a')
    A++;
  else if(arr[i]=='e')
    E++;
  else if(arr[i]=='i')
    I++;
  else if(arr[i]=='o')
    O++;
  else if(arr[i]=='u')
    U++;
  }
  System.out.println("Count A/a  : "+A);
  System.out.println("Count E/e  : "+E);
  System.out.println("Count I/i  : "+I);
  System.out.println("Count O/o  : "+O);
  System.out.println("Count U/u  : "+U);
  System.out.println("Total : "+(A+E+I+O+U));
}
}
