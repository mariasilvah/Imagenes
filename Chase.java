import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Chase {

	private static int width = 800;
    private static int height = 800;

    private static int PIXEL_SIZE =30;
    private static Graphics2D g;
    
    static Color white 		= Color.white;
    static Color black 		= Color.black;
    static Color gris		= new Color(96,96,102);
    static Color carne		= new Color(230,184,139);
    static Color romsa		= new Color(223,91,128);
    static Color camfe		= new Color(100,70,60,255);
    static Color amzul		= new Color(64,105,152,255);
    static Color amamrillo	= new Color(255,191,47,255);
    static Color namramja	= new Color(255,125,65,255);

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
    	
    
        fillRect(7, 1, 13, 6, amzul); //x1, y1, delta x, delta y
        drawVerticalLine(5,6,6, amzul);
        drawVerticalLine(5,6,20, amzul);
        drawHorizontalLine(7, 8, 7, amzul); 
        drawHorizontalLine(18, 19, 7, amzul); 
        
        drawVerticalLine(1,9,3, camfe);
        drawVerticalLine(1,9,23, camfe);
        drawVerticalLine(2,3,4, camfe);
        drawVerticalLine(2,3,22, camfe);
        drawVerticalLine(3,4,5, camfe);
        drawVerticalLine(3,4,21, camfe);
        putPixel(6,4,camfe); 
        putPixel(20,4,camfe); 
        drawVerticalLine(10,11,4, camfe);
        drawVerticalLine(10,11,22, camfe);
        drawVerticalLine(11,14,5, camfe);
        drawVerticalLine(11,14,21, camfe);
        drawVerticalLine(11,16,6, camfe);
        drawVerticalLine(11,16,20, camfe);
        
        fillRect(7, 11, 13, 6, carne); 
        fillRect(5, 17, 17, 3, carne); 
        drawHorizontalLine(6, 20, 20, carne); 
        drawHorizontalLine(8, 18, 21, carne); 
        drawHorizontalLine(10, 16, 22, carne); 
        drawHorizontalLine(12, 14, 23, carne); 
        putPixel(11,10,carne); 
        putPixel(15,10,carne); 

        drawVerticalLine(4,9,4, romsa);
        drawVerticalLine(4,9,22, romsa);
        drawVerticalLine(5,10,5, romsa);
        drawVerticalLine(5,10,21, romsa);
        drawVerticalLine(7,8,6, romsa);
        drawVerticalLine(7,8,20, romsa);

        drawHorizontalLine(10, 16, 8, gris); 
        drawHorizontalLine(6, 20, 9, gris); 
        drawHorizontalLine(6, 8, 10, gris); 
        drawHorizontalLine(18, 20, 10, gris); 
        fillRect(11, 16, 5, 2, gris); 
        drawHorizontalLine(12, 14, 18, gris); 
        drawHorizontalLine(10, 16, 20, gris); 
        putPixel(9,19,gris); 
        putPixel(17,19,gris); 
        fillRect(12, 2, 3, 4, gris); 
        drawVerticalLine(3,4,11, gris);
        drawVerticalLine(3,4,15, gris); 
        putPixel(13,6,gris); 

        drawHorizontalLine(9, 17, 7, amamrillo); 
        drawHorizontalLine(7, 9, 8, amamrillo); 
        drawHorizontalLine(17, 19, 8, amamrillo); 
        
        drawHorizontalLine(9, 10, 10, camfe); 
        fillRect(12, 10, 3, 3, camfe); 
        drawHorizontalLine(16, 17, 10, camfe); 
        putPixel(8,11,camfe); 
        putPixel(18,11,camfe); 
        drawVerticalLine(13,15,13, camfe);
        
        fillRect(8, 13, 4, 3, namramja); 
        fillRect(15, 13, 4, 3, namramja); 
        drawHorizontalLine(9, 10, 16, namramja); 
        drawHorizontalLine(16, 17, 16, namramja); 
        drawHorizontalLine(9, 10, 12, Color.white); 
        drawHorizontalLine(16, 17, 12, Color.white); 
        drawVerticalLine(14,15,7, Color.white);
        drawVerticalLine(14,15,19, Color.white);
        drawVerticalLine(14,15,9, Color.white);
        drawVerticalLine(14,15,17, Color.white);
        putPixel(8,13,Color.white); 
        putPixel(11,13,Color.white); 
        putPixel(8,16,Color.white); 
        putPixel(9,14,Color.white); 
        putPixel(15,13,Color.white); 
        putPixel(18,13,Color.white); 
        putPixel(18,16,Color.white); 
        putPixel(16,14,Color.white);
        drawVerticalLine(14,15,10, Color.black);
        drawVerticalLine(14,15,17, Color.black);
        putPixel(16,15,Color.black);
        putPixel(9,15,Color.black);
        drawVerticalLine(3,5,13, Color.white);
        drawHorizontalLine(12, 14, 4, Color.white); 
        
    	drawSquareGrid(PIXEL_SIZE, Color.black);

    	try {       
            ImageIO.write(imagesan, "jpg", new File("Chase_art.jpg"));
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
