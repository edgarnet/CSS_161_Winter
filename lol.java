
/**
 * Write a description of class lol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lol
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        System.out.println(minimum(76,5,3));
        System.out.println(maximum(45,7,82));
        System.out.println(mid(200020,34,5));
    }
    
    public static int minimum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        else if (b < a && b < c) {
            return b;
        }
        return c;
    }
    
    public static int maximum(int a, int b, int c) {
        if (a > b && a > b) {
            return a;
        }
        else if (b > a && b > c) {
            return b;
        }
        return c;
    }
    
    public static int mid(int a, int b, int c) {
        if( a > b && a < c || a < b && a > c) {
            return a;
        }
        if( b > a && b < c || b < a && b > c) {
            return b;
        }
        return c;
        
    }
}
