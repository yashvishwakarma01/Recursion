import java.util.*;
public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        ArrayList<String> paths=getMazePaths(1,1,n,m);
        System.out.println(paths);
   }

   // sr - source row
   // sc - source column
   // dr - destination row
   // dc - destination column
   public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
       if(sr==dr && sc==dc){
           ArrayList<String> al=new ArrayList<>();
           al.add("");
           return al;
       }
       ArrayList<String> hpath=new ArrayList<>();
       ArrayList<String> vpath=new ArrayList<>();
       
       if(sc<dc){
       hpath=getMazePaths(sr,sc+1,dr,dc);
       }
       if(sr<dr){
        vpath=getMazePaths(sr+1,sc,dr,dc);
       }
       
       
       ArrayList<String> list=new ArrayList<>();
       
       for(String element:hpath){
           list.add("h"+element);
       }
       for(String element:vpath){
           list.add("v"+element);
       }
       return list;
   }
}
