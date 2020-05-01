import java.util.Random;

/**
 * Write a description of class Cyberdemon here.
 *
 * @author Ryan Boehm
 * @version 4/6/2020
 */
public class Cyberdemon extends Demon
{
    private Random r = new Random();
    /**
     * Constructor for the Cyberdemon class
     */
    public Cyberdemon()
    {
        this.hp = r.nextInt(76) + 25;
        this.strength = r.nextInt(21) + 20;
    }
}
