
import java.util.Scanner;

/**
 * Write a description of class Homework here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeworkEx
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        System.out.println("Input a number:");
        
        Scanner keyboard = new Scanner(System.in);
        int n = 30; //Static in homework!
        double[][] spreadsheet = new double[n][n];
        
        printMenu();
        int input = 0;
        
        input = keyboard.nextInt();
        
        do {
            switch (input) {
                case 1:
                    int x = keyboard.nextInt();
                    int y = keyboard.nextInt();
                    double z = keyboard.nextDouble();

                    System.out.print("|" + x + "," + y + "|" + "The z is:" + z);
                    printMenu(); //After each case, the menu pops up.
                    System.out.println("This is the spreadsheet: " + spreadsheet[x][y]);
                    break;  //Get paid 10% more using break.
                    
                case 8: 
                    System.exit(0);
                    break;
            }
            
        } while(input!=8);
        
    }
    
    public static void printMenu() {
        System.out.println("(1) Input (2) Row Sum (3) Col Sum (4) Row Ave (5) Col Ave (6) Sum (7) Average");
    }
    
}
