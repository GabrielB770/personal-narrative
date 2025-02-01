import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  
  public ImageFilter(String filename) {
    super(filename);
  }

  /*
  * 1 of 4 filters that make the image a darker color
  */
  public void makeNegative() {
    Pixel[][] pixels = getPixelsFromImage();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
      Pixel currentPixel = pixels[row][col];
      
      currentPixel.setRed(255 - currentPixel.getRed());
      currentPixel.setBlue(255 - currentPixel.getBlue());
      currentPixel.setGreen(255 - currentPixel.getGreen());
      
      }
    }
  }

  /*
  * 2 of 4 filters that brighten the image
  */
  public void brightenColors(int amount) {
    Pixel[][] pixels = getPixelsFromImage();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        currentPixel.setRed(currentPixel.getRed() + amount);
        currentPixel.setGreen(currentPixel.getGreen() + amount);
        currentPixel.setBlue(currentPixel.getBlue() + amount);
      }
    }
  }

  /*
  * 3 of 4 filters that keep the specific color and add it to the image
  */
  public void keepColor(String color) {
    Pixel[][] pixels = getImagePixels();
    for(int row = 0; row < pixels.length; row++){
      for(int col = 0; col < pixels[0].length; col++){
          Pixel currentPixel = pixels[row][col];

          if(color.equals("red")){
            currentPixel.setGreen(0);
            currentPixel.setBlue(0);
          } else if(color.equals("green")){
            currentPixel.setRed(0);
            currentPixel.setBlue(0);
          } else if(color.equals("blue")){
            currentPixel.setRed(0);
            currentPixel.setGreen(0);
          }
     }
    }
  }
  
  /*
  * My own filter that I created using my imagination, I was aiming for a filter that would make the pixels extrmely bright by addin 255 to red and green
  */
  public void yellowBrightFilter() {
    Pixel[][] pixels = getPixelsFromImage();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        currentPixel.setRed(currentPixel.getRed() + 255);
        currentPixel.setBlue(currentPixel.getBlue());
        currentPixel.setGreen(currentPixel.getGreen() + 255);
        
      }
    }
  }
  

}
