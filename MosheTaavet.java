import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class MosheTaavet {

	private static int width = 800;
    private static int height = 800;

    private static int PIXEL_SIZE =30;
    private static Graphics2D g;
    
    static Color white 		= Color.white;
    static Color black 		= Color.black;
    static Color cabello	= new Color(156,89,28);
    static Color piel		= new Color(254,197,120,255);
    static Color orejas		= new Color(250,167,99,255);
    static Color sombra		= new Color(45,45,47,255);
    static Color ojos		= new Color(118,73,25);


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
    	
    	//sombrero 17x6
    	fillRect(9, 0, 8, 5, Color.black); 
    	drawVerticalLine(1,4,8, Color.black);
    	drawVerticalLine(1,4,17, Color.black);
    	drawVerticalLine(2,4,7, Color.black);
    	drawVerticalLine(2,4,18, Color.black);
        drawHorizontalLine(5, 20, 5, Color.black); 
    	fillRect(9, 1, 8, 4, sombra); 
    	drawVerticalLine(2,4,8, sombra);
    	drawVerticalLine(2,4,17, sombra);
        
    	fillRect(8, 6, 10, 7, piel); 
    	putPixel(8,21,piel);    	
    	putPixel(17,21,piel);   
    	fillRect(9, 8, 2, 2, ojos); 
    	fillRect(15, 8, 2, 2, ojos); 
    	putPixel(9,8, Color.white);    	
    	putPixel(15,8, Color.white);    	

        drawHorizontalLine(8, 17, 13, cabello); 
        drawHorizontalLine(9, 16, 14, cabello); 
    	fillRect(9, 15, 8, 7, Color.black); 
        drawHorizontalLine(10, 15, 15, cabello); 
        drawHorizontalLine(11, 14, 16, cabello); 
    	fillRect(10, 22, 6, 5, Color.black); 
        putPixel(8,15,Color.black);    	
        putPixel(17,15,Color.black);    	
    	drawVerticalLine(16,20,7, Color.black);
    	drawVerticalLine(16,20,18, Color.black);
    	drawVerticalLine(16,19,8, sombra);
    	drawVerticalLine(16,19,17, sombra);
    	putPixel(8,20,Color.black);    	
        putPixel(17,20,Color.black);  
    	drawVerticalLine(22,25,11, sombra);
    	drawVerticalLine(22,25,14, sombra);

    	drawVerticalLine(6,13,6, cabello);
    	drawVerticalLine(6,13,19, cabello);
        drawHorizontalLine(7, 8, 6, cabello); 
    	putPixel(18,6,cabello);    	
    	drawVerticalLine(11,12,7, cabello);
    	drawVerticalLine(11,12,18, cabello);
    	drawVerticalLine(7,10,7, orejas);
    	drawVerticalLine(7,10,18, orejas);
        drawHorizontalLine(11, 14, 11, cabello); 
    	putPixel(10,12,cabello);    	
    	putPixel(15,12,cabello);    	

    	drawSquareGrid(PIXEL_SIZE, Color.black);

    	try {       
            ImageIO.write(imagesan, "jpg", new File("MosheTaavet_art.jpg"));
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
