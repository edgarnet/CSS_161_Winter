
/**
 * Configures the values for the x and y coordinates.
 * 
 * @author Edgar Perez
 * @version 0.2
 */
public class Point2D
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    public static void main(String[] args) {
        Point2D pt = new Point2D();
        
        pt.setX(5);
        pt.setY(2);
        
        System.out.println("The 2D point's x value is: " + pt.getX());
        System.out.println("The 2D point's y value is: " + pt.getY());
        
        System.out.println(pt.toString());
    }
    
    public int getX() {
        return x;  //Outputs current value of x.
    }
    
    public void setX(int dx) {
        x = dx;  //Sets x to the parameters given.
    }
    
    public int getY() {
        return y;  //Outputs current value of y.
    }
    
    public void setY(int dy) {
        y = dy;  //Sets y to the parameters given.
    }
    
    public String toString() {
        String represent = "Point 2D at (" + getX() + "," + getY() + ")";
        return represent;  //Outputs String for given variables.
    }
}
