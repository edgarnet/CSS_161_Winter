
/**
 * Outputs data for previous SeaHawk games and their scores.
 * 
 * @author Edgar Perez 
 * @version 0.2
 */
public class SeaHawksTracker
{
    // instance variables - replace the example below with your own
    private int firstScore;
    private int secondScore;
    private int thirdScore;
    
    public static void main(String[] args) {
        SeaHawksTracker stats = new SeaHawksTracker();
        stats.setFirstScore(22);
        stats.setSecondScore(11);
        stats.setThirdScore(27);
        
        System.out.println("---------Min, Mid, & Max----------");
        System.out.println("The largest is:" + stats.max(3,5,1));
        System.out.println("The middle is:" + stats.mid(3,5,1));
        System.out.println("The smallest is:" + stats.min(3,5,1));
        
        System.out.println("\n---------Report of Scores--------");
        System.out.println(stats.toString());
    }

    public int getFirstScore() {
        return firstScore;  //Outputs current value for firstScore.
    }
    
    public void setFirstScore(int dx) {
        firstScore = dx;  //Sets firstScore to the parameters given.
    }
    
    public int getSecondScore() {
        return secondScore;  //Outputs current value for secondScore.
    }
    
    public void setSecondScore(int dx) {
        secondScore = dx;  //Sets secondScore to the parameters given.
    }
    
    public int getThirdScore() {
        return thirdScore;  //Outputs current value for thirdScore.
    }
    
    public void setThirdScore(int dx) {
        thirdScore = dx;  //Sets thirdScore to the parameters given.
    }
    
    public int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;  //Returns int a as minimum.
        }
        else if (b < a && b < c) {
            return b;  //Or Returns int b as minimum.
        }
        return c;  //For all else returns int c as minimum.
    }
    
    public int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;  //Returns int a as maximum.
        }
        else if (b > a && b > c) {
            return b;  //Or Returns int b as maximum
        }
        return c;  //For all else returns int c as maximum.
    }
    
    public int mid(int a, int b, int c) {
        if( a > b && a < c || a < b && a > c) {
            return a;  //Returns int a as medium.
        }
        if( b > a && b < c || b < a && b > c) {
            return b;  //Or returns int b as medium.
        }
        return c;  //For all else returns int c as medium.
    }
    
    public String toString() {
        String report = "The first score was:" + getFirstScore() + "\nThe second score was:" + getSecondScore() + "\nThe third score was:" + getThirdScore() + "\nThe least of the SeaHawks' scores was:" + min(getFirstScore(),getSecondScore(),getThirdScore()) + "\nThe middle of the SeaHawks' scores was:" + mid(getFirstScore(),getSecondScore(),getThirdScore()) + "\nThe greatest of the SeaHawks' score was:" + max(getFirstScore(),getSecondScore(),getThirdScore());
        return report;  //String that includes "get" and min/max/mid methods.
    }
}
