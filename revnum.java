import java.util.*;
public class revnum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int rev=0,rem;
        while(n1!=0){
            rem=n1%10;
            rev=rev*10+rem;
            n1/=10;
        }
        System.out.println(rev);
    }
}
