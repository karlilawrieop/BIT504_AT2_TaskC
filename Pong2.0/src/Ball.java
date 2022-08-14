 import java.awt.Color;
   
   public class Ball extends Sprite { // inherits from sprite class
       private static final int BALL_WIDTH = 25;
       private static final int BALL_HEIGHT = 25;
       private static final Color BALL_COLOUR = Color.BLACK;
       //
    // adding a line
   
       public Ball(int panelWidth, int panelHeight) { // constructor
          setWidth(BALL_WIDTH);
          setHeight(BALL_HEIGHT);
          setColour(BALL_COLOUR);
          setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
          resetToInitialPosition(); // reset position of the ball	
      }
 }