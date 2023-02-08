import java.util.*;
public class MaxOfArray {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1)
          return arr[idx];
        
        int maxSmall=maxOfArray(arr,idx+1);
        if(arr[idx]>=maxSmall)
          return arr[idx];
        else
          return maxSmall;
    }
}
