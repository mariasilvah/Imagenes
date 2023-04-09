import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Jazz {

	private static int width = 1000;
    private static int height = 1000;

    private static int PIXEL_SIZE =32;
    private static Graphics2D g;
    
    static Color black 		= Color.black;
    static Color verde	 	= new Color(78,112,79,255);
    static Color tromp 		= new Color(247,194,80);
    static Color sombratu 	= new Color(251,218,137,255);
    static Color sombratd 	= new Color(254,188,47,255);
    static Color sombratt 	= new Color(220,130,13,255);
    static Color sombra	 	= new Color(63,83,60,255);


    
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
    	//29x21
    	drawBackground(PIXEL_SIZE, verde);
    	
        drawVerticalLine(14,18,0, Color.black);
    	drawVerticalLine(14,18,1, tromp);
        drawVerticalLine(15,17,2, tromp);
        putPixel(1,13,Color.black); 
        putPixel(1,19,Color.black); 
        putPixel(2,14,Color.black); 
        putPixel(2,18,Color.black); 

    	drawHorizontalLine(3, 19, 15, Color.black); 
        drawHorizontalLine(3, 19, 16, tromp); 
        drawHorizontalLine(3, 19, 17, Color.black); 
        
        drawHorizontalLine(6, 17, 18, tromp); 
        drawHorizontalLine(6, 17, 23, tromp); 
        drawVerticalLine(19,22,5, tromp);
        drawVerticalLine(19,22,18, tromp);
        
        putPixel(5,18,Color.black); 
        putPixel(5,23,Color.black); 
        putPixel(18,18,Color.black); 
        putPixel(18,23,Color.black);
        drawVerticalLine(19,22,4, Color.black);
        drawVerticalLine(19,22,19, Color.black);

        putPixel(6,19,tromp); 
        putPixel(6,22,tromp); 
        putPixel(17,19,tromp); 
        putPixel(17,22,tromp); 
        drawHorizontalLine(7, 16, 19, Color.black); 
        drawHorizontalLine(7, 16, 22, Color.black); 
        drawVerticalLine(20,21,6, Color.black);
        drawVerticalLine(20,21,17, Color.black);
        drawHorizontalLine(6, 17, 24, Color.black); 

        putPixel(20,14,Color.black); 
        putPixel(20,18,Color.black); 
        putPixel(21,13,Color.black); 
        putPixel(21,19,Color.black); 
        putPixel(22,12,Color.black); 
        putPixel(22,20,Color.black); 
        putPixel(23,11,Color.black); 
        putPixel(23,21,Color.black); 
        putPixel(24,10,Color.black); 
        putPixel(24,22,Color.black); 
        putPixel(25,9,Color.black); 
        putPixel(25,23,Color.black); 
        drawVerticalLine(13,19,22, tromp);
        drawVerticalLine(14,18,21, tromp);
        drawVerticalLine(15,17,20, tromp);
        drawVerticalLine(10,22,25, tromp);
        drawVerticalLine(11,21,24, tromp);
        drawVerticalLine(12,20,23, tromp);
        drawVerticalLine(10,22,26, Color.black);
        
        fillRect(8, 11, 9, 4, Color.black); 
        drawHorizontalLine(8, 10, 12, tromp); 
        drawHorizontalLine(11, 13, 13, tromp); 
        drawHorizontalLine(14, 16, 12, tromp); 
        drawVerticalLine(13,14,9, tromp);
        drawVerticalLine(13,14,15, tromp);
        putPixel(12,14,tromp); 
        drawHorizontalLine(11, 13, 11, verde); 

        fillRect(27, 7, 2, 2, Color.black); 
        drawVerticalLine(4,7,28, Color.black);
        drawVerticalLine(4,5,29, Color.black);
        drawVerticalLine(5,6,30, Color.black);


        drawSquareGrid(PIXEL_SIZE, Color.black);

        
        try {       
            ImageIO.write(imagesan, "jpg", new File("Jazz_art.jpg"));
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
