import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /*
    * Instantiations of myScene and myStory which will help contribute to the overall display of images and text
    */
    Scene myScene = new Scene();
    MyStory myStory = new MyStory();

    /*
    * Takes the drawScene method from MyStory
    */
    myStory.drawScene();


    Theater.playScenes(myStory);
  }
}