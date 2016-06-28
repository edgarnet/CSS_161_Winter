
import java.io.FileInputStream; 
import java.util.Scanner;

import java.io.FileNotFoundException;

public class Diamonds
{
   public static int x, z, m, f, center, i,j,k,y,ai,bi, rows, size, ab;
   public static char zero, one;  //Declares global variables.
       public static void main(String args[]) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("config.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error: file 'config.txt' not found.");
            System.exit(0);
        }
        
        rows = fileIn.nextInt();  //Number of rows
        size = fileIn.nextInt();  //Size of shape
        zero = fileIn.next().charAt(0);  //First character
        one = fileIn.next().charAt(0);   //Second character
        	
		x = (size/2) + 2; //Aligns lowerDiamond towards the left.
		z = (size/2);  //Determines median value.
		m = (size/2);
		f = (size/2);
		center = x+z;  //Aligns upperDiamond in the center.
		
		megaLoop();  //All loops included.
   }
   
   public static void upperDiamond() {
        for (y = 1; y < x-1; y++) {
            
			for (ai = 1; ai < center; ai++) { 
				System.out.print(zero);  //Spaces approaching left.
			}
			
			for (i = 1; i < z; i++) {
				System.out.print(zero);  //Spaces approaching center left.
			}
 
			for (j = i-1; j <= m; j++) {
				System.out.print(one);  //Top half of diamond.
			}
			m++;
			for (k = j; k < size; k++) {
				System.out.print(zero); //Spaces approaching center right.
			}
			z--;
			for (ai = 1; ai < center; ai++) {
				System.out.print(zero); //Spaces approaching right.
			}
			System.out.print('\n');
		}
 
		for (int p = x-1; p > 1; p--) {
		    
			for (ai = 1; ai < center; ai++) {
				System.out.print(zero); //Spaces approaching left.
			}
			
			for (i = z+1; i > 1; i--) {
				System.out.print(zero); //Spaces approaching center left.
			}
 
			for (j = m-1; j >= i-1; j--) {
				System.out.print(one); //Lower half of diamond.
			}
			m = m-2;
			for (k = f; k < size/2; k++) {
				System.out.print(zero); //Spaces approaching center right.
			}
			z++;
			f--;
			for (ai = 1; ai < center; ai++) {
				System.out.print(zero); //Spaces approaching right.
			}
			System.out.print('\n');
        }
   }
   
   public static void lowerDiamond() {
        int w=size/2;
		int g=0;
		int b,e,h,t,u;
		for (int a=0; a<=size/2; a++) {
		    
			for (b=0; b<=w; b++) {
				System.out.print(zero); //Left Spaces.
			}
			
			for (t=0; t<size; t++) {
				System.out.print(one);  //Left lower diamond.
			}
			
			for (h=0; h<g*2; h++) {
				System.out.print(zero); //Center spaces.
			}
 
			for (u=0; u<size; u++) {
				System.out.print(one);  //Right lower diamond.
			}
			
			for (e=b; b>=1;b--){
				System.out.print(zero); //Right Spaces.
			}
			w--;
			g++;
			System.out.print('\n');
 
		} 
   }
    
   public static void megaLoop() {
        for (ab = 0; ab < rows; ab++) {
            upperDiamond();
        }
        
        for (ab = 0; ab < rows; ab++) {
            lowerDiamond();
        }
        
        //Attempt to develop a method for diamond rows.
   }
}
    