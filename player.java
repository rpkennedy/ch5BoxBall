
/**
 * Write a description of class player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class player
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class player
     */
    public player()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void goCrazy(BoxBall ball, int iterations){
        for (int i = 0; i < iterations; i++){
        ball.move();
        Thread.sleep();}
    }
}
