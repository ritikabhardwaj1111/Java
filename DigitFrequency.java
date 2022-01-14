import java.util.Scanner;
class DigitFrequency{
    public static int freq(int n ,int d){
        int temp = 0 , count = 0;
       while(n>0)
       {
        temp = n%10;
        n /= 10;
        if(temp==d)
            count++;
       }
        return count;    
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = obj.nextInt();
        System.out.println("Enter the digit: ");
        int digit = obj.nextInt();
        int result = freq(num , digit);
        System.out.println("Count of "+digit+" in "+num+" :   "+result);
    }
}