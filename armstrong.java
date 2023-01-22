import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=n1;
        int count=0;
        while(n2!=0){
            n2/=10;
            ++count;
        }
        int l=count;
        System.out.println(l);
        int temp,rem;
        int res=0;
        temp=n1;
        while(temp!=0){
            rem=temp%10;
            res+=Math.pow(rem,l);
            temp/=10;
        }
        if(res==n1){
            System.out.println(n1+" Armstrong");
        }
        else{
            System.out.println(n1+" Not Armstrong");
        }
    }
}
