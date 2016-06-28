
/**
 * Configures the value for the x coordinate.
 * 
 * @author Edgar Perez
 * @version 0.2
 */
public class Point1D
{
    // instance variables - replace the example below with your own
    private int x;
    
    public static void main(String[] args) {
        Point1D pt = new Point1D();
        
        pt.setX(10);
        
        System.out.println("The point's x value is: " + pt.getX());
    }

    public void setX(int nx) {
        x = nx;  //Sets x to the parameters given.
    }
    
    public int getX() {
        return x;  //Outputs current value of x.
    }
}
