
package truck;

/**
 *
 * @author Ethan Akers Period 2 
 * 21008
 */

import java.util.Scanner;
public class TruckArea {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double surfaceArea = 0;
        System.out.println("Type 0 and press enter to receive your prompt");
        surfaceArea += triangle(scn.nextInt(), scn.nextInt());
        surfaceArea += triangle(scn.nextInt(), scn.nextInt());
        surfaceArea += parallelogram(scn.nextInt(), scn.nextInt());
        surfaceArea += circle(scn.nextInt());
        surfaceArea += circle(scn.nextInt());
        surfaceArea += circle(scn.nextInt());
        surfaceArea += square(scn.nextInt(), scn.nextInt());
        surfaceArea -= emptySquare(scn.nextInt(), scn.nextInt());
        //TODO: change values of each surfaceArea to the scanner DONE
      
              
       
    
        System.out.println("\nThe total area of Michael’s truck is : " + Math.floor(surfaceArea));
        //final static void main 
    }
    public static int triangle(int base, int height){
        System.out.println("Input the values of the triangle");
        int triArea = (1/2) * (base * height);
        
        return triArea;
    }
    public static int parallelogram(int base, int height){
         System.out.println("Input the values of the parallelogram");
        int paraArea = (base * height);
     
        return paraArea;
    }
    public static double circle(int radius){
         System.out.println("Input the values of the circle");
        double circArea = Math.pow(radius, 2) * (Math.PI);
        return circArea;
    }
    public static int square(int base, int height){
         System.out.println("Input the values of the Square");
        int squareArea = (base * height);
        
        
        return squareArea;
    }
    public static int emptySquare(int base, int height){
         System.out.println("Input the values of the empty square");
        int emptySquareArea = (base * height);
        
        return emptySquareArea;
        
    }
    
}
