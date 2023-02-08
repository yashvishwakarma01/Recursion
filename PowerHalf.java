import java.util.*;

public class PowerHalf {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
        
    }

    public static int power(int x, int n){
        if(n==0)
        return 1;
        if(n==1)
         return x;
        if(x==0)
        return 0;
        
        if(n%2==0)
          return power(x,n/2)*power(x,n/2);
        else
          return x*power(x,n/2)*power(x,n/2);
    }  
}
