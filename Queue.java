import java.util.*;
class qu{
    static int front,rear,capacity;
    static private int arr[];
    qu(int n)
    {
        front=rear=0;
        capacity=n;
        arr=new int[n];
        
    }
    static void enqueue(int data)
    {
        if(capacity==rear){
            System.out.printf("\nQueue is full\n");
            return;
        }
        else{
            arr[rear]=data;
            rear++;
        }
        return;
    }
    static void dequeue()
    {
        if(front==rear){
            System.out.printf("\nQueue is empty\n");
            return;
        }
        else{
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
            }
            if(rear<capacity)
                arr[rear]=0;
            rear--;
        }
        return;
    }
    static void display()
    {
        if(front==rear){
            System.out.printf("\n Queue is Empty\n");
            return;
        }
        for(int i=front;i<rear;i++)
        {
            System.out.println(arr[i]+" ");
        }
        return;
    }
    static void qufront(){
        if(front==rear){
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is:%d",arr[front]);
        return;
    }
}




public class Queue {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   
    int n1=sc.nextInt();
    qu q=new qu(n1);
    for(int i=0;i<n1;i++){
        int x=sc.nextInt();
        q.enqueue(x);
    }
    q.display();
    
    }
}
