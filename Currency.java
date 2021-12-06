//The following program allows the conversion of curency for MWK and Dollars only
//Developed by Richard MLambuzi


//importing Scanner from java library
import java.util.Scanner;

//Creating java class
public class Currency
{
    //Program method
    public static void main(String []args)
    {
        //Displaying "Enter the exchange rate from dollars to MWK: " on the cousole
        System.out.print("Enter the exchange rate from dollars to MWK: ");

        //creating Scanner variable
        Scanner input = new Scanner(System.in);
        //Getting user input on the cousole
        Float rate = input.nextFloat();

        //Displaying "Enter the exchange rate from dollars to MWK: " on the cousole
       System.out.print("Enter 0 to convert dollars to MWK and 1 vice versa: ");
       //Getting user input on the cousole
       int choise = input.nextInt();

       //creating if statements
       if(choise == 0)
       {
            //Displaying "Enter the dollar amount: " on the cousole
           System.out.print("Enter the dollar amount: ");
           //Getting user input on the cousole
           Float dollar = input.nextFloat();

             //Displaying final MWK currency on the cousole
           Float dollars = dollar * rate;
           System.out.println("$" +dollar+ " is " +dollars+ " Kwacha");
       }
        else if (choise == 1)
       {
            //Displaying "Enter the MWK amount: " on the cousole
           System.out.print("Enter the MWK amount: ");
           //Getting user input on the cousole
           Float MWK = input.nextFloat();

            //Displaying Final dollar currecny on the cousole
           Float Kwacha = MWK / rate;
           System.out.println( +MWK+ " Kwacha is $" +Kwacha+ " dollars");
       }
       else
       {
           //Displaying "Choose valid input" on the cousole
           System.out.println("Choose valid input");
       }

    }
}