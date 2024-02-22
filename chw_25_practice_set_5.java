package firstjavaproject;

public class chw_25_practice_set_5 {
    public static void main(String[] args) {
     //   Practice problem 1
//        for(int i=1;i<=4;i++){
//            for (int j=4;j>=i;j--){
//                System.out.print("*");
//            }
//
//            System.out.println();
//
//        }
//        //Practice problem 2
        // first 5 even number sum is
//          int sum=0;
//          int n=5;
//          for(int i=0;i<n;i++){
//              sum = sum+(2*i);
//          }
//        System.out.print("sum of n even number is ");
//        System.out.println(sum);
      // Practice problem 3
//        int n=7;
//        for(int i=1;i<=10;i++){
//            System.out.println(n*i);
//        }

     //   Practice problem 4

//        int n=7;
//        for(int i=10;i>=1;i--){
//            System.out.println(n*i);
//        }

        // practice problem 5 ;  factorial program using for loop

//        int i,fact=1;
//        int number=5;//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);


        // practice problem 6 ;  factorial program using while loop

//        int i=1;
//        int n=5;
//        int factorial =1;
//        while(i<=n){
//          //  factorial *=i;
//            factorial =factorial*i;
//
//            i++;
//
//        }
//        System.out.println(factorial);

        //   Practice problem 1 using while loop

             int row=4; int i=1; int j=1;
             while(i<=row){
                 while(j<=i){
                     System.out.println("*");
                     j++;

                 }
                 System.out.println();
                 i++;
             }

    }
}


