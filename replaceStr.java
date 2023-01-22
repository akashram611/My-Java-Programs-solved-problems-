import java.util.*;
public class replaceStr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str1=sc.nextLine();
        System.out.println("Enter String to be replaced");
        String str2=sc.nextLine();
        System.out.println("Enter  new string");
        String str3=sc.nextLine();
        String replacestr=str1.replace(str2,str3);
        System.out.println("ModifiedString:"+replacestr);
    }
}
