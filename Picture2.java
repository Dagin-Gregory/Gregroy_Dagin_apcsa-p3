import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray){
			  pixelObj.setGreen(0);
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void keepOnlyRed() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray){
			  pixelObj.setGreen(0);
			  pixelObj.setBlue(0);
		  }
	  }
  }
  
  public void keepOnlyGreen() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray){
			  pixelObj.setBlue(0);
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray){
			  pixelObj.setBlue(255-pixelObj.getBlue());
			  pixelObj.setRed(255-pixelObj.getRed());
			  pixelObj.setGreen(255-pixelObj.getGreen());
		  }
	  }
  }
  
  public void greyscale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray){
			  int avg = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())/3;
			  pixelObj.setBlue(avg);
			  pixelObj.setRed(avg);
			  pixelObj.setGreen(avg);
		  }
	  }
  }
  
  public void fixUnderWater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int sumRed = 0;
	  int sumBlue = 0;
	  int sumGreen = 0;
	  int pixelCount=pixels.length*pixels[0].length;
	  for (Pixel[] row: pixels)
	  {
		  for (Pixel pixelObj : row)
		  {
			  sumRed+=pixelObj.getRed();
			  sumBlue+=pixelObj.getBlue();
			  sumGreen+=pixelObj.getGreen();
		  }
	  }
	  int avgRed=sumRed/pixelCount;
	  int avgBlue=sumBlue/pixelCount;
	  int avgGreen=sumGreen/pixelCount;
	  double factor=3;
	  for (Pixel[] r: pixels)
	  {
		  for (Pixel pixel : r)
		  {
			  pixel.setGreen(pixel.getGreen()+(115-avgGreen));
			  pixel.setBlue(pixel.getBlue()+(128-avgBlue));
			  pixel.setRed(pixel.getRed()+(115-avgRed));
			  pixel.setRed((int)(pixel.getRed()-factor*(128-pixel.getRed())));
			  pixel.setGreen((int)(pixel.getGreen()-factor*(128-pixel.getGreen())));
			  pixel.setBlue((int)(pixel.getBlue()-factor*(128-pixel.getBlue())));
		  }
	  }
  }

  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        rightPixel = pixels[row][col];
        leftPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorLeftToRight()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        rightPixel = pixels[row][col];
        leftPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel uPixel = null;
    Pixel downPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        uPixel = pixels[row][col];
        downPixel = pixels[479-row][col];
        downPixel.setColor(uPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel uPixel = null;
    Pixel downPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        uPixel = pixels[row][col];
        downPixel = pixels[479-row][col];
        uPixel.setColor(downPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel rPixel = null;
    Pixel lPixel = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < 480; col++)
      {
        lPixel = pixels[row][col];
        rPixel = pixels[col][row];
        lPixel.setColor(rPixel.getColor());
      }
    } 
  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
      System.out.println(count);
    }
  }
  
  public void mirrorArms()
  {
    int mirrorPointROW = 190;
    Pixel uPixel = null;
    Pixel dPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    //first arm row
    for (int row = 160; row < 190; row++)
    {
      // first arm column
      for (int col = 102; col < 170; col++)
      {
    	uPixel = pixels[row][col];      
        dPixel = pixels[(mirrorPointROW - row) + mirrorPointROW][col];
        	if(uPixel.getBlue() <=100)
        		dPixel.setColor(uPixel.getColor());
      }
    }
    //second arm row
    for (int row = 171; row < 236; row++)
    {
      // second arm column
      for (int col = 240; col < 292; col++)
      {
        
        uPixel = pixels[row][col];      
        dPixel = pixels[(mirrorPointROW - row) + mirrorPointROW][col];
        	if(uPixel.getBlue() <=100)
        		dPixel.setColor(uPixel.getColor());
      }
    }
  }
  
  public void mirrorGull()
  {
    int mirrorPoint = 343;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 235; row < 316; row++)
    {
      for (int col = 238; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void myCopy(Picture fromPic, int startRow, int startCol, int endRow, int endCol, int beginImageRow, int beginImageCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = startRow, toRow = beginImageRow; 
         fromRow < endRow &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = startCol, toCol = beginImageCol;
    	   fromCol < endCol &&
    	   toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\flower1.jpg");
    Picture flower2 = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void myCollage()
  {
    Picture motorcycle = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\redmotorcycle.jpg");
    this.myCopy(motorcycle,90,90,250,250,0, 0);
    this.myCopy(motorcycle,190,190,350,350,160, 0);
    this.myCopy(motorcycle,300,300,460,460,320, 0);
    
    Picture blueCycle = new Picture(motorcycle);
    blueCycle.keepOnlyBlue();
    Picture leftToRightCycle = new Picture(motorcycle);
    leftToRightCycle.mirrorLeftToRight();
    Picture negateCycle = new Picture(motorcycle);
    negateCycle.negate();
    
    this.myCopy(blueCycle,90,90,250,250,0,480);
    this.myCopy(leftToRightCycle,190,190,350,350,160,480);
    this.myCopy(negateCycle,300,300,460,460,320,480);
    this.write("myCollage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\seagull.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this