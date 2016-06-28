// Edgar Perez

public class TellingStories
    {
      public static void main(String[] args) {
           tellStoryOne();
           System.out.println();
           tellStoryTwo();
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
        
        public static void tellStoryOne() {
            System.out.println("Episode 2 : Attack of the Clones");
            intro();
            System.out.println("The Galactic Republic has gone under attack by Jar Jar Binks' horrible CGI.");
            middle();
            System.out.println("The Supreme Chancellor has secretly ordered two Jedi Knights to remove Jar Jar from the Star Wars Canon.");
            outro();
        }
        
        public static void tellStoryTwo() {
            System.out.println("Episode 8 : Attack of the Clones Part II");
            intro();
            System.out.println("A descendant of the evil Jar Jar Binks is working with Kylo Ren to rebuild the Empire along with another Death Star.");
            middle();
            System.out.println("Can the Resistance prevent Darth Binks and Darth Ren from overthrowing the Galaxy?");
            outro();
        }
    }