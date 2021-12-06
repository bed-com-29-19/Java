//importing Scanner from java library
import java.util.Scanner;

//Creating class for the program
public class DisplayFinalTime{
    //Method of the program
    public static void main(String [] args){

        //Displaying message on the cousole
        System.out.print("Enter number of seconds :");
        

        //Remaning Scanner and Getting user imput
        Scanner input = new Scanner(System.in);
        //Assigning memory  and variables for user input
        int memory = input.nextInt();


        //caculating the entered imput into hours , minutes and seconds
        int hours = memory / 3600;
        int remainder = memory % 3600;
        int remainder1 = remainder / 60;

        int remainder2 = remainder1 % 60;
        //Skiping a line
        System.out.println();

        
        //Displaying the final time
        System.out.println(memory + " Seconds(s) is " + hours + " hour(s) " + remainder1 +" Minute(s) and " + remainder2 + " Second(s)"); 


        

    }
}


