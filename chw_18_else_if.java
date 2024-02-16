package firstjavaproject;
import java.util.Scanner;

public class chw_18_else_if {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age =sc.nextInt();


        switch (age){
            case 18:
                System.out.println("You are going to become adult");
                break;
            case 25:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }











//        if (age>56){
//            System.out.println("You have much experience");
//
//        } else if (age>46) {
//            System.out.println("You are semi experienced");
//
//        } else if (age>36) {
//            System.out.println("you are semi-semi experienced");
//
//
//        }else {
//            System.out.println("you are not experienced");
//        }


    }
}
