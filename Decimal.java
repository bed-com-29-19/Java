//importing Scanner from java library
import java.util.Scanner;

//creating java class
public class Decimal{
    //progarm method
    public static void main(String []args){

        //Displaying Enter your 4 decimal number on the cousole
        System.out.print("Enter your 4 decimal number :");

        //Renaming Scanner and Getting user imput
        Scanner input = new Scanner(System.in);
        //Creating memory for user input
        Float number = input.nextFloat();

       //Skipping one line
        System.out.println();
         //Displaying the final resuit on the cousole
        System.out.printf( number + " to 2 decimal place is %.2f", number);
        //Skipping one line
        System.out.println();
    }
}
