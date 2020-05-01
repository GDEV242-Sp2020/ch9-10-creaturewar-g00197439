import java.util.Random;

/**
 * Write a description of class Elf here.
 *
 * @author Ryan Boehm
 * @version 4/6/2020
 */
public class Elf extends Creature
{
    private Random r = new Random();
    /**
     * Constructor for the Elf class
     */
    public Elf()
    {
        this.strength = r.nextInt(14) + 5;
        this.hp = r.nextInt(18) + 8;
    }
    
    public int damage() {
        if(r.nextInt(10) == 0) {
            return (r.nextInt(strength) + 1)*2;
        }
        return r.nextInt(strength) + 1;
    }
}
