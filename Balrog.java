import java.util.Random;

/**
 * Write a description of class Balrog here.
 *
 * @author Ryan Boehm
 * @version 4/6/2020
 */
public class Balrog extends Demon
{
    private Random r = new Random();
    /**
     * Constructor for the Balrog class
     */
    public Balrog()
    {
        this.hp = r.nextInt(121) + 80;
        this.strength = r.nextInt(51) + 50;
    }
    
    public int damage() {
        int i = 2;
        int damage = 0;
        while(i != 0) {
            if(r.nextInt(20) == 0) {
                damage = damage + (r.nextInt(strength) + 1)+50;
            } else {
                damage = damage + r.nextInt(strength) + 1;
            }
            i--;
        }
        return damage;
    }
}
