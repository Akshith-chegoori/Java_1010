import java.util.Scanner;
public class j00010 {
    public static void main(String[]args){
        System.out.println("Enter the year");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a%4!=0 ||(a%100==0 && a%400!=0)){
            System.out.println("NON Leap year");
        }
        else{
            System.out.println("Leap year");
        }
    }
}
