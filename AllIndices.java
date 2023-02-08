import java.util.ArrayList;
import java.util.Scanner;

public class AllIndices {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
        }
       
        allIndices(arr,0,x);
        print();

      }
      static ArrayList<Integer> al=new ArrayList<>();
      
      public static int allIndices(int[]arr,int idx,int x) {
         if(idx==arr.length){
            return 0;
         }
           if(arr[idx]==x){
              al.add(idx);
           }
           return allIndices(arr,idx+1,x);
      }
      public static void print(){
        System.out.println("The element is present at:");
        for(int element:al){
            System.out.print(element+"|");
        }
      }
}

                 //OR
                //  import java.io.*; 

                //  import java.util.*; 
                 
                   
                 
                //  public class Main { 
                 
                   
                 
                //      public static void main (String [] args) throws Exception { 
                 
                //          BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                 
                //          int n = Integer.parseInt(br.readLine()); 
                 
                //          int [] arr = new int[n]; 
                 
                   
                 
                //          for (int i = 0; i < n; i++) { 
                 
                //              arr[i] = Integer.parseInt(br.readLine()); 
                 
                //          } 
                 
                //          int x = Integer.parseInt(br.readLine()); 
                 
                //          int [] iarr = allIndices(arr, x, 0, 0); 
                 
                   
                 
                //          if(iarr.length == 0) { 
                 
                //              System.out.println(); 
                 
                //              return; 
                 
                //          } 
                 
                   
                 
                //          for (int i = 0; i < iarr.length; i++) { 
                 
                //              System.out.println(iarr[i]); 
                 
                //          } 
                 
                //      } 
                 
                   
                 
                //      public static int [] allIndices(int [] arr, int x, int idx, int fsf) { 
                 
                          
                 
                //         if(idx==arr.length){ 
                 
                //             return new int[fsf]; 
                 
                              
                 
                //         }  
                 
                //          if(arr[idx]==x) 
                 
                //            fsf++; 
                 
                        
                 
                //         int [] z= allIndices(arr, x, idx+1, fsf); 
                 
                //         if(arr[idx]==x) { 
                 
                //             z[fsf-1]=idx; 
                 
                //         } 
                 
                //         return z; 
                 
                //      } 
                 
                   
                 
                //  } 
                 