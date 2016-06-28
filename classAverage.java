import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class classAverage {
    
    public static void main (String[] args) throws IOException {
        //authors: Fukuda, Zander, (edited by Nash)
        // number of the course

            UltraLoopWhile();  //Method with loop and while statement.
        
        // ... any stuff you need to do one time

        // Per class, print a table of ID numbers, grades, weighted average
        // per student, and a Pass or Fail programs grade.  
        // The class average is also printed.
    }
        
    public static void UltraLoopWhile() throws IOException{
        Scanner inputFile = new Scanner(new File("courseData.txt"));  //File with class data.
        
            double programsWeight = inputFile.nextDouble();  //Program grade weight.
            double midtermsWeight = inputFile.nextDouble();  //Midterm grade weight
            double finalsWeight = inputFile.nextDouble();    //Final grade weight
        
            int courseNumber;  //Course number for each class.
            int studentNumber; //Student ID number.
            int programsGrade; //Program grades.
            int midtermsGrade; //Midterm grades.
            int finalsGrade;   //Final grades.
            
        for (int i = 0; i < 3; i++) {
            // Read class number, print class number title, headings.
            courseNumber = inputFile.nextInt();  //Input for course number.
            
                System.out.println("Grade Data For Class " + courseNumber);  //Title
                System.out.println(" ID   Programs  Midterm  Final  Weighted Average  Programs Grade");  //Headings.
                System.out.println(" --   --------  -------  -----  ----------------  --------------");  //Lines under Headings.
                
            int studentCount = 0;  //Variable used to track number of students in a class.
            double average = 0.0;  //Variable used to calculate class average.
            // initialization

            // Loop to handle one class.
            //For each student in the class, get and print their information, 
            // compute their avg, and sum the avgs
            
                while (courseNumber != 0) {  //Proceeds with values excluding '0'.                   
                    studentNumber = inputFile.nextInt();
                    if (studentNumber == 0)  //Outputs loop when '0' is reached.
                        break;
                    programsGrade = inputFile.nextInt();//Input for student's grades.
                    midtermsGrade = inputFile.nextInt();//Input for student's midterm grades.
                    finalsGrade = inputFile.nextInt();  //Input for student's finals grade.
                    studentCount++;  //Collects the amount of students in a class.
                    
                    double weightedAverage;  //Calculates the weighted average of student's grade.
                    weightedAverage = (programsWeight*programsGrade)+(midtermsWeight*midtermsGrade)+(finalsWeight*finalsGrade);
                    
                    average += weightedAverage;  //Adds weightedAverage to average variable.
                    
                    System.out.printf("%d     %d       %d       %d        %.2f             ",studentNumber,programsGrade,midtermsGrade,finalsGrade,weightedAverage);
                    if (programsGrade >= 70) {  //Determines if student pass or fails the class.
                        System.out.println("PASS");
                    }
                    else {
                        System.out.println("FAIL");
                    }
                    
                }
            
            double classAverage = average / studentCount;  //Calculation for class average.
                System.out.printf("Class average is: %.2f", classAverage);  //Heading for class average.
                System.out.println("\n\n");  //Space for aesthetics.
            
            // compute and print class average
            //... code goes here
        }
        
    }
    
}