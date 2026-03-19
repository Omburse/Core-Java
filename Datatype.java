import java.util.Scanner;
public class Datatype {
    public static void main (String[] args){
       /*
        float a = 10;
       float b = 5;
       float div = (a*b)/(a-b);
       System.out.println(div);

        */
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The total sum is : ");
        System.out.println(sum);



    }
}
