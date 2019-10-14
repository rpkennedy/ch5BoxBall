import java.awt.*;
import java.awt.geom.*;

/**
 * @author Ryan Kennedy
 * @version 10.14.2019
 */

public class BoxBall
{
    private Ellipse2D.Double circle;
    private int diameter;
    private Color color;
    private int xPosition;
    private int yPosition;
    
    private int xVel;
    private int yVel;
    
    private int groundPosition;
    private int wallPosition; //x value of wall
    private Canvas canvas;


    /**
     * Constructor for objects of class BouncingBall
     *
     * @param xPos  the horizontal coordinate of the ball
     * @param yPos  the vertical coordinate of the ball
     * @param ballDiameter  the diameter (in pixels) of the ball
     * @param ballColor  the color of the ball
     * @param groundPos  the position of the ground (where the wall will bounce)
     * @param drawingCanvas  the canvas to draw this ball on
     */
    public BoxBall(int xPos, int yPos, int ballDiameter,
                        int groundPos, int wallPos, Canvas drawingCanvas)
    {
        xPosition = xPos;
        yPosition = yPos;
        diameter = ballDiameter;
        groundPosition = groundPos;
        wallPosition = wallPos;
        canvas = drawingCanvas;
        color = Color.RED;
    }
    public BoxBall(int ballDiameter, Canvas drawingCanvas, int xVel, int yVel)
    {
        xPosition = 100;
        yPosition = 50;
        diameter = ballDiameter;
        canvas = drawingCanvas;
        groundPosition = 500;
        wallPosition = 500;
        this.xVel = xVel;
        this.yVel = yVel;
        color = Color.RED;
    }

    /**
     * Draw this ball at its current position onto the canvas.
     **/
    public void draw()
    {
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPosition, yPosition, diameter);
    }

    /**
     * Erase this ball at its current position.
     **/
    public void erase()
    {
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }    

    /**
     * Move this ball according to its position and speed and redraw.
     **/
    public void move()
    {
        // remove from canvas at the current position
        erase();
            
        
        // compute new position
        xPosition += xVel;
        yPosition += yVel;
        
        // check ground/ceiling hit
        if(yPosition >= (groundPosition - diameter)) {
            yPosition = (int)(0);
            yVel = (-1)*yVel; }
        if(yPosition <= diameter) {
            yPosition = (int)(groundPosition - diameter);
            yVel = (-1)*yVel; }
            
        // check wall hit     
        if(xPosition >= (wallPosition - diameter)) {
            xPosition = (int)(wallPosition - diameter);
            xVel = (-1)*xVel; }
        if(xPosition <= diameter) {
            xPosition = (int)(0);
            xVel = (-1)*xVel; }
            
        // draw again at new position
        draw();
    }    


    
    /**
     * return the horizontal position of this ball
     */
    public int getXPosition()
    {
        return xPosition;
    }

    /**
     * return the vertical position of this ball
     */
    public int getYPosition()
    {
        return yPosition;
    }
}
