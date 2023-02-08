import java.util.Scanner;
import java.util.ArrayList;
public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        ArrayList<String> paths=getStairPaths(n);
        System.out.println(paths);
      }
  
      public static ArrayList<String> getStairPaths(int n) {
          if(n==0){
              ArrayList<String>al=new ArrayList<>();
              al.add("");
              return al;
          }
          if(n<0){
              ArrayList<String> al=new ArrayList<>();
              return al;
          }
          
          ArrayList<String> one=getStairPaths(n-1);
          ArrayList<String> two=getStairPaths(n-2);
          ArrayList<String> three=getStairPaths(n-3);
          ArrayList<String> list=new ArrayList<>();
          for(String element:one){
              list.add(1+element);
          }
          for(String element:two){
              list.add(2+element);
          }
          for(String element:three){
              list.add(3+element);
          }
          return list;
      }
}
