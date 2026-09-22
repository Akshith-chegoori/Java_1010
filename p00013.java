import java.util.Scanner;
public class p00013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int i=0;
        int su=0;
        for(i=0;i<=a;i=i+2){
            su=su+i;
            System.out.print(i+" ");
        }
        System.out.println(su);
    }
}
