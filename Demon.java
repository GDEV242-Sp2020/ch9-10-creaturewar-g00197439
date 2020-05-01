import java.util.Random;

/**
 * Write a description of class Demon here.
 *
 * @author Ryan Boehm
 * @version 4/6/2020
 */
public class Demon extends Creature
{
    private Random r = new Random();
    /**
     * Constructor for the Demon class
     */
    public Demon()
    {
    }
    
    public int damage() {
        if(r.nextInt(20) == 0) {
            return (r.nextInt(strength) + 1)+50;
        }
        return r.nextInt(strength) + 1;
    }
}
