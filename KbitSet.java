import java.util.Scanner;

public class KbitSet {
    public static boolean isSet(int n,int k)
    {
        int count=1;
        while(count!=k)
        {
            n=n>>1;
            count++;
        }
        if((n&1)==1)
        {
            return true;
        }
        return  false;
        
        
    }
    public static void main(String[] args) {
        int n,k;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        k=input.nextInt();
        System.out.println(isSet(n, k));
    }
}