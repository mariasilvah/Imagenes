import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Turtle {

	private static int width = 800;
    private static int height = 800;

    private static int PIXEL_SIZE =30;
    private static Graphics2D g;
    
    static Color white 		= Color.white;
    static Color black 		= Color.black;
    static Color verdecara 	= new Color(175,188,82);
    static Color verdeosc 	= new Color(13,61,38);
    static Color carne		= new Color(234,180,70);
    static Color capar		= new Color(94,70,58);
    
    static BufferedImage imagesan = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

//--------------------------------------------------------------------------------------------------   
    private static void drawBackground(int size, Color c) {
    	g.setColor(c);
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
 	   g.setColor(c);
 	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
     }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
   	    g.setColor(c);
    	for(int i=a;i<=b;i++){
    		 putPixel(x, i, c);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
    	g.setColor(c);
        for(int i=a;i<=b;i++){
        	 putPixel(i, y, c);
        }
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
    	g.setColor(c);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) { 
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);
    	//      CAPARAZON
    	drawHorizontalLine(10, 15, 2, Color.black); //x1,x2,y
    	
    	drawVerticalLine(3,4,9, Color.black);//y1, y2, x
    	drawVerticalLine(3,4,16, Color.black);
    	drawHorizontalLine(8, 8, 3, Color.black); 
    	drawHorizontalLine(17, 17, 3, Color.black); 
    	drawHorizontalLine(7, 7, 4, Color.black); 
    	drawHorizontalLine(18, 18, 4, Color.black); 
    	drawHorizontalLine(6, 6, 5, Color.black); 
    	drawHorizontalLine(19, 19, 5, Color.black); 
    	drawHorizontalLine(5, 5, 6, Color.black); 
    	drawHorizontalLine(20, 20, 6, Color.black); 
    	drawHorizontalLine(4, 4, 7, Color.black); 
    	drawHorizontalLine(21, 21, 7, Color.black); 
    	drawVerticalLine(8,9,3, Color.black);//y1, y2, x
    	drawVerticalLine(8,9,22, Color.black);
    	drawVerticalLine(10,13,2, Color.black);
    	drawVerticalLine(10,13,23, Color.black);
    	
    	//drawHorizontalLine(2, 23, 13, Color.black); 
    	
        fillRect(3, 10, 20, 4, capar); //x1, y1, delta x, delta y
        fillRect(4, 8, 18, 2, capar); 
        fillRect(5, 7, 16, 1, capar); 
        fillRect(6, 6, 14, 1, capar); 
        fillRect(7, 5, 12, 1, capar);
        fillRect(10, 3, 6, 2, capar); 
        putPixel(8,4,capar); //x1, y1
        putPixel(17,4,capar);
        
        putPixel(10,5,Color.black);
        putPixel(15,5,Color.black);
        putPixel(5,8,Color.black);
        putPixel(20,8,Color.black);

    	//      CARA
        fillRect(8, 7, 10, 10, verdeosc); //x1, y1, delta x, delta y
    	drawVerticalLine(8,15,7, verdeosc); 
    	drawVerticalLine(8,15,18, verdeosc); 
    	drawVerticalLine(9,15,6, verdeosc); 
    	drawVerticalLine(9,15,19, verdeosc); 
    	drawVerticalLine(11,14,5, verdeosc); 
    	drawVerticalLine(11,14,20, verdeosc); 
        putPixel(4,13,verdeosc); //x1, y1
        putPixel(21,13,verdeosc); 
    	drawHorizontalLine(9, 16, 6, verdeosc); 
    	drawHorizontalLine(11, 14, 5, verdeosc); 

    	drawHorizontalLine(8, 17, 15, verdecara); 
        fillRect(6, 11, 14, 4, verdecara); 
        fillRect(7, 9, 12, 2, verdecara); 
    	drawHorizontalLine(8, 17, 8, verdecara); 
    	drawHorizontalLine(9, 16, 7, verdecara); 
    	drawHorizontalLine(11, 14, 6, verdecara); 
    	
    	fillRect(8, 11, 2, 2, Color.black);
        fillRect(16, 11, 2, 2, Color.black);
    	drawHorizontalLine(11, 14, 14, Color.black); 
       // putPixel(10,13,Color.black);
       // putPixel(15,13,Color.black); 
        putPixel(8,11,Color.white);
        putPixel(17,11,Color.white);
        
    	//      MANOS	Y PECHO	
    	fillRect(1, 17, 6, 3, verdeosc); //x1, y1, delta x, delta y
    	fillRect(19, 17, 6, 3, verdeosc); 
    	fillRect(10, 17, 6, 3, verdeosc); 
    	fillRect(2, 15, 6, 2, verdeosc); 
    	fillRect(18, 15, 6, 2, verdeosc); 
    	fillRect(2, 17, 4, 3, verdecara); 
    	fillRect(20, 17, 4, 3, verdecara); 
    	drawVerticalLine(16,18,6, verdecara);
    	drawVerticalLine(16,18,19, verdecara);
    	drawVerticalLine(16,17,7, verdecara);
    	drawVerticalLine(16,17,18, verdecara);
    	fillRect(3, 15, 3, 2, verdecara); 
    	fillRect(20, 15, 3, 2, verdecara); 
    	drawHorizontalLine(7, 9, 18, verdeosc); 
    	drawHorizontalLine(16, 18, 18, verdeosc); 
    	drawHorizontalLine(4, 5, 20, verdeosc); 
    	drawHorizontalLine(20, 21, 20, verdeosc); 
//
        putPixel(3,14,verdeosc); 
        putPixel(22,14,verdeosc); 
        putPixel(2,20,verdeosc); 
        putPixel(23,20,verdeosc);
        putPixel(3,21,verdeosc); 
        putPixel(22,21,verdeosc); 
        putPixel(8,17,verdeosc); 
        putPixel(17,17,verdeosc); 
        
        putPixel(3,20,verdecara); 
        putPixel(22,20,verdecara); 
        putPixel(4,14,verdecara); 
        putPixel(21,14,verdecara); 
        putPixel(9,17,carne);
        putPixel(16,17,carne); 
    	fillRect(10, 17, 6, 2, carne); 
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);
        
    	try {       
            ImageIO.write(imagesan, "jpg", new File("turtle_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        g = imagesan.createGraphics();        
        paint();
    }
}
