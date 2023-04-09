import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelArt {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 800;
    private static int height = 800;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 		= Color.white;
    static Color blue  		= Color.blue;
    static Color red   		= Color.red;
    static Color darkBlue 	= new Color(5,56,100);
    static Color softBlue 	= new Color(113,168,221);
    static Color darkOrange = new Color(212,60,54);
    static Color softOrange = new Color(252,109,3);
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    // Definimos la matriz de colores    
    private final static Color[][] PIXELS = {
        {white, white, 	white, 	white, 	white},
        {white, blue, 	blue, 	blue, 	white},
        {white, blue,	red,	blue, 	white},
        {white, blue, 	blue, 	blue, 	white},
        {white, white, 	white, 	white, 	white}
    };
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);     
        drawHorizontalLine(6, 10, 1, Color.black); //empieza en 6x-10x y en y1
        /*drawHorizontalLine(5, 12, 2, Color.black); //
        drawHorizontalLine(4, 13, 3, Color.black);
        drawHorizontalLine(4, 14, 4, Color.black);
        drawHorizontalLine(4, 15, 5, Color.black);
        drawHorizontalLine(3, 15, 6, Color.black);
        drawHorizontalLine(2, 15, 7, Color.black);
        drawHorizontalLine(1, 14, 8, Color.black);*/
        fillRect(1, 9, 13, 6, Color.black); //x1, y1, x2, y2
        /*drawHorizontalLine(2, 7, 15, Color.black);
        fillRect(10, 15, 4, 2, Color.black);
        drawHorizontalLine(4, 7, 16, Color.black);
        drawHorizontalLine(5, 6, 17, Color.black);
        drawHorizontalLine(11, 12, 17, Color.black); //se llena todo el area del dibujo negra por practicidad, se puede dividir el dibujo en partes e iluminar de figura en figura
        drawHorizontalLine(6, 10, 2, softOrange); */
        drawVerticalLine(3,16,5,darkOrange); //
        /*drawVerticalLine(9,14,3,darkOrange);
        drawVerticalLine(8,13,2,softOrange);
        drawVerticalLine(7,8,3,softOrange);
        drawHorizontalLine(6, 8, 3, softOrange);
        drawHorizontalLine(6, 7, 4, softOrange);
        drawVerticalLine(5,11,6,softOrange);
        drawVerticalLine(12,16,6,darkOrange);
        drawVerticalLine(5,7,8,darkBlue);
        drawHorizontalLine(9,13,8,darkBlue);
        putPixel(9,7,darkBlue);
        fillRect(9, 4, 2, 3, softBlue);
        fillRect(10, 5, 5, 3, softBlue);
        fillRect(11, 4, 3, 2, Color.white);
        fillRect(7, 9, 2, 4, softOrange);
        fillRect(11, 11, 2, 6, darkOrange);
        fillRect(9, 10, 3, 2, softOrange);
        putPixel(12,10,softOrange);
        drawHorizontalLine(9,10,12,softOrange);
        drawHorizontalLine(7,10,13,darkOrange);*/
        putPixel(7,14,darkOrange);
        putPixel(10,14,darkOrange);
        putPixel(7,8,softOrange); //x1, y1
        drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
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
    private static void drawBackground(int size, Color c) {
    	g.setColor(c);
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }    
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}