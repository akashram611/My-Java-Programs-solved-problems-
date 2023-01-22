import java.util.*;
public class rotleft {
    public static void rotateleft(int arr[],int n1,int n2){
        for(int i=0;i<n2;i++){
            rotatebyone(arr,n1);
        }
    }
    public static void rotatebyone(int arr[],int n1){
        int temp,i;
        temp=arr[0];
        for(i=0;i<n1-1;i++)
            arr[i]=arr[i+1];
            arr[i]=temp;
        
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size");
        int n1=sc.nextInt();
        System.out.println("Enter arr elements");
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter no of rotation");
        int n2=sc.nextInt();
        
        System.out.println("Before rotation");
        for(int i=0;i<n1;i++){
            System.out.print(arr[i]+" ");
        }
        rotateleft(arr,n1,n2);
        System.out.println("After rotation");
        for(int i=0;i<n1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
