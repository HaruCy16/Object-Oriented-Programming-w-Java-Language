/**
  INSTRUCTIONS

  USE FOR LOOP FOR NAME AND AGE

  1. Mew program dependents class
  The program should:
    -ask user to enter number of dependents
    -for each dependent, ask user to enter the age
    -assign an allowance based on age using if-else inside a loop:
      0-5 years old - 1000 allowance
      6-18 years old - 2000 allowance
      above 18 years old - 0 allowance
  -display all dependents wth their names, ages and allowance
  -display total allowance for all dependents
 */

import java.util.Scanner;

public class Dependents{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
      String report = ""; // Initialize report string to accumulate details content at last

      int numDependents = 0; // Initialize numDependents as a String to check for valid integer input

      //DEPENDENTS DECLARATION
      System.out.print("Enter number of dependents: ");
      numDependents = input.nextInt();
      
      input.nextLine(); // Consume the newline character left by nextInt()

      int dependents = numDependents;

      //VARIABLE DECLARATION AND INITIALIZATION AGE, ALLOWANCE, TOTAL ALLOWANCE
      int age;
      int allowance = 0;
      int totalAllowance = 0;

       //lopping through each dependent using nested loop for name and age
      for (int i = 1; i <= dependents; i++){

        //NAME DECLARATION
        System.out.print("Enter name of dependent " + i + ": ");
        String name = input.nextLine();

        /**
         * ALLOWANCE CONDITIONAL STATEMENT
         * 0-5 years old - 1000 allowance
         * 6-18 years old - 2000 allowance
         * above 18 years old - 0 allowance
         */

         //DECLARATION OF CONSTANTS FOR ALLOWANCE
         final int allowanceChild = 1000;
          final int allowanceTeen = 2000;
          final int allowanceAdult = 0;

          while (true) {
              System.out.print("Enter age of " + name + ": ");

              if (input.hasNextInt()) {
                  age = input.nextInt();

                  if (age > 0 && age <= 5) {
                      allowance = allowanceChild;
                  } else if (age >= 6 && age <= 18) {
                      allowance = allowanceTeen;
                  } else if (age > 18) {
                      allowance = allowanceAdult;
                  } else {
                      System.out.println("Invalid age. Please enter a valid age.");
                      continue;
                  }

                  totalAllowance += allowance; //Allowance will be accumulated in totalAllowance variable
                  input.nextLine(); // Consume the newline character left by nextInt()
                  break;  // exit loop if valid
              } else {
                  System.out.println("Invalid input. Numbers only.");
                  input.next(); // consume the wrong input so scanner can continue
              }
          }

        /**
         * REPORT VARIABLE TO ACCUMULATE ALL DEPENDENTS DETAILS
         * DISPLAY ALL DEPENDENTS WTH THEIR NAMES, AGES AND ALLOWANCE
         * FORMAT: NAME-AGE, ALLOWANCE
         * Inputs from loop will be accumulated in report variable
         */
        report += " " + name + "- " + age + ", " + allowance + "\n"; // Accumulate details in report variable

      }
      //DISPLAY ALL DEPENDENTS WTH THEIR NAMES, AGES AND ALLOWANCE
      System.out.println("Dependents: ");
      System.out.print(report); //DISPLAY REPORT VARIABLE CONTENT

      //DISPLAY TOTAL ALLOWANCE FOR ALL DEPENDENTS
      System.out.println("Total allowance: " + totalAllowance);

    input.close();
  }
}
