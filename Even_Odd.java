//the following program prompt the user to enter any number and the Program will automatically tell if the number is even or odd
//Developed by Richard Mlambuzi 

//importing Scanner from java library
import java.util.Scanner;

//Creating java class
public class Even_Odd
{
    //Program method
    public static void main(String [] args)
    {
        //Displaying "Type a number " on the cousole
        System.out.print("Type a number: ");
        
        //Creating Scanner variable
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //creating even or old formula
        if(number%2 == 0)
        {
            //Displaying "Even" on the cousole
            System.out.println("Even");
        }
        else if(number%2 == 1)
        {
            //Displaying "Odd" on the cousole            
            System.out.println("Odd");
        }
        else
        {
            //Displaying "Please enter valid a number"on the cousole
            System.out.println("Please enter valid a number");
        }
    }
}