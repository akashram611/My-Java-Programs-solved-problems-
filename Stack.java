import java.util.*;
class Main{
    int top,size;
    int[] arr;
    Main(){
        top=-1;
        size=100;
        arr=new int[size];
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(int n){
        arr[++top]=n;
    }
    int pop(){
        if(!isEmpty()){
            System.out.println("Deleted element is "+arr[top]);
            arr[top]=0;
            top--;
            
        }
        return -1;
    }
    void display(){
        System.out.println("The elements in stack");
        int temp=top;
        for(int i=temp;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
class Stack{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Main st=new Main();
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        st.pop();
        st.display();
        
    }
}