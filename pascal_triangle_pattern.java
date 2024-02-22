package firstjavaproject;

public class pascal_triangle_pattern {
    public static void main(String[] args) {

        // upward triangle

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }



        //Downward triangle
        for(int i=5;i>1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
