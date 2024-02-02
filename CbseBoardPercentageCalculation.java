package firstjavaproject;
import java.util.Scanner;
public class CbseBoardPercentageCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 500;
        System.out.println("Enter your maths marks: ");
        float a = sc.nextFloat();
        System.out.println("Enter your Physics marks: ");
        float b = sc.nextFloat();
        System.out.println("Enter your chemistry marks: ");
        float c = sc.nextFloat();
        System.out.println("Enter your social study marks: ");
        float d = sc.nextFloat();
        System.out.println("Enter your biology marks: ");
        float e = sc.nextFloat();

       float obtainedMarks = a+b+c+d+e;

      float  percentage=(obtainedMarks/totalMarks)*100;
        System.out.println(percentage);


    }
}
