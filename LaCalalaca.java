import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class LaCalalaca {

	private static int width = 800;
    private static int height = 800;

    private static int PIXEL_SIZE =30;
    private static Graphics2D g;
    
    static Color white 		= Color.white;
    static Color black 		= Color.black;
    static Color morado 	= new Color(100,78,105);
    static Color lila 		= new Color(155,127,163);
    static Color rosa 		= new Color(227,173,189,255);
    static Color acqua 		= new Color(153,241,225,255);

    
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
    	//g.setColor(Color.black);
        //g.fillOval(85,0, 580, 800);//los segundos puntos, es el área limitadora para el elipse
    	
//      					CRANEO        
        drawHorizontalLine(10, 16, 0, Color.black); //x1,x2,y
        drawHorizontalLine(8, 10, 1, Color.black); 
        drawHorizontalLine(16, 18, 1, Color.black); 
        putPixel(7,2,Color.black); 
        putPixel(19,2,Color.black); 
        putPixel(6,3,Color.black); 
        putPixel(20,3,Color.black); 
        drawVerticalLine(4,5,5, Color.black);//y1, y2, x
        drawVerticalLine(4,5,21, Color.black);
        drawVerticalLine(6,10,4, Color.black);
        drawVerticalLine(6,10,22, Color.black);
        drawVerticalLine(11,13,5, Color.black);
        drawVerticalLine(11,13,21, Color.black);
        drawVerticalLine(14,16,4, Color.black);
        drawVerticalLine(14,16,22, Color.black);
        drawHorizontalLine(5, 6, 17, Color.black); 
        drawHorizontalLine(20, 21, 17, Color.black); 
        drawHorizontalLine(7, 9, 18, Color.black); 
        drawHorizontalLine(17, 19, 18, Color.black); 
        drawVerticalLine(19,22,7, Color.black);
        drawVerticalLine(19,22,19, Color.black);
        putPixel(8,23,Color.black); 
        putPixel(18,23,Color.black); 
        putPixel(9,24,Color.black); 
        putPixel(17,24,Color.black); 
        putPixel(10,25,Color.black); 
        putPixel(16,25,Color.black); 
        drawHorizontalLine(11, 15, 26, Color.black); 
        
//                        BOCA Y NARIZ Y OJOS  
        fillRect(9, 19, 9, 3, Color.black); //x1, y1, delta x, delta y
        drawHorizontalLine(10, 11, 22, Color.black); 
        drawHorizontalLine(15, 16, 22, Color.black); 
        drawHorizontalLine(12, 14, 23, Color.black); 
        putPixel(13,24,Color.black); 
        putPixel(10,20,Color.white); 
        putPixel(12,20,Color.white); 
        putPixel(14,20,Color.white); 
        putPixel(16,20,Color.white); 
        putPixel(13,22,Color.black); 
        

        fillRect(12, 15, 3, 3, Color.black); 
        drawVerticalLine(10,11,13, Color.black);
        putPixel(13,14,Color.black); 
        
        fillRect(7, 10, 5, 5, Color.black); 
        fillRect(15, 10, 5, 5, Color.black); 

//      					 ADORNOS
        drawHorizontalLine(8, 9, 2, acqua); 
        drawHorizontalLine(17, 18, 2, acqua); 
        drawHorizontalLine(9, 10, 3, acqua); 
        drawHorizontalLine(16, 17, 3, acqua); 
        drawVerticalLine(1,9,13, morado);
        fillRect(8, 5, 3, 3, morado); 
        fillRect(16, 5, 3, 3, morado); 
        fillRect(12, 7, 3, 3, morado); 
        drawVerticalLine(7,8,6, morado);
        drawVerticalLine(7,8,20, morado);
        drawVerticalLine(6,7,7, morado);
        drawVerticalLine(6,7,19, morado);
        drawVerticalLine(6,8,11, morado);
        drawVerticalLine(6,8,15, morado);
        drawHorizontalLine(12,14,25, morado); 
        drawHorizontalLine(10,11,24, morado); 
        drawHorizontalLine(15,16,24, morado); 
        putPixel(9,23,morado); 
        putPixel(17,23,morado); 
        fillRect(12, 2, 3, 3, morado); 

        drawHorizontalLine(5, 6, 15, acqua); 
        drawHorizontalLine(20, 21, 15, acqua); 
        drawHorizontalLine(6, 7, 16, acqua); 
        drawHorizontalLine(19, 20, 16, acqua); 
        drawHorizontalLine(7, 8, 17, acqua); 
        drawHorizontalLine(18, 19, 17, acqua); 
        drawHorizontalLine(9, 10, 16, acqua); 
        drawHorizontalLine(16, 17, 16, acqua); 
        drawVerticalLine(20,21,8, acqua);
        drawVerticalLine(20,21,18, acqua);

        drawVerticalLine(2,3,13, lila);
        drawVerticalLine(8,9,13, lila);
        putPixel(12,8,lila); 
        putPixel(14,8,lila); 
        putPixel(11,7,lila); 
        putPixel(15,7,lila); 
        drawHorizontalLine(8, 10, 6, lila); 
        drawHorizontalLine(16, 18, 6, lila); 
        putPixel(11,25,lila); 
        putPixel(15,25,lila); 

        putPixel(9,9,rosa); 
        putPixel(7,10,rosa); 
        putPixel(11,10,rosa); 
        putPixel(7,14,rosa); 
        putPixel(11,14,rosa); 
        putPixel(6,12,rosa); 
        putPixel(12,12,rosa); 
        putPixel(9,15,rosa); 
        
        putPixel(17,9,rosa); 
        putPixel(15,10,rosa); 
        putPixel(19,10,rosa); 
        putPixel(15,14,rosa); 
        putPixel(19,14,rosa); 
        putPixel(14,12,rosa); 
        putPixel(20,12,rosa); 
        putPixel(17,15,rosa); 
        
        putPixel(10,18,rosa); 
        putPixel(12,18,rosa); 
        putPixel(14,18,rosa); 
        putPixel(16,18,rosa); 

        drawVerticalLine(11,13,9, acqua);
        drawVerticalLine(11,13,17, acqua);
        drawHorizontalLine(8, 10, 12, acqua); 
        drawHorizontalLine(16, 18, 12, acqua); 
        putPixel(9,12,Color.white); 
        putPixel(17,12,Color.white); 
        putPixel(7,9,Color.black); 
        putPixel(19,9,Color.black); 


        drawSquareGrid(PIXEL_SIZE, Color.black);
            	
    	try {       
            ImageIO.write(imagesan, "jpg", new File("LaCalaca_art.jpg"));
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
