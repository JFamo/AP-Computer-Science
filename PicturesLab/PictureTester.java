



/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */

import java.awt.Color;

public class PictureTester
{
  /** Method to test zeroBlue */
    /** Method to set the blue to 0 */
  public static void zeroBlue(DigitalPicture p)
  {
    Pixel[][] pixels = p.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public static void zeroRed(DigitalPicture p)
  {
    Pixel[][] pixels = p.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
      }
    }
  }
  
  public static void zeroGreen(DigitalPicture p)
  {
    Pixel[][] pixels = p.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void convertToBlackAndWhite(DigitalPicture p){
      DigitalPicture pic = p;
      Pixel[][] pixels = pic.getPixels2D();
      for(int row = 0; row < pixels.length; row++){
         for(int col = 0; col < pixels[0].length; col++){
             pixels[row][col].setRed((int)pixels[row][col].getAverage());
             pixels[row][col].setGreen(pixels[row][col].getRed());
             pixels[row][col].setBlue(pixels[row][col].getRed());
         }
      }
  }
  
  public static void bw(DigitalPicture p){
      DigitalPicture pic = p;
      Pixel[][] pixels = pic.getPixels2D();
      for(int row = 0; row < pixels.length; row++){
         for(int col = 0; col < pixels[0].length; col++){
             int change = 0;
             if((int)pixels[row][col].getAverage() < 128){
                 change = 0;
             }
             if((int)pixels[row][col].getAverage() > 128){
                 change = 255;
             }
             pixels[row][col].setRed(change);
             pixels[row][col].setGreen(change);
             pixels[row][col].setBlue(change);
         }
      }
  }
  
  public static void brighten(DigitalPicture p, double amount){
      DigitalPicture pic = p;
      Pixel[][] pixels = pic.getPixels2D();
      for(int row = 0; row < pixels.length; row++){
         for(int col = 0; col < pixels[0].length; col++){
             pixels[row][col].setRed((int)(pixels[row][col].getRed() * amount));
             pixels[row][col].setGreen((int)(pixels[row][col].getGreen() * amount));
             pixels[row][col].setBlue((int)(pixels[row][col].getBlue() * amount));
         }
      }
  }
  
  public static void mirrorVertical(DigitalPicture p){
      DigitalPicture pic = p;
      Pixel[][] pixels = pic.getPixels2D();
      for(int row = 0; row < pixels.length; row++){
         for(int col = 0; col < pixels[0].length/2; col++){
             pixels[row][pixels[0].length - col - 1].setColor(pixels[row][col].getColor());
         }
      }
  }
  
  public static void flipVertical(DigitalPicture p){
      DigitalPicture pic = p;
      Pixel[][] pixels = pic.getPixels2D();
      for(int row = 0; row < pixels.length; row++){
         for(int col = 0; col < pixels[0].length/2; col++){
             Color c1 = pixels[row][pixels[0].length - col - 1].getColor();
             pixels[row][pixels[0].length - col - 1].setColor(pixels[row][col].getColor());
             pixels[row][col].setColor(c1);
         }
      }
  }
  
  public static void mirrorHorizontal(DigitalPicture p){
      DigitalPicture pic = p;
      Pixel[][] pixels = pic.getPixels2D();
      for(int row = 0; row < pixels.length/2; row++){
         for(int col = 0; col < pixels[0].length; col++){
             pixels[pixels.length - row - 1][col].setColor(pixels[row][col].getColor());
         }
      }
  }
  
  public static void flipHorizontal(DigitalPicture p){
      DigitalPicture pic = p;
      Pixel[][] pixels = pic.getPixels2D();
      for(int row = 0; row < pixels.length/2; row++){
         for(int col = 0; col < pixels[0].length; col++){
             Color c1 = pixels[pixels.length - row - 1][col].getColor();
             pixels[pixels.length - row - 1][col].setColor(pixels[row][col].getColor());
             pixels[row][col].setColor(c1);
         }
      }
  }
  
  public static void commitToTheColor(){
      Picture pic = new Picture("trump.jpg");
      pic.explore();
      Pixel[][] pixels = pic.getPixels2D();
      for(int row = 0; row < pixels.length; row++){
         for(int col = 0; col < pixels[0].length; col++){
             if(pixels[row][col].getRed() >= pixels[row][col].getBlue()){
                 if(pixels[row][col].getRed() >= pixels[row][col].getGreen()){
                     pixels[row][col].setRed(255);
                     pixels[row][col].setBlue(pixels[row][col].getBlue()/2);
                     pixels[row][col].setGreen(pixels[row][col].getGreen()/2);
                 }
             }
             if(pixels[row][col].getBlue() > pixels[row][col].getRed()){
                 if(pixels[row][col].getBlue() >= pixels[row][col].getGreen()){
                     pixels[row][col].setBlue(255);
                     pixels[row][col].setRed(pixels[row][col].getRed()/2);
                     pixels[row][col].setGreen(pixels[row][col].getGreen()/2);
                 }
             }
             if(pixels[row][col].getGreen() > pixels[row][col].getBlue()){
                 if(pixels[row][col].getGreen() > pixels[row][col].getRed()){
                     pixels[row][col].setGreen(255);
                     pixels[row][col].setBlue(pixels[row][col].getBlue()/2);
                     pixels[row][col].setRed(pixels[row][col].getRed()/2);
                 }
             }
         }
      }
      pic.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    Picture pic = new Picture("beach.jpg");
    pic.explore();
    //flipVertical();
    //flipHorizontal();
    //convertToBlackAndWhite();
    //testZeroBlue();
    //testZeroRed();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
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