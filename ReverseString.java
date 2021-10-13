import java.util.Scanner;
class ReverseString{
  public static void main(String[] args) {
    int i;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s = obj.nextLine();
    char[] arr = new char[s.length()];
    System.out.println("\nOrignal String: ");
    System.out.println("\n"+s);
    for(i=0;i<s.length();i++)
    {
      arr[i] = s.charAt(i);
    }
    System.out.println("\nReversed String: ");
    for(i=(s.length())-1;i>=0;i--)
    {
      System.out.print("  "+arr[i]);
    }
  }
}
