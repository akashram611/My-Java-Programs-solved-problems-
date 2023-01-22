import java.util.*;
public class sumofn{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n1;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}