import java.util.Scanner;
public class p00012{
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows");
        int n=sc.nextInt();
        int j=0;
        for(i=0;i<n;i++){
            for(j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}