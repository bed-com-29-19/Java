//importing Scanner from java libary
import java.util.Scanner;
//Creating java class
public class WeekDays
{
    //Program mwthod
    public static void main (String [] args)
    {
        //Displaying "Enter Today's Day: " on the cousole
        System.out.print("Enter Today's Day: ");
        
        //Creating scanner Variable
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        
        //Displaying "Enter the number of days elapsed since today: " on the cousole
        System.out.print("Enter the number of days elapsed since today: ");
        int number = input.nextInt();
        //creating if statements
        if (day == 0)
        {
            //Displaying "Today is Sunday" on the cousole
            System.out.print("Today is Sunday");

        }
        else if(day == 1)
        {
            //Displaying "Today is Monday" on the cousole
            System.out.print("Today is Monday");
        }
        else if(day == 2)
        {
            //Displaying "Today is Tuesday" on the cousole
            System.out.print("Today is Tuesday");
        }
        else if(day == 3)
        {
            //Displaying "Today is Wednesday" on the cousole
            System.out.print("Today is Wednesday");
        }
        else if(day == 4)
        {
            //Displaying "Today is Thursday" on the cousole
            System.out.print("Today is Thursday");
        }    
        else if(day == 5)
        {
            //Displaying "Today is Friday" on the cousole
            System.out.print("Today is Friday");
        }
        else if(day == 6)
        {
            //Displaying "Today is Saturday" on the cousole
            System.out.print("Today is Saturday");
        }
        else
        {
            //Displaying "Enter a valid Day." on the cousole
            System.out.print("Enter a valid Day.");
        }
        //Creating if statements
        if (number == 0)
        {
            //Displaying " and the future day is Monday." on the cousole
            System.out.print(" and the future day is Monday.");

        }
        else if(number == 1)
        {
            //Displaying " and the future dayis Tuesday." on the cousole
            System.out.print(" and the future dayis Tuesday.");
        }
        else if(number == 2)
        {
            //Displaying " and the future day is Wednesday." on the cousole
            System.out.print(" and the future day is Wednesday.");
        }
        else if(number == 3)
        {
            //Displaying " and the future day is Thursday." on the cousole
            System.out.print(" and the future day is Thursday.");
        }
        else if(day == 4)
        {
            //Displaying " and the future day is Friday." on the cousole
            System.out.print(" and the future day is Friday.");
        }
        else if(number == 5)
        {
            //Displaying " and the future day is Saturday." on the cousole
            System.out.print(" and the future day is Saturday.");
        }
        else if(number == 6)
        {
            
            //Displaying" and the future day is Sunday." on the cousole
            System.out.print(" and the future day is Sunday.");
        }
        else
        {
            //Displaying "Enter a valid Day." on the cousole
            System.out.println("Enter a valid Day.");
        }
    }
}