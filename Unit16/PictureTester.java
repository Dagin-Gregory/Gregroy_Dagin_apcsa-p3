/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
	Picture beach = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\beach.jpg");
	beach.explore();
	beach.keepOnlyBlue();
	beach.explore();  
  }
  
  public static void testKeepOnlyRed() {
		Picture beach = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\beach.jpg");
		beach.explore();
		beach.keepOnlyRed();
		beach.explore();  
	  }
  
  public static void testKeepOnlyGreen() {
		Picture beach = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\beach.jpg");
		beach.explore();
		beach.keepOnlyGreen();
		beach.explore();  
	  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\beach.jpg");
    beach.explore();
    beach.greyscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\water.jpg");
    beach.explore();
    beach.fixUnderWater();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  public static void testmirrorRightToLeft()
  {
    Picture caterpillar = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorRightToLeft();
    caterpillar.explore();
  }
  
  public static void testmirrorLeftToRight()
  {
    Picture caterpillar = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorLeftToRight();
    caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
    Picture canvas = new Picture("C:\\Users\\Dagin\\Desktop\\EclipseWS\\Unit16R\\src\\images\\640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  //testZeroBlue();
	  //testKeepOnlyBlue();
	  //testKeepOnlyRed();
	  //testKeepOnlyGreen();
	  //testNegate();
	  //testGrayscale();
	  testFixUnderwater();
	  //testMirrorVertical();
	  //testmirrorRightToLeft();
	  //testmirrorLeftToRight();
	  //testMirrorHorizontal();
	  //testMirrorHorizontalBotToTop();
	  //testMirrorDiagonal();
	  //testMirrorTemple();
	  //testMirrorArms();
	  //testMirrorGull();
	  //testCollage();
	  //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}