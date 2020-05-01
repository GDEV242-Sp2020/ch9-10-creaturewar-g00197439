import java.util.Random;

/**
 * The Creature class creates a creature with a certain strength and HP
 * that can be put to battle against another creature.
 * 
 * @author Ryan Boehm
 * @version 4/6/2020
 */
public class Creature
{
   public int hp;
   public int strength;
   private Random r;
   
   /**
    * Basic constructor for the Creature class
    */
   public Creature() {
       hp = 10;
       strength = 10;
       r = new Random();
   }
   
   /**
    * Constructor for the Creature class. This constructor allows for
    * unique values to be added into the Creature rather than 10.
    */
   public Creature(int hitPoints, int power) {
       hp = hitPoints;
       strength = power;
       r = new Random();
   }
   
   /**
    * Returns a random value between 1 and the creature's strength
    * @return A random damage
    */
   public int damage() {
   return r.nextInt(strength) + 1;
   }
   
   /**
    * Checks to see if the creature has more than 0 hit points
    * @return True if creature has more than 0 hit points and false otherwise
    */
   public boolean isAlive() {
       if(hp > 0) {
           return true;
       } else {
           return false;
       }
   }
   
   /**
    * Returns the strength of the creature
    * @return The strength of the creature
    */
   public int getStrength() {
       return strength;
   }
   
   /**
    * Returns the current HP of the creature
    * @return The currernt HP of the creature
    */
   public int getHp() {
       return hp;
   }
}
