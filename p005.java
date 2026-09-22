import java.util.Scanner;
public class p005 {
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dist in km");
        float km=sc.nextFloat();
        float m=0.621371f;
        float res=km*m;
        System.out.println(res);
    }
}