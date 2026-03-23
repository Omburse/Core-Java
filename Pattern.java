public class Pattern {
    public static void main(String[] args){
        /*
        // 1.Solid Rectangle
            * * * * *
            * * * * *
            * * * * *
            * * * * *
         */

        //outer loop
        /*
        for(int i=1 ;i<=4;i++){
            //inner loop
            for(int j=1 ; j<=5 ; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
         */
        /*
        // 2 . Hollow Rectangle
            * * * * *
            *       *
            *       *
            * * * * *
         */
        /*
        int n = 4;
        int m = 5;
        for(int i = 1; i<=4;i++){
            for(int j = 1 ; j<=5;j++){
                if( i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
         */

        /*
        // 3. Half Pyramid
            *
            * *
            * * *
            * * * *

         */
        /*
        int n = 4;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
         */
        /*
        // 4.Inverted Half Pyramid
            * * * *
            * * *
            * *
            *
         */
        /*
        int  n = 4;
        for(int i = n ;i>=1;i--){
            for(int j = 1 ; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
         */
        /*
        // 5.Inverted Half Pyramid
                        *
                      * *
                    * * *
                  * * * *
                * * * * *
         */
        /*
        int n = 4;
        //outer loop
        for(int i=1;i<=n;i++){
            //Space Print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            Star Print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

         */
        /*
        // 6. Half Pyramid with Numbers
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

         */
        /*
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print( j );
            }
            System.out.println(" ");
        }

         */
        // 7.Inverted Half Pyramid
        /*
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
         */
        /*
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

         */
        // 8.Floyd's Triangle
        /*
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
         */
        /*
        int n = 5;
        int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print( num + " ");
                num++;
            }
            System.out.println(" ");
        }

         */
        /*
        // 9. 0-1 Triangle
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1

         */
        /*
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum % 2 ==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }

            System.out.println("");
        }

         */
        //10 . Butterfly Pattern
        /*
            *             *
            * *         * *
            * * *     * * *
            * * * * * * * *
            * * * * * * * *
            * * *     * * *
            * *         * *
            *             *
         */
        //upper half
        /*
        int n = 5;
        for(int i = 1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half

        for(int i = n;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */

        /*
          // 11.Solid Rhombus

                    * * * * *
                  * * * * *
                * * * * *
              * * * * *
            * * * * *

         */
        /*
        int n = 5;
        for(int i=1;i<=n;i++){
            //Space Print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Star print
            for(int j=1;j<=5;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        
         */




    }
}
