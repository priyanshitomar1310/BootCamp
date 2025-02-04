import java.util.Scanner;

public class PowerofTwo {
    public static boolean isTrue(int num)
    {
        if(num==0)
        {
            return false;
        }
        if(((num & (num - 1))) == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(n);
    }
   
}