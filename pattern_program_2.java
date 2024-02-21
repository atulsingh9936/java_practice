package firstjavaproject;

public class pattern_program_2 {

    public static void main(String[] args) {
//        int n=5;
//        for( int i=1;i<=5;i++){
//            for(int j=5;j>=i;j--){
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
        //print column number
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
//        int n=5;
//        for(int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }
        // Pyramid program
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

       }
        // Pyramid program
//        int n=7;
////inner loop
//        for (int i= 1; i<= n; i++)
//        {
////outer loop
//            for (int j=1; j<=n-i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//    }
        }


    }