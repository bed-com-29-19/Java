//This program displays number of even and odd when the user enter list of intergers
//BED-COM-29-19  Richard Mlambuzi

//importing java utilities
import java.util.*;

public class Difference {
    public static void line(){
        System.out.println();
    }
    public static Scanner input = new Scanner(System.in);
    public static void main(String []args){
        
        System.out.print("How many interger would you like to enter? :");
        int numlength = input.nextInt();
        int [] numbers = new int[numlength];
        int maxValue = numbers[0];
        int minValue = numbers[0];
        line();

        System.out.println("Enter list of " +numlength+ " intergers");
        for(int i = 0; i < numbers.length; i++){
            numbers [i] = input.nextInt();
            if(numbers [i] > maxValue){
                maxValue = numbers[i];
            }
            else if(numbers [i] < minValue){
                minValue = numbers[i];
            }
        }
     int difference = maxValue - minValue;
        line();
        System.out.println("The maximum difference between two elements of the said array elements is "+difference);
    } 
}