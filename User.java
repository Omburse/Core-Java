import java.util.Scanner;
public class User {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Subject Marks : ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd Subject Marks : ");
        float b = sc.nextFloat();
        System.out.print("Enter 3rd Subject Marks : ");
        float c = sc.nextFloat();
        System.out.print("Enter 4th Subject Marks : ");
        float d = sc.nextFloat();
        System.out.print("Enter 5th Subject Marks : ");
        float e = sc.nextFloat();

        System.out.print("The total Percentage are : ");
        float percentage = ((a+b+c+d+e)/500.0f)*100;
        
        System.out.println(percentage);
    }
}
