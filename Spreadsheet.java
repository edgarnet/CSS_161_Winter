import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Spreadsheet Skeleton File
 * For use with the Spreadsheet HW in 161, this assignment has you build methods
 * that do work on 2-dimensional arrays and produce calculations similar to what
 * you would find in Excel. 
 *
 * Don't rename these methods, or change their input or output values - use this
 * template to get you started.  You are free to add additional methods and data
 * as you see fit.
 * 
 * Edgar Perez
 * Version 0.2
 *
 */

public class Spreadsheet{

    //Declaring variables as static globals is usually bad design. Do *NOT* use this strategy in future assignments.
    public static double[][] spreadsheet;
    public static int size = 2;
    public static DecimalFormat spreadsheetFormat = new DecimalFormat("0.00");  //Provides data in hundredths.
    
    public static void main(String[] args) {
        //need some scanner data here  
        Scanner keyboard = new Scanner(System.in);  //Scanner for menu select.
        int input;
        initializeSpreadsheet();  //Intitializes size of array. 

        while(true) {
            printSpreadsheet();
            System.out.println("(1) Input (2) Row Sum (3) Col Sum (4) Row Ave (5) Col Ave (6) Sum (7) Average (8) Quit");
            input = keyboard.nextInt();
            //get the next operation from the user
            switch(input) { 
            case 1: 
                System.out.println("Enter X Y Value:");  
                int x = keyboard.nextInt();           //Scanner and function for cell input data.
                int y = keyboard.nextInt();
                double value = keyboard.nextDouble();
                inputData(x,y,value);
                break;
            case 2: 
                System.out.println("Enter Row:");     //Scanner and function for sum of row of cells.
                int a = keyboard.nextInt();
                double sR = sumRow(a);
                System.out.printf("Sum : %.2f\n", sR);
                break;
            case 3: 
                System.out.println("Enter Column:");  //Scanner and function for sum of column of cells.
                int b = keyboard.nextInt();
                double sC = sumCol(b);
                System.out.printf("Sum : %.2f\n", sC);
                break;
            case 4: 
                System.out.println("Enter Row:");     //Scanner and function for average of row of cells.
                int c = keyboard.nextInt();
                double aR = rowAve(c);
                System.out.printf("Average : %.2f\n", aR);
                break;
            case 5: 
                System.out.println("Enter Column:");  //Scanner and function for average of column of cells.
                int d = keyboard.nextInt();
                double aC = colAve(d);
                System.out.printf("Average : %.2f\n",  aC);
                break;
            case 6: 
                double sT = sumTotal();               //Scanner and function for sum of all cells.
                System.out.printf("Sum : %.2f\n", sT);    
                break;
            case 7: 
                double aT = aveTotal();               //Scanner and function for average of all cells.
                System.out.printf("Average : %.2f\n", aT);
                break;
            case 8:
                quit();                               //Quit screen.
                break;
            default:
                System.out.println("Unrecognized command. Please try again!");
            }
        }   
    }
   
    public static void initializeSpreadsheet(){
        spreadsheet = new double [size][size];  //Loads NxN array.
    }
    
    public static void printSpreadsheet() {
        ////String retVal = spreadsheetFormat.format(spreadsheetFormat[y][x]);
        //todo: use printf to format your spreadsheet string to only have 2 digits to the right of the mantissa
        //i.e. only have 2 digits representing the fractional part of the number
        //int y;
        //int x;
        //String retVal = spreadsheetFormat.format(spreadsheet[x][y]);
        //"Tis better to be vile than vile esteemed" - William Shakespeare
        /**
         * Void function which uses a nested loop and the DecimalFormat class to load cells and associated data.
         */
        System.out.println();
        for(int y = 0; y < spreadsheet.length; y++) {
            for(int x = 0; x < spreadsheet.length; x++) {
                String retVal = spreadsheetFormat.format(spreadsheet[x][y]);
                System.out.print("|" + retVal + "|");
            }
            System.out.println();
        }
    }
   
    public static void inputData(int x, int y, double value){
        spreadsheet[x][y] = value;  //Loads cell data.
    }   
    
    public static double sumTotal() {
        double sum = 0;
        //todo
        for(int y = 0; y < spreadsheet.length; y++) {
            sum = sum + sumRow(y);                  //Calculates sum of entire spreadsheet.
        }
        return sum; 
    }
    
    public static double sumRow(int targetRow) {
        double sum = 0;
        //todo
        for(int x = 0; x < spreadsheet.length; x++) {
            sum = sum + spreadsheet[x][targetRow];  //Calculates sum of given row.
        }
        return sum;
    }
    
    public static double sumCol(int targetCol) {
        double sum = 0;
        //todo
        for(int y = 0; y < spreadsheet.length; y++) {
            sum = sum + spreadsheet[targetCol][y];  //Calculates sum of given column.
        }
        return sum;
    }
    
    public static double rowAve(int targetRow) {
        int N = size;
        double Row = sumRow(targetRow);             //Calculates average of given row.
        double Avg = Row / N;
        return Avg;                             
    }
    
    public static double colAve(int targetCol) {
        int N = size;
        double Col = sumCol(targetCol);             //Calculates average of given column.
        double Avg = Col / N;
        return Avg;
    }
    
    public static double aveTotal() {
        int N = size*size;
        double Total = sumTotal();                  //Calculates average of entire spreadsheet.
        double Avg = Total / N;
        return Avg;
    }
    
    public static void quit() {
        System.out.println("Good Bye!");            //Presents quit screen.
        System.exit(0);
    }
    
}