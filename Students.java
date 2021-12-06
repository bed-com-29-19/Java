//Richard Mlambuzi

//Bed-com-29-19

 //program that prompt the user to enter the number of students , students names and score, and displays the students with highest score and students with lowest score.

 //importing Scanner variable

import java.util.Scanner;

public class Students{
   //method
  public static void main(String[] args) {
  //creating scanner variable
  Scanner input = new Scanner(System.in);
  
  //Display message
  System.out.print("Enter number of students: ");
  //Getting user input
  int numberOfStudents = input.nextInt();
  int score,      
           highestScore = 0,           
           secondHigestScore = 0;   
       String name = "",        
               highestStudent = "",   
               lowestStudent = "";  
      
       // Getting user input
       System.out.println("Enter each students' name and score:");
       for (int i = 0; i < numberOfStudents; i++) {
           System.out.print(
               "Student: " + (i + 1) + "\n Name: ");
           name = input.next();
           System.out.print(" Score: ");
           score = input.nextInt();

           if (i == 0) {
               // Make the first student the highest
               highestScore = score;
               highestStudent = name;
           }
           else if (i == 1 && score > highestScore) {
               // Second student entered scored
               // higher than first student
               secondHigestScore = highestScore;
               highestScore = score;
               lowestStudent = highestStudent;
               highestStudent = name;
           }
           else if (i == 1) {
               // Second student entered scored
               // lower than first student
               secondHigestScore = score;
               lowestStudent = name;
           }      
           else if (i > 1 && score > highestScore && score > secondHigestScore) {
               // Last student entered has the highest score
               secondHigestScore = highestScore;
               lowestStudent = highestStudent;
               highestScore = score;
               highestStudent = name;
           }
           else if (i > 1 && score > secondHigestScore) {
               // Last student entered has the second highest score
               lowestStudent = name;
               secondHigestScore = score;
           }
       }

       // Display the student with the hightest score
       System.out.println(
           "Higest scoring student: " + highestStudent +
           "\nSecond Higest scoring student: " + lowestStudent);
  

  }

}
