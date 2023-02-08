import java.util.*;;

public class Pattern {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pzz(n);
      }
      public static String pz1(int n){
           if(n==1)
           {
               String a= "1 1 1";
               return a;
           }
            String str=pz1(n-1);
            return String.valueOf(n)+" "+ str+" "+String.valueOf(n)+" "+str+" "+String.valueOf(n);
            
      
      }
  
      public static void pzz(int n){
          String x=pz1(n);
         
          System.out.println(x);
           
           
      }
}
