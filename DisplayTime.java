//importing Scanner from java library
import java.util.Scanner;

//Creating class for the program
public class DisplayTime{
    //Method of the program
    public static void main(String [] args){

        //Displaying message on the cousole
        System.out.print("Enter number of seconds :");
     
        //Getting user imput
        Scanner input = new Scanner(System.in);
        //Assigning memory  and variables for user input
        int memory = input.nextInt();


        //caculating the time into minutes and seconds
        int minute = memory / 60;
        int remainder = memory % 60;
           //Skiping a line
        System.out.println();


        //Displaying the final time
        System.out.println(memory + " Seconds(s) is " + minute +" Minute(s) and " + remainder + " Second(s)"); 


        

    }
}


