//This program displays number of even and odd when the user enter list of intergers
//BED-COM-29-19  Richard Mlambuzi

//importing java utilities
import java.util.*;
public class ArrayIntergers{
    public static void line(){
        System.out.println();
    }
    public static Scanner input = new Scanner(System.in);
    public static void main(String []args){
        int even = 0;
        int odd = 0;
        System.out.print("How many interger would you like to enter? :");
        int numLength = input.nextInt();
        int [] intergers = new int[numLength];
        line();
        System.out.println("Enter list of" +numLength+ " intergers");
        for(int i = 0; i < intergers.length; i++){
            intergers [i] = input.nextInt();
            if(intergers [i] % 2 == 0 ){
                even++;
            }else {
                odd++;
            }
            
        }
        line();
        System.out.println("The number of even intergers is "+ even);
        System.out.println("The number of odd intergers is "+ odd);
    }
}
  