
/**
 * This manages a value in one dimension.
 * 
 * @author Edgar Perez
 * @version 0.01
 */
public class Point1DEx
{
    // instance variables - replace the example below with your own
    private int x;
    private String name;
    
    /*public void setName (String n) {
        
    }
    
    public String getName() {
        
    }*/

    public void setX(int nx) {
        x = nx;
    }
    
    public int getX() {
        return x;
    }
    
    public String toString() {
        return "Point1D at (" + x + ")";
    }
    
    public boolean equals (Object o) {
        Point1DEx that = (Point1DEx) o;
        //this vs that
        return this.x == that.x;
    }
    
    public static void main(String[] args){
        Point1DEx pizza = new Point1DEx();
        pizza.setX(1);
        System.out.println(pizza.toString());
        
        Point1DEx library = new Point1DEx();
        library.setX(5);
        System.out.println(library);
        System.out.println(library.toString());
    }
}
