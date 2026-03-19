import java.util.Scanner;
public class Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You are eligible for drive car");
        }
        else {
            System.out.println("You are not eligible for drive car");
        }
    }
}
