import java.util.Random;
import java.util.Scanner;
public class p00011 {
    public static void main(String[] args) {
        System.out.println("Enter 0 for rock\nEnter 1 for siccor\nEnter 2 for paper");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        Random r=new Random();
        int x =r.nextInt(3);
        if (x==0){
            if(a==1){
                System.out.println("You lose");
            }

            else if(a==2){
                System.out.println("You Win");
            }
            else{
                System.out.println("Draw");
            }
        }
        else if (x==1){
            if(a==2){
                System.out.println("You lose");
            }
            else if(a==0){
                System.out.println("You Win");
            }
            else{
                System.out.println("Draw");
            }
        }
        else if (x==2){
            if(a==0){
                System.out.println("You lose");
            }
            else if(a==1){
                System.out.println("You Win");
            }
            else{
                System.out.println("Draw");
            }
        }
    }}






