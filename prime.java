import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int count=0;
        if(n1<2){
            System.out.println("Not a prime");
        }
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("not a prime");
        }
        else{
            System.err.println("prime");
        }
    }
}
