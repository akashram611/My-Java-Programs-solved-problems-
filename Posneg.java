import java.util.*;
public class Posneg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        if(n1>0){
            System.out.println("num is pos");
        }
        else if(n1<0){
            System.out.println("The num is neg");
        }
        else{
            System.out.println("The num is zero");
        }
    }
}