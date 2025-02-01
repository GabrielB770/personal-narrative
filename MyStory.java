import org.code.theater.*;
import org.code.media.*;


public class MyStory extends Scene{

  /*
  * 2D array of the text which will describe what is going on in the game (captions)
  */
    private String[][] information = {
      {"Barcelona vs Real Madrid", "Starting the Game and Barca has full possesion", "Unlukcy counter and Real Madrid equalize to make it 1-0", 
      "Tight game and Barca has 78% possesion but still loosing 1-0",
      "Barcelona play a beautiful ball in, score just before the 1st half ends", "2nd half starts and both teams are playing great","Barcelona are on the counter and get fouled: 63'","Barca score to make it 2-1"},
      {"Real Madrid have a hard time getting one more in",
      "Real Madrid are able to equalize",
      "90+5, balls goes in, back in to the corner...into MESSIIIII",
      "Barcelon win 3-2", null, null, null},
    };

      
/*
* The other 2D array of images
*/
      private ImageFilter[][] images =  {
      { new ImageFilter("barca-vs-real-madrid.jpg"), new ImageFilter("possesion.jpg"), new ImageFilter("realmadridscored.jpg"), new ImageFilter("barcelonapossesion.jpg"), new ImageFilter("lionel-messi-barcelona-champions-league_4255597.jpg"), new ImageFilter("Real-Madrid-Barcelona-1.jpg"), new ImageFilter("140420224030-lionel-messi-fouled.jpg")}, 
       {new ImageFilter("4055835-82254348-2560-1440.jpg"), new ImageFilter("realmadrid.jpg"), new ImageFilter("Score.jpg"), new ImageFilter("Messiscores.jpg"), new ImageFilter("winner.jpg"), null, null, null}
 
    };
  
  /*
  * Logical Method that helps determine the size of the text so that it fits on the screen so you can read it as the game goes on!
  */
  public int getTextSize(String information){
    if(information.length() < 43){
      return 20;
    } else if(information.length() > 76){
      return 10;
    } else if(information.length() > 62){
      return 14;
    } else{
      return 12;
    }
  }

/*
* Method that takes the drawImages method and uses it for the TheaterRunner class to print out all the images/text
*/
  public void drawScene(){
    drawImages();
  }

  /*
  * Method that draws the visual representation; In this case it is displaying a game of Barcelona vs Real Madrid
  * Wasnt able to use for loops since indexes in the 2D arrays did not line up causing the text and images not to be alined 
  */
  public void drawImages(){
  
    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    int textSize = getTextSize(information[0][0]);
    setTextHeight(textSize);
    drawText(information[0][0], 90, 310);
    drawImage(images[0][0], 0, 0, 400);
    pause(1);
    images[0][0].makeNegative();
    drawImage(images[0][0], 0, 0, 400);
    pause(1);
    
    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][1]);
    setTextHeight(textSize);
    drawText(information[0][1], 15, 310);
    drawImage(images[0][1], 0, 0, 400);
    pause(1);
    images[0][1].keepColor("blue");
    drawImage(images[0][1], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][2]);
    setTextHeight(textSize);
    drawText(information[0][2], 15, 310);
    drawImage(images[0][2], 0, 0, 400);
    pause(1);
    images[0][2].brightenColors(-100);
    drawImage(images[0][2], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[0][3], 15, 310);
    drawImage(images[0][3], 0, 0, 400);
    pause(1);
    images[0][3].yellowBrightFilter();
    drawImage(images[0][3], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[0][4], 15, 310);
    drawImage(images[0][4], 0, 0, 400);
    pause(1);
    images[0][4].makeNegative();
    drawImage(images[0][4], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[0][5], 15, 310);
    drawImage(images[0][5], 0, 0, 400);
    pause(1);
    images[0][5].keepColor("blue");
    drawImage(images[0][5], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[0][6], 15, 310);
    drawImage(images[0][6], 0, 0, 400);
    pause(1);
    images[0][6].makeNegative();
    drawImage(images[0][6], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[0][7], 15, 310);
    drawImage(images[1][0], 0, 0, 400);
    pause(1);
    images[1][0].yellowBrightFilter();
    drawImage(images[1][0], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[1][0], 15, 310);
    drawImage(images[1][1], 0, 0, 400);
    pause(1);
    images[1][1].keepColor("red");
    drawImage(images[1][1], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[1][1], 15, 310);
    drawImage(images[1][2], 0, 0, 400);
    pause(1);
    images[1][2].yellowBrightFilter();
    drawImage(images[1][2], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[1][2], 15, 310);
    drawImage(images[1][3], 0, 0, 400);
    pause(1);
    images[1][3].keepColor("green");
    drawImage(images[1][3], 0, 0, 400);
    pause(1);

    clear("blue");
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    textSize = getTextSize(information[0][3]);
    setTextHeight(textSize);
    drawText(information[1][3], 15, 310);
    drawImage(images[1][4], 0, 0, 250);
    pause(1);
    images[1][4].makeNegative();
    drawImage(images[1][4], 0, 0, 250);
    pause(1);
  }
  
}