import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
    public static Long factorial(int n){
        if(n==0 || n==1)
        return (Long.valueOf(1));
        return n*factorial(n-1);
        
    }
}
