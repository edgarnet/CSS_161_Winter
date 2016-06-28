// Condition - The event which activates a statement.
// Execution - The act of running a program.
// Conditional Execution - The act of running an event to activate a statement.
// If/Else Statement - The parameters which activate given a conditon.
// Selection Control Structures - The complete orginization of conditions and their respective statements.
/**
 * Example One:
 * if (i < 18);
 *  System.out.println("You cannot enter.");
 *
 * Example Two:
 * if (i > 18);
 *  System.out.println("You can enter.");
 * else if (i <= 18 && i >= 14);
 *  System.out.println("Proceed with caution.");
 */
// Branching - Determines the course of a statement for a particular input.
//  For example, "break" terminates the statement, "continue" ignors the current statement, and "return" outputs from the following statement.
// Mountain Interval by Robert Frost is a collection of his poetry; "The Road Not Taken" includes the stanzas "Two roads diverged in a wood, and I— 
// I took the one less traveled by" which could describe the choices a program must make given its conditions and statements, and the path a programmer must ultimately design.
// Adventure Books: The choices a reader makes are determined by the branches provided at the end of a chapter, resulting in the progression, regression, or conclusion of the reader's tale.
// Game Tree a. The game tree for Tic-Tac-Toe is small with two players having only one condition: three positions for a win.
// Game Tree b. The game tree for Chess is larger with two players controller various conditions each with specific statements.
// Pass-by-Value allows primitives to contain their initial parameter(s) regardless of their output in a statement.
// Floating point roundoff error - The difference between the calculated apporoximation and its exact mathematical value due to rounding.
import java.util.Scanner;
// Yes since the boolean can only be 0 or 1
// Powers of 2 are found the amount of bytes in a bit.

public class WarmupConditionals
{
    public static void main (String[] args) {
        TODO1();
        TODO2();
        TODO3();
        TODO4();
        TODO6();
        TODO7();
        TODO9();
        TODO10();
        TODO11();
        TODO12();
        TODO13();
    }
 
    public static void TODO1 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = keyboard.nextInt();
        
            if (number < 0){
                System.out.println("The number is negative.");
            }
    }
    
    public static void TODO2 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a second number:");
        int number = keyboard.nextInt();
        
            if (number == 0) {
                System.out.println("The number is zero.");
            }
    }
 
    public static void TODO3 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a double for the class average:");
        double average = keyboard.nextDouble();
        
            if (average > 65.0){
                System.out.println("A passing grade.");
            }
    }
    
    public static void TODO4 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a boolean value:");
        boolean answer = keyboard.nextBoolean();
        
            if (answer == true) {
                System.out.println("The value was true.");
            }
            //act5
            else if (answer == false) {
                System.out.println("The value was false.");
            }
    }
    
    public static void TODO6 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = keyboard.nextInt()%2;
            
            if (number == 0) {
                System.out.println("The number is even.");
            }
            else if (number == 1) {
                System.out.println("The number is odd.");
            }
    }
    
    public static void TODO7 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your grade as a float:");
        float grade = keyboard.nextFloat();
        
            if (grade > 89.5f) {
                System.out.println("The grade is an A.");
            }
            //Keeps the number as a float, rather than a double.
            //act8
            else if (grade < 89.5f) {
                System.out.println("Is the grade a B?");
                float grade2 = keyboard.nextFloat();
                if (grade2 > 83.49f && grade2 < 90f) {
                    System.out.println("The grade is a B.");
                }
                else if (grade2 > 75.0f && grade2 < 83.49f) {
                    System.out.println("The grade is a C.");
                }
            }
    }
    
    public static void TODO9 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What's the temperature?");
        int temperature = keyboard.nextInt();
        
            if (temperature > 78) {
                System.out.println("The temperature is higher than 78 degrees.");
            }
            else if (temperature < 78) {
                System.out.println("The temperature is lower than 78 degrees.");
            }
    }
    
    public static void TODO10 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = keyboard.nextInt();
            
            if (number > 0) {
                System.out.println("Is it odd?");
                int number2 = keyboard.nextInt()%2;
                if (number2 == 1){
                System.out.println("The number is positive and odd.");
               }
            }
            else if (number == 0){
                System.out.println("The number is zero.");
            }
            else if (number < 0) {
                System.out.println("Is it even?");
                int number3 = keyboard.nextInt()%2;
                if (number3 == 0){
                System.out.println("The number is negative and even.");
               }
            }
    }
    
    public static void TODO11 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a letter grade:");
        char letterGrade = keyboard.next().charAt(0);
        
            if (letterGrade == 'A' || letterGrade == 'a') {
                System.out.println("90-100");
    }
    
            if (letterGrade == 'B' || letterGrade == 'b') {
                System.out.println("80-89");
    }
    
            if (letterGrade == 'C' || letterGrade == 'c') {
                System.out.println("70-79");
    }
    
            if (letterGrade == 'D' || letterGrade == 'd') {
                System.out.println("60-69");
    }
    
            if (letterGrade == 'F' || letterGrade == 'f') {
                System.out.println("-59");
    }
    
    }
    
    public static void TODO12 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a = keyboard.nextInt();
        System.out.println("Enter another number:");
        int b = keyboard.nextInt();
        System.out.println("The maximum number is " + Math.max(a,b));
    }
    
    public static void TODO13 () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a = keyboard.nextInt();
        System.out.println("Enter another number:");
        int b = keyboard.nextInt();
        
        if (a > b) {
            System.out.println("x was bigger than y.");
        }
        else if (a < b) {
            System.out.println("y was bigger than x.");
        }
        else if (a == b) {
            System.out.println("x and y are equal.");
        }
    }
}
