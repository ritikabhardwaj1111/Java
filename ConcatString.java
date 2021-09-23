import java.util.Scanner;
class ConcatString{
public static void main(String args[]){
 	System.out.println("Enter a sentence: ");
 	Scanner obj = new Scanner(System.in);
 	String s1 = obj.nextLine();
 	System.out.println("Enter another sentence: ");
 	String s2 = obj.nextLine();
 	s1 = s1.concat(s2);
 	System.out.println(" "+s1);
		}
}