import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Wood {

	private static int width = 1000;
    private static int height = 1000;

    private static int PIXEL_SIZE =32;
    private static Graphics2D g;
    
    static Color black 		= Color.black;
    static Color azul		= new Color(5,7,152);
    static Color amarillo 	= new Color(247,203,18);
  
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
    	drawBackground(PIXEL_SIZE, azul);
    	//6,3
    	drawVerticalLine(3,6,8, Color.black);
        putPixel(9,7,Color.black);
        putPixel(10,8,Color.black);
        putPixel(11,9,Color.black);
        putPixel(10,10,Color.black);
        drawHorizontalLine(7, 9, 11, Color.black); 
    	drawVerticalLine(12,14,6, Color.black);
        drawHorizontalLine(7, 8, 17, Color.black); 
        putPixel(9,16,Color.black);
        putPixel(10,15,Color.black);
    	drawVerticalLine(13,14,11, Color.black);
        drawHorizontalLine(12, 15, 18, Color.black); 
    	drawVerticalLine(19,21,16, Color.black);
    	drawVerticalLine(21,22,15, Color.black);
        drawHorizontalLine(14, 16, 23, Color.black); 
        //fillRect(9, 22, 5, 4, Color.black); //x1, y1, delta x, delta y
        drawHorizontalLine(14, 17, 24, Color.black); 
    	drawVerticalLine(25,26,17, Color.black);
        drawHorizontalLine(15, 16, 27, Color.black); 
        putPixel(14,28,Color.black);
        drawHorizontalLine(13, 20, 29, Color.black); 
    	drawVerticalLine(27,28,21, Color.black);
        putPixel(22,28,Color.black);
        putPixel(22,28,Color.black);
        putPixel(23,27,Color.black);
    	drawVerticalLine(25,26,24, Color.black);
        drawHorizontalLine(21, 23, 25, Color.black); 
    	drawVerticalLine(24,25,20, Color.black);
        putPixel(21,23,Color.black);
    	drawVerticalLine(21,22,22, Color.black);
        putPixel(21,20,Color.black);
    	drawHorizontalLine(19,20,19, Color.black);
    	drawVerticalLine(16,18,19, Color.black);
        putPixel(20,16,Color.black);
    	drawHorizontalLine(21,22,15, Color.black);
    	drawHorizontalLine(22,23,14, Color.black);
        putPixel(23,13,Color.black);
        //putPixel(24,12,Color.black);
    	drawHorizontalLine(24,25,12, Color.black);
    	drawVerticalLine(10,11,25, Color.black);
    	drawVerticalLine(9,10,24, Color.black);
    	drawVerticalLine(8,9,23, Color.black);
    	drawHorizontalLine(21,22,8, Color.black);
    	drawHorizontalLine(18,20,7, Color.black);
        putPixel(18,6,Color.black);
    	drawHorizontalLine(16,17,5, Color.black);
        putPixel(16,4,Color.black);
        putPixel(15,3,Color.black);
        putPixel(16,2,Color.black);
        putPixel(17,1,Color.black);
        putPixel(18,0,Color.black);
    	drawVerticalLine(1,4,12, Color.black);
    	
    	fillRect(12, 9, 11, 5, amarillo); 
    	drawVerticalLine(10,12,23, amarillo);
        putPixel(24,11,amarillo);
        drawHorizontalLine(18, 20, 8, amarillo); 
        drawHorizontalLine(16, 17, 6, amarillo); 
        putPixel(15,4,amarillo);    	
    	fillRect(11, 7, 7, 2, amarillo); 
        putPixel(10,7,amarillo);    	

    	fillRect(9, 5, 7, 2, amarillo); 
    	fillRect(9, 3, 3, 2, amarillo); 
    	fillRect(13, 3, 2, 2, amarillo); 
    	fillRect(7, 12, 3, 4, amarillo); 
    	fillRect(11, 15, 8, 3, amarillo); 
        putPixel(10,16,amarillo);    	
    	drawVerticalLine(11,14,10, amarillo);
    	drawVerticalLine(10,12,11, amarillo);
        drawHorizontalLine(7, 8, 16, amarillo); 
        drawHorizontalLine(12, 21, 14, amarillo); 
        drawHorizontalLine(19, 20, 15, amarillo); 
        
        putPixel(16,18,amarillo);    	
    	fillRect(17, 18, 2, 6, amarillo); 
    	fillRect(19, 20, 2, 4, amarillo); 
    	fillRect(18, 24, 2, 5, amarillo); 
        putPixel(16,22,amarillo);    	
    	drawVerticalLine(21,22,21, amarillo);
    	drawVerticalLine(26,28,20, amarillo);
        drawHorizontalLine(21, 23, 26, amarillo); 
        putPixel(22,27,amarillo);    	
        drawHorizontalLine(15, 17, 28, amarillo); 
        putPixel(17,27,amarillo);    	

        drawHorizontalLine(15, 17, 28, amarillo); 

        putPixel(17,1,azul);    	
        putPixel(18,0,azul);    	
        putPixel(8,2,Color.black);    	
        putPixel(11,2,amarillo);    	
        putPixel(13,2,amarillo);    	
        putPixel(13,0,Color.black);    	
        putPixel(13,1,amarillo);    	
        drawHorizontalLine(14, 15, 2, amarillo); 
        putPixel(8,2,azul);    	
        putPixel(9,3,azul);  
        
        putPixel(16,12,Color.black);      	
        drawVerticalLine(11,13,17, Color.black);
  	
    	drawSquareGrid(PIXEL_SIZE, Color.black);
    	
    	try {       
            ImageIO.write(imagesan, "jpg", new File("Wood_art.jpg"));
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
