import java.util.Scanner;
public class p006{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String l=a.replace(" ", "_");
        System.out.println(l);
    }
}