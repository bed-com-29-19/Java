// the following program reads the shorthand text descripution of a colour


//importing scanner from java library
import java.util.Scanner;

//Creating java class
public class Colours
{
    //Program method
    public static void main(String []args)
    {
        //Displaying "What colour do you want" on the cousole
        System.out.print("What colour do you want? ");

        //Creating Scanner variable
        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();

        //Stating if statements
        if(letter.equalsIgnoreCase("r"))
        {
            //Displaying "You have choosen Red." on the cousole
            System.out.println("You have choosen Red.");
        }
        else if (letter.equalsIgnoreCase("g"))
        {
            //Displaying "You have chosen Green." on the cousole
            System.out.println("You have chosen Green.");
        }
        else if(letter.equalsIgnoreCase("b"))
        {
            //Displaying "You have choosen Blue." on the cousole
            System.out.println("You have choosen Blue.");
        }
        else
        {
            //Displaying "Please enter a varid letter!" on the cousole
            System.out.println("Please enter a varid letter!");
        }

    }
    
}