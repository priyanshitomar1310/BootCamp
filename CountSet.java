import java.util.Scanner;

public class CountSet {
    public static int countSetBits(int num)
    {
        int count=0;
        while(num!=0)
        {
            num=num&(num-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        System.out.println(countSetBits(n));
    }
}