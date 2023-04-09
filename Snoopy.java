import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Snoopy {

	private static int width = 800;
    private static int height = 800;

    private static int PIXEL_SIZE =30;
    private static Graphics2D g;
    
    static Color white 		= Color.white;
    static Color black 		= Color.black;
    static Color rojo		= new Color(229,15,16);
  

    
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
    	
    	fillRect(5, 1, 17, 10, Color.black); 
    	fillRect(5, 1, 3, 2, Color.white); 
    	drawVerticalLine(3,5,5, Color.white);
        putPixel(6,3,Color.white);    	
        putPixel(8,1,Color.white);    	
        putPixel(6,6,Color.white);    	
    	fillRect(9, 2, 5, 3, Color.white); 
    	drawVerticalLine(3,5,8, Color.white);
        putPixel(7,4,Color.white);    	
    	drawVerticalLine(3,4,14, Color.white);
        putPixel(15,4,Color.white);    	
        putPixel(10,5,Color.white);    	
    	fillRect(11, 5, 3, 6, Color.white); 
    	fillRect(14, 7, 5, 3, Color.white); 
    	fillRect(15, 5, 4, 2, Color.white); 
    	drawVerticalLine(6,10,9, Color.white);
        drawHorizontalLine(14, 16, 10, Color.white); 
    	drawVerticalLine(6,8,19, Color.white);

        drawHorizontalLine(6, 7, 11, Color.black); 
        drawHorizontalLine(14, 16, 11, Color.black); 
        putPixel(9,11,Color.black);    	
        putPixel(11,11,Color.black);    	
        drawHorizontalLine(7, 8, 12, Color.black); 

    	fillRect(10, 13, 8, 12, Color.black); 
    	drawVerticalLine(10,12,10, Color.white);
    	fillRect(12, 13, 3, 5, Color.white); 
    	drawVerticalLine(16,17,11, Color.white);
    	drawVerticalLine(14,19,15, Color.white);
    	drawVerticalLine(16,18,16, Color.white);
    	fillRect(13, 18, 2, 3, Color.white); 
        drawHorizontalLine(10, 12, 20, Color.white); 
        drawHorizontalLine(12, 14, 22, Color.white); 
        drawHorizontalLine(11, 15, 23, Color.white); 

    	drawVerticalLine(13,15,10, Color.white);
        putPixel(10,18,Color.white);    	
        putPixel(10,20,Color.white); 
        putPixel(10,22,Color.white);    	
        putPixel(16,23,Color.white);    	
        putPixel(13,21,Color.white);    	
    	drawVerticalLine(21,22,17, Color.white);
        drawHorizontalLine(15, 16, 21, Color.white); 
        drawHorizontalLine(16, 17, 20, Color.white); 
        putPixel(17,19,Color.white);    	
    	drawVerticalLine(13,15,17, Color.white);
        putPixel(16,13,Color.white);    	
        putPixel(12,19,Color.white);    	
        putPixel(9,20,Color.black);    	
    	fillRect(16, 1, 6, 3, Color.white); 
    	fillRect(20, 4, 2, 2, Color.white); 
    	drawVerticalLine(8,10,21, Color.white);
    	drawVerticalLine(9,10,20, Color.white);
        putPixel(19,10,Color.white);    	
    	drawVerticalLine(1,2,15, Color.white);
        putPixel(14,1,Color.white);    	
    	drawVerticalLine(14,17,13, Color.black);
        putPixel(19,4,Color.white);    	

        drawHorizontalLine(12, 14, 12, rojo); 


    	
    	drawSquareGrid(PIXEL_SIZE, Color.black);
    
    	try {       
            ImageIO.write(imagesan, "jpg", new File("Snoopy_art.jpg"));
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
