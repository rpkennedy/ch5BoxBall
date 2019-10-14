
/**
 * Write a description of class Fibonacci here.
 *
 * @author Ryan Kennedy
 * @version 10.14.2019
 */
public class Fibonacci
{
    // instance variables - replace the example below with your own
    private int sum, x, y;

    /**
     * Constructor for objects of class Fibonacci
     */
    public Fibonacci()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  b  Iterations of fib sequence
     * @return    the sum of x and y
     */
    public void printFib(int b)
    {
        sum = 0;
        x = 0;
        y = 1;
        if (b == 1)
        System.out.println(0);
        
        for (int i = 0; i < b-1; i++)
        {
        if (i == 0 && b > 1){
            System.out.println(x);
            System.out.println(y);
        }
        else{
            sum = x + y;
            x = y;
            y = sum;
            System.out.println(sum);
        }
        }
    }
}
