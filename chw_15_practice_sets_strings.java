package firstjavaproject;

public class chw_15_practice_sets_strings {

    public static void main(String[] args) {
//     //Problem 1
//        String name = "HARISH";
//         name = name.toLowerCase();
//        System.out.println(name);
//     //Problem 2
//        String name2 =" Atul Singh ";
//      name2=  name2.replace(" ","_");
//        System.out.println(name2);
    //Problem3
        String Letter = "Dear |<name|>, Thanks a lot";
        Letter = Letter.replace("|<name|>","Sachin");
        System.out.println(Letter);
        // Problem4
        String myString = " The string contains   double and triple spaces ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // problem 5

        String myLetter = "Dear Harry,\n\tThis is nice java course.\n\tThanks!";
        System.out.println(myLetter);
   }
}
