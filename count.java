import java.util.*;
public class count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        freq(arr,n1);
    }
    static void freq(int[] arr,int n1)
    {
        for(int i=0;i<n1;i++){
            int count=0;
            int flag=0;
            for(int j=i+1;j<n1;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                continue;
            }
            for(int j=0;j<=i;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" count:"+count);
        }
    }
}
