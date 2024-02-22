package firstjavaproject;

public class star_pattern_Programs_1 {

    public static void main(String[] args) {

        //right angled triangle
//        for(int i=0;i<=5;i++) {
//            for (int j=0; j<=i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println(" ");

       // }
       //  Reverse right angled triangle



            //right angled triangle
//            for(int i=0;i<=4;i++) {
//                for (int j=4; j>=i; j--) {
//                    System.out.print("*");
//                }
//
//                System.out.println(" ");
//
//            }
        //square pattern
//        for (int i = 0; i  <  5; i++) {
//            for (int j = 0; j  <  5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

           //square pattern
//             for(int i=1;i<=5;i++){
//                 for(int j=1;j<=5; j++){
//                     System.out.print("* ");
//                 }
//                 System.out.println();
//             }
      // number pattern
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5; j++){
//                System.out.print(i+1 +" ");
//            }
//            System.out.println();
//        }


//        for(int i=0;i<5;i++){
//            for(int j=0;j<5; j++){
//                System.out.print(j+1 +" ");
//            }
//            System.out.println();
//        }


        //hollow square
         int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n; j++){

                if(i == 0 || i == n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
            }


        }
}
