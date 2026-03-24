public class Array  {
    public static void main(String[] args){
        String [] cars = {"Tata","BMW","Royal"};
        // Printing Array using for loop in revers order
        for(int i=cars.length-1;i>=0;i--){
            System.out.println(" " + cars[i]);
        }
        System.out.println("The length of array are : " + cars.length);
    }

}
    /*
    // Output :-
         Royal
         BMW
         Tata
         The length of array are : 3
     */
