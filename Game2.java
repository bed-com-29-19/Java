//BED-COM-29-19 (RICHARD MLAMBUZI)
//This program its a game (Odds and Evens) between user and a computer

//importing all java utilities
import java.util.*;
public class Game2{
    //another methord
    public static void line() {
         System.out.println("--------------------------------------------------");
    }
    //main method
    public static void main(String []args){
        //creating Scanner variable
        Scanner input = new Scanner(System.in);
        String line;
        int randomNumber = 0 + (int) (Math.random() * 5);
        int numFingers = 0;
        int sum = 0;

        //Displaying user guide
        System.out.println("Let`s play a game called \"Odds and Evens\" ");
        System.out.print("What is your name?  ");
        String userName = input.next();
        System.out.println("Hi " +userName+ " Which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();

        //computing if statement
        if(choice.equalsIgnoreCase("E")){
            System.out.println(userName+" has picked evens! The computer will be odds.");
            line();
            System.out.println();
            System.out.println("How many  \"fingers\" do you put out?  ");
            numFingers = input.nextInt();

            //sumation of radom number and number of fingers that the user has entered

            sum = (numFingers + randomNumber);
            System.out.println("The computer plays "+randomNumber+" \"fingers\".");
            line();
                            
            if(sum%2 ==0){
            System.out.println(numFingers+" + "+randomNumber+" = "+sum);;
            System.out.println(sum + " is even! \nThat means "+userName+" wins! :) ");
            }
		
            else{
            System.out.println(numFingers+" + "+randomNumber+" = "+sum);
            System.out.println(sum + " is odd! \nThat means "+userName+" lose! :( ");   
			}
		}
		else if(choice.equalsIgnoreCase("O")){
            System.out.println(userName+" has picked odds! The computer will be evens.");
            line();
            System.out.println();
            System.out.println("How many  \"fingers\" do you put out?  ");
            numFingers = input.nextInt();
			
            
            //sumation of radom number and number of fingers that the user has entered

            sum = (numFingers + randomNumber);
            System.out.println("The computer plays "+randomNumber+" \"fingers\".");
                    
            line();
            if(sum%2 ==1 ){
            System.out.println(numFingers+" + "+randomNumber+" = "+sum);;
            System.out.println(sum + " is odd! \nThat means "+userName+" wins! :) ");
             }
			 else{
                System.out.println(numFingers+" + "+randomNumber+" = "+sum);
                System.out.println(sum + " is even! \nThat means "+userName+" lose! :( ");
                
			}			
        } line();

        
    }//This source code was created by Bed-com-29-19
    //RICHARD MLAMBUZI
}