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

     //DEPENDENTS DECLARATION
      System.out.print("Enter number of dependents: ");
      int numDependents = input.nextInt();

      int dependents = numDependents;

       //ALLOWANCE DECLARATION AND INITIALIZATION
       int allowance = 0;
       int totalAllowance = 0;

       //lopping through each dependent using nested for loop and if-else statement

      for (int i = 1; i <= dependents; i++){

        //NAME DECLARATION
        System.out.print("Enter name of dependent " + i + ": ");
        String name = input.next();

        /**
         * ALLOWANCE CONDITIONAL STATEMENT
         * 0-5 years old - 1000 allowance
         * 6-18 years old - 2000 allowance
         * above 18 years old - 0 allowance
         */

        for (int j = 1; j <= 1; j++){
          //AGE DECLARATION
          System.out.print("Enter age of " + name + ": ");
          int age = input.nextInt();

          //CONDITION FOR ALLOWANCE BASED ON AGE
          if (age >= 0 && age <= 5){
            allowance = 1000;
          } else if (age >= 6 && age <= 18){
            allowance = 2000;
          } else if (age > 18){
            allowance = 0;
          } else {
            System.out.println("Invalid age. Please enter a valid age.");
            j--;
            continue;
          }

          System.out.println("Dependent " + i + ": Name: " + name + ", Age: " + age + ", Allowance: " + allowance);
          //TOTAL ALLOWANCE FOR ALL DEPENDENTS
          totalAllowance += allowance;
        }

      }

      System.out.println("Total allowance for all dependents: " + totalAllowance);

    input.close();
  }
}