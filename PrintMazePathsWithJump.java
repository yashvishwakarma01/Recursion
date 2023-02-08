import java.util.*;
public class PrintMazePathsWithJump {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> al=getMazePaths(1,1,n,m,1);
        System.out.println(al);
        }
    
        // sr - source row
        // sc - source column
        // dr - destination row
        // dc - destination column
        public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc,int l) {
            if(sr==dr && sc==dc){
                ArrayList<String> al=new ArrayList<>();
                al.add("");
                return al;
            }else if(sr==dr || sc==dc){
              ArrayList<String> al=new ArrayList<>();
                 return al;
            }

            ArrayList<String> path1=new ArrayList<>();
            ArrayList<String> path2=new ArrayList<>();
            ArrayList<String> path3=new ArrayList<>();
            ArrayList<String> path=new ArrayList<>();
            int i,j,k;
            for(i=1;i<=dc-sc;i++){
                path1=getMazePaths(sr,sc+i,dr,dc,i);
              
            }
            for(j=1;j<=dr-sr;j++){
               path2=getMazePaths(sr+j,sc,dr,dc,j);  
            
            }
            for(k=1;k<=dc-sc && k<=dr-sr;k++){
               path3=getMazePaths(sr+k,sc+1,dr,dc,k);  
             
            }
            for(String item: path1){
                path.add("h"+i+item);
             
            }
            for(String item: path2){
                path.add("v"+j+item);
                
            }
            for(String item: path3){
                path.add("d"+k+item);
                
            }
            return path;
        }
}
