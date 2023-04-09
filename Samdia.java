import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Samdia {
	private static int width = 800;
    private static int height = 800;

    private static int PIXEL_SIZE = 30;
    private static Graphics2D g;
    
    static Color white 		= Color.white;
    static Color black 		= Color.black;
    static Color rosalia 	= new Color(239,53,53);
    static Color verde 		= new Color(84,168,99);
    
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
    
//--------------------------------------------------------------------------------------------------   

    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);
    	
    	//              NEGRO
    	drawHorizontalLine(3, 23, 2, Color.black); //x1,x2,y
    	drawVerticalLine(3,7,3, Color.black);//y1, y2, x
    	drawVerticalLine(3,7,23, Color.black);
    	drawVerticalLine(8,10,4, Color.black);
    	drawVerticalLine(8,10,22, Color.black);
    	drawVerticalLine(11,13,5, Color.black);
    	drawVerticalLine(11,13,21, Color.black);
    	drawVerticalLine(14,15,6, Color.black);
    	drawVerticalLine(14,15,20, Color.black);
    	drawVerticalLine(16,17,7, Color.black);
    	drawVerticalLine(16,17,19, Color.black);
    	drawVerticalLine(18,19,8, Color.black);
    	drawVerticalLine(18,19,18, Color.black);
    	drawHorizontalLine(9, 17, 20, Color.black);
    	//
    	fillRect(4, 2, 20, 6, Color.black); // x1, y1, x2, y2
    	fillRect(4, 8, 19, 3, Color.black); 
    	fillRect(5, 11, 17, 3, Color.black); 
    	fillRect(6, 14, 15, 2, Color.black); 
    	fillRect(7, 16, 13, 2, Color.black); 
    	fillRect(8, 18, 11, 2, Color.black); 
    	//              VERDE
    	drawVerticalLine(3,7,4, verde);//y1, y2, x
    	drawVerticalLine(3,7,22, verde);
    	drawVerticalLine(8,10,5, verde);
    	drawVerticalLine(8,10,21, verde);
    	drawVerticalLine(11,13,6, verde);
    	drawVerticalLine(11,13,20, verde);
    	drawVerticalLine(14,15,7, verde);
    	drawVerticalLine(14,15,19, verde);
    	drawVerticalLine(16,17,8, verde);
    	drawVerticalLine(16,17,18, verde);
    	drawVerticalLine(16,17,9, verde);
    	drawVerticalLine(16,17,17, verde);
    	drawVerticalLine(18,19,9, verde);
    	drawVerticalLine(18,19,17, verde);
    	drawHorizontalLine(10, 16, 19, verde);
    	//              BLANCO
    	drawVerticalLine(3,7,5, Color.white);//y1, y2, x
    	drawVerticalLine(3,7,21, Color.white);
    	drawVerticalLine(8,10,6, Color.white);
    	drawVerticalLine(8,10,20, Color.white);
    	drawVerticalLine(11,13,7, Color.white);
    	drawVerticalLine(11,13,19, Color.white);
    	drawVerticalLine(14,15,8, Color.white);
    	drawVerticalLine(14,15,18, Color.white);
    	drawVerticalLine(16,17,9, Color.white);
    	drawVerticalLine(16,17,17, Color.white);
    	drawHorizontalLine(10, 16, 18, Color.white);
    	//              ROJO
    	fillRect(6, 3, 15, 5, rosalia); // x1, y1, x2, y2
    	fillRect(7, 7, 13, 4, rosalia); 
    	fillRect(8, 11, 11, 3, rosalia); 
    	fillRect(9, 14, 9, 2, rosalia); 
    	fillRect(10, 16, 7, 2, rosalia); 
    	//            SEMILLAS
    	drawHorizontalLine(7, 7, 6, Color.black); //x1,x2,y
    	drawHorizontalLine(12, 12, 4, Color.black); 
    	drawHorizontalLine(15, 15, 6, Color.black); 
    	drawHorizontalLine(19, 19, 5, Color.black); 
    	drawHorizontalLine(8, 8, 9, Color.black); 
    	drawHorizontalLine(11, 11, 7, Color.black); 
    	drawHorizontalLine(14, 14, 10, Color.black); 
    	drawHorizontalLine(17, 17, 9, Color.black); 
    	drawHorizontalLine(9, 9, 12, Color.black); 
    	drawHorizontalLine(11, 11, 10, Color.black); 
    	drawHorizontalLine(16, 16, 11, Color.black); 
    	drawHorizontalLine(10, 10, 14, Color.black); 
    	drawHorizontalLine(13, 13, 13, Color.black); 
    	drawHorizontalLine(16, 16, 14, Color.black); 
    	drawHorizontalLine(14, 14, 15, Color.black); 
    	drawHorizontalLine(12, 12, 16, Color.black); 


    	try {       
            ImageIO.write(imagesan, "jpg", new File("sandia_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

//--------------------------------------------------------------------------------------------------   

    public static void main(String[] args) {
        g = imagesan.createGraphics();        
        paint();
    }
}
