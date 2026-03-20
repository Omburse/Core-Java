import java.util.Scanner;
public class Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Month = sc.nextInt();

        //if , else  , switch statement in java
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a : ");
        int a = sc.nextInt();
        System.out.print("Enter value b : ");
        int b = sc.nextInt();

        if (a==b){
            System.out.println("A and B Are equals");
        }
        else if(a>b){
            System.out.println("A is greater than B");
        }
        else if(a<b){
            System.out.println("B is greater than A");
        }
        else {
            System.out.println("Not correct");
        }
        */

        // switch statement are use id java

        switch (Month){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
