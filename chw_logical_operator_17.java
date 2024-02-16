package firstjavaproject;

public class chw_logical_operator_17 {
    public static void main(String[] args) {

//        System.out.println("for Logical AND");
//
//        boolean a = true;
//        boolean b = true;
//        boolean c = true;
//        if ( a && b && c ){
//            System.out.println('y');
//        } else{
//            System.out.println('N');
//        }
        System.out.println("for Logical OR");

        boolean a = false;
        boolean b = false;
       // boolean c = true;
        if ( a || b  ){
            System.out.println('y');
        } else{
            System.out.println('N');
        }

        System.out.println("For Logical not");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
