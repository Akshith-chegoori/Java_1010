import java.util.Scanner;
public class p007 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of 1st sub");
        float m1=sc.nextFloat();
        System.out.print("Enter the marks of 2nd sub");
        float m2=sc.nextFloat();
        System.out.print("Enter the marks of 3rd sub");
        float m3=sc.nextFloat();
        float t=(m1+m2+m3)/3.0f;
        if((t>40)&&((m1>33)&&(m2>33)&&(m3>33))){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
