import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of First language");
        int a = sc.nextInt();
        System.out.println("Enter marks of 2nd language");
        int b = sc.nextInt();
        System.out.println("Enter marks of 3rd language");
        int c = sc.nextInt();
        System.out.println("Enter marks of maths");
        int d = sc.nextInt();
        System.out.println("Enter marks of science");
        int e = sc.nextInt();
        float x=(a+b+c+d+e)/5;
        System.out.println(x+"This is the percentage");
        
    }
}