import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class BlueDemon {

	private static int width = 800;
    private static int height = 800;

    private static int PIXEL_SIZE =30;
    private static Graphics2D g;
    
    static Color white 		= Color.white;
    static Color black 		= Color.black;
    static Color bluedemon 	= new Color(51,68,145);
    static Color contorno 	= new Color(227,227,227);
    
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
    	
        fillRect(7, 5, 13, 16, bluedemon); //x1, y1, delta x, delta y
        drawHorizontalLine(7, 9, 5, contorno); //x1,x2,y
    	drawHorizontalLine(17, 19, 5, contorno); 
    	drawHorizontalLine(7, 9, 20, contorno); //x1,x2,y
    	drawHorizontalLine(17, 19, 20, contorno); 
    	
    	drawVerticalLine(6,7,7, contorno);//y1, y2, x
    	drawVerticalLine(6,7,19, contorno);
    	drawVerticalLine(18,20,7, contorno);
    	drawVerticalLine(18,20,19, contorno);
        fillRect(8, 10, 5, 4, contorno); 
        fillRect(14, 10, 5, 4, contorno);
        putPixel(9,9,contorno); 
        putPixel(17,9,contorno); 
        drawVerticalLine(8,9,8, contorno);//y1, y2, x
        drawVerticalLine(8,9,18, contorno);

        fillRect(11, 12, 5, 4, contorno); 
        fillRect(12, 14, 3, 2, Color.black); 

        fillRect(10, 16, 7, 3, contorno); 
    	drawHorizontalLine(11, 15, 17, Color.black); 
        putPixel(13,13,Color.black); 
        fillRect(9, 11, 3, 2, Color.black); 
        fillRect(15, 11, 3, 2, Color.black); 

        //g.setColor(Color.white);
        //g.fillOval(12, 15, 3, 2);//los segundos puntos, es el área limitadora para el elipse
        
        drawSquareGrid(PIXEL_SIZE, Color.black);

    	try {       
            ImageIO.write(imagesan, "jpg", new File("bluedemon_art.jpg"));
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
