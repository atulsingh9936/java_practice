package firstjavaproject;
import java.util.Scanner;

public class chw_19_Practice_set_4 {
    public static void main(String[] args) {
//        Question 2;
//        Byte m1,m2,m3;
       // Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your physics marks");
//        m1 =sc.nextByte();
//        System.out.println("Enter your Chemistry marks");
//        m2 =sc.nextByte();
//        System.out.println("Enter your Maths marks");
//        m3 =sc.nextByte();
//        float avg =(m1+m2+m3)/3.0f;
//        System.out.println("Overall percentage is "+ avg);
//        if(avg>=40 &&m1>33 && m2>33 &&m3>33){
//            System.out.println("Congratulation you have been promoted");
//
//        }else {
//            System.out.println("sorry, you have not been promoted! please try again");
//        }

        //question 3;

//        Scanner sc= new Scanner(System.in);
//       System.out.println("Enter your income in lakhs");
//        float income = sc.nextFloat();
//        float tax = 0;
//        if(income<=2.5){
//            tax =tax+0;
//        }
//       else if(income>2.5f && income<=5f) {
//
//            tax = tax + 0.05f * (income - 2.5f);
//
//        }
//        else if(income>5f && income<=10f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f);
//
//        }
//        else if (income>10.0f) {
//
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
      //  }
//        System.out.println("The total tax of employee is "+  tax);

        //  question:4
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter day");
//          int days = sc.nextInt();
//
//        switch(days){
//            case 1 ->System.out.println("Monday");
//            case 2 ->System.out.println("Tuesday");
//            case 3 ->System.out.println("wednesday");
//            case 4 ->System.out.println("Thrusday");
//            case 5 ->System.out.println("Friday");
//            case 6->System.out.println("Saturday");
//            case 7 ->System.out.println("Sunday");
//
 //       }

      //  question 5

//    Scanner sc= new Scanner(System.in);
//        System.out.println("Enter year");
//    int year = sc.nextInt();
//    if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
//    {
//        System.out.println("The year is leap year");
//    } else{
//         System.out.println("The entered year is not a  leap year");
//        }

 // Question 6;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a domain");
        String Website =sc.next();

        if(Website.endsWith(".org")){
            System.out.println("This is an organizational website");
        } else if (Website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }else if (Website.endsWith(".in")){
            System.out.println("This is an indian website");
        }



    }
    }

