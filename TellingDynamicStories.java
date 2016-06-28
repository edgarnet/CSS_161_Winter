// Edgar Perez

import java.util.Scanner;

public class TellingDynamicStories
    {
        public static void main(String[] args)
            {
             tellDynamicStory();   
            }
       
        public static void tellDynamicStory() 
            {
             Scanner keyboard = new Scanner(System.in);
             
             System.out.println("Please enter the Title of the Story:");
             String title = keyboard.nextLine();
             System.out.println("Please enter the Content of the Story:");
             String content = keyboard.nextLine();
             System.out.println("Please enter the Remainder of the Story:");
             String remainder = keyboard.nextLine();
             
             System.out.println();
             
             System.out.println(title);
             intro();
             System.out.println(content);
             middle();
             System.out.println(remainder);
             outro();
            }
        
        public static void intro() {
            System.out.println("A long time ago,");
            System.out.println("In a galaxy far, far away...");
           }
        
        public static void middle() {
            System.out.println("There was much strife and unrest.");
           }
        
        public static void outro() {
            System.out.println("<camera pans downward past stars as the string section enters>");
           }
    }