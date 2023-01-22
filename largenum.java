import java.util.*;
public class largenum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n1;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max num is: "+max);
    }
    
}
