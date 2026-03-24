public class Array  {
    public static void main(String[] args){
        /*
        String [] cars = {"Tata","BMW","Royal"};
        // Printing Array using for loop in revers order
        for(int i=cars.length-1;i>=0;i--){
            System.out.println(" " + cars[i]);
        }
        System.out.println("The length of array are : " + cars.length);



        /*
        // Output :-
         Royal
         BMW
         Tata
         The length of array are : 3
     */
        // Create an array of 5 float And calculate their sum
        /*
        float [] om = {55.55f , 56.76f , 56.56f , 88.88f};
        float sum = 0;
        for(float element : om){
            sum = sum + element;
        }
        System.out.println("The sum of array are : " + sum);
         */

        // Write a program to find out whether a given integer
        // is present in an array or not ?

        int [] om = {15,28,33,44,55};
        int num = 99;
        boolean isInArray = false;
        for(int element : om){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is present in the array");
        }










    }

}




