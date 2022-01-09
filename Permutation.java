import java.util.*;

class Permutation{
    public static int cal(int x){
        int result = 1;
        for(int i = x; i>=1 ; i--)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter total number of objects: ");
        int n = obj.nextInt();
        System.out.println("Enter the number of objects selected: ");
        int r = obj.nextInt();
        int factN = cal(n);
        int factNR = cal(n-r);
        int npr = factN / factNR;
        System.out.println(n+"  Permutation "+r+"   : "+npr);
    }
}