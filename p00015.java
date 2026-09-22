import java.util.Scanner;
public class p00015 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number");
        int a =sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
