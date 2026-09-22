import java.util.Scanner;
public class p009{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        int s=0;
        for(int i=0;i<=n;i+=8){
            s+=i;
        }
        System.out.println(s);
    }
}