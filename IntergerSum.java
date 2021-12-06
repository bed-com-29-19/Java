//importing Scaner from java library
import java.util.Scanner;

//Creating java class
public class IntergerSum
{
    //Program method
    public static void main(String []args)
    {
        //creating random number variables
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        //Creating Scanner variable
        Scanner input = new Scanner(System.in);

        //Displaying "Here are the three digit intergers enter their sum." on the cousole
        System.out.println("Write the sum of the following numbers: "+number1+ " + " +number2+ " + " +number3);

        //Skipping one line on the cousole
        System.out.println();

        //Getting user input
        int answer = input.nextInt();

        //creating variables
        int x = number1 + number2 + number3;

        //creating if statements
        if(answer == x)
        {
            //Skipping one line on the cousole
            System.out.println();
            //Displaying "Correct sum " on the cousole
            System.out.println("Correct Sum");
        }
        else
        {
            //Skipping one line on the cousole
            System.out.println();
            //Displaying "Wrong Sum" on the cousole
            System.out.println("Wrong Sum");
        }
    }
}