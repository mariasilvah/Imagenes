import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Yeshua {

		private static int width = 800;
	    private static int height = 800;

	    private static int PIXEL_SIZE =30;
	    private static Graphics2D g;
	    
	    static Color white 		= Color.white;
	    static Color black 		= Color.black;
	    static Color cabello	= new Color(89,68,37,255);
	    static Color piel 	 	= new Color(255,195,161,255);
	    static Color baston 	= new Color(62,47,26,255);
	    static Color santo	 	= new Color(247,232,13);
	    static Color tunica	 	= new Color(243,11,10);

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
	    	
	    	//17x23
	    	drawBackground(PIXEL_SIZE, Color.white);
	    	
	    	fillRect(9, 4, 14, 11, Color.black); 
	        drawHorizontalLine(9, 11, 4, Color.white); 
	        drawHorizontalLine(20, 22, 4, Color.white); 
	    	drawVerticalLine(5,6,9, Color.white);
	    	drawVerticalLine(5,6,22, Color.white);
	        putPixel(10,5, Color.white);    	
	        putPixel(21,5, Color.white);    	

	    	fillRect(12, 5, 8, 9, cabello);
	    	fillRect(12, 13, 8, 7, Color.black); 
	    	fillRect(13, 19, 6, 6, Color.black); 
	    	drawVerticalLine(6,13,11, cabello);	
	    	drawVerticalLine(6,13,20, cabello);	
	    	drawVerticalLine(7,14,10, cabello);	
	    	drawVerticalLine(7,14,21, cabello);	

	    	fillRect(12, 7, 8, 3, piel);
	        drawHorizontalLine(16, 18, 6, piel); 
	    	drawVerticalLine(8,9,11, piel);
	    	drawVerticalLine(9,10,21, piel);
	    	//oreja izq!!!
	    	putPixel(14,6, piel);    			
	        putPixel(12,10, piel);
	        putPixel(19,10, piel);    	
	        drawHorizontalLine(14, 17, 11, piel); 

	    	fillRect(7, 15, 5, 3, Color.black);
	    	drawVerticalLine(15,19,20, piel);
	    	drawVerticalLine(15,19,21, Color.black);
	    	putPixel(20,20, Color.black);
	        drawHorizontalLine(7, 11, 16, piel); 
	    	fillRect(13, 14, 6, 6, Color.white); 
	    	fillRect(14, 20, 4, 3, Color.white); 
	        drawHorizontalLine(14, 17, 23, piel); 
	        
	    	drawVerticalLine(12,23,6, baston);
	    	putPixel(5,12, baston);
	    	drawVerticalLine(9,11,5, baston);
	        drawHorizontalLine(6, 7, 9, baston); 
	    	putPixel(7,10, baston);
	    	putPixel(6,16, Color.black);
	        drawHorizontalLine(15, 16, 14, piel); 
	        drawHorizontalLine(12, 13, 14, tunica); 
	        drawHorizontalLine(13, 14, 15, tunica);
	        drawHorizontalLine(14, 15, 16, tunica); 
	        drawHorizontalLine(15, 16, 17, tunica); 
	        drawHorizontalLine(16, 17, 18, tunica); 
	        drawHorizontalLine(17, 18, 19, tunica); 
	    	putPixel(13,8, Color.black);
	    	putPixel(18,8, Color.black);
	        drawHorizontalLine(14, 17, 10, Color.black); 
	        drawHorizontalLine(11, 20, 1, santo); 

	    	drawSquareGrid(PIXEL_SIZE, Color.black);

	    	try {       
	            ImageIO.write(imagesan, "jpg", new File("Yeshua_art.jpg"));
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
