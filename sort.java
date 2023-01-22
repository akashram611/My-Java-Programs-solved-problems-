import java.util.*;
public class sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n1;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n1;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
