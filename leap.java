import java.util.*;
public class leap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        if(n1%400==0){
            System.out.println("Leap yr");
        }
        else if(n1%4==0 && n1%100!=0){
            System.out.println("Leap yr");
        }
        else{
            System.out.println("not leap yr");
        }
    }
}
