import java.util.Random;

/**
 * Write a description of class Human here.
 *
 * @author Ryan Boehm
 * @version 4/6/2020
 */
public class Human extends Creature
{
    private Random r = new Random();
    /**
     * Constructor for the Human class
     */
    public Human()
    {
        this.strength = r.nextInt(14) + 5;
        this.hp = r.nextInt(21) + 10;
    }
}
