import java.util.*;
public class remspace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '&&arr[i]!='\t'){
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
