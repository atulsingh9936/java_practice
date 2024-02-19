package firstjavaproject;

public class cwh_24_break_and_continue {

    public static void main(String[] args) {
        //Break and continue using loops
//        for(int i=0;i<50;i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        int i=0;
//        while(i<50){
//            System.out.println(i);
//           System.out.println("java is great");
//            if(i==2){
//               System.out.println("Ending the loop");
//              break;
//           }
//            i++;
//
//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("java is great");
//            i++;
//            if(i==2) {
//                System.out.println("Ending the loop");
//                break;
//
//
//            }
//
//        }while(i<50);
//        System.out.println("Loop ends here");

     //continue
        for(int i=0;i<=50;i++) {

              if(i==2){
                System.out.println("Ending the loop");
                continue;
           }
              System.out.println(i);
              System.out.println("java is great");
        }


    }


}
