/* Check whether an alphabet is vowel or consonant */

import java.util.Scanner;
class VowelorConsonant{
    public static void main(String args[])
    {
          System.out.println("Enter a Alphabet");
          Scanner sc = new Scanner(System.in);
          char val0 = sc.next().charAt(0);
          char val = Character.toLowerCase(val0);          //Converts input char into lowercase
            if(val=='a'|| val=='e'|| val=='i' || val=='o' || val=='u')
                { 
                    System.out.println(val+" is vowel");
                }
                  else
                {
                    System.out.println(val+" is Consonant");
                }
    }
}
