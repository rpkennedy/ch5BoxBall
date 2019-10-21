
/**
 * Write a description of class player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class boxBounce
{
    // instance variables - replace the example below with your own
    private int n = 0;
    private BoxBall ballArray[];
    
    /**
     * Constructor for objects of class player
     */
    public boxBounce()
    {
        // initialise instance variables
    }
    /**
     * Method for spawning desired amount of random balls
     * @param balls How many balls to create
     * @param canvas What canvas should the balls be created
     * onto
     */
    public void spawn(int n, Canvas canvas){
        this.n = n;
        ballArray = new BoxBall[n];
        for(int i = 0; i < n; i++)
            ballArray[i] = new BoxBall(canvas);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  iterations  How many times the balls are updated
     */
    public void goCrazy(int iterations)
        throws InterruptedException {
        for (int i = 0; i < iterations; i++){
            for(int u = 0; u < n; u++)
            ballArray[u].move(); 
        Thread.sleep(100);}
    }
}
