import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class War here.
 *
 * @author Ryan Boehm
 * @version 5/1/2020
 */
public class War
{

    private ArrayList<Creature> army1 = new ArrayList<Creature>();
    private ArrayList<Creature> army2 = new ArrayList<Creature>();
    private Random r = new Random();
    
    public void populateWar(int size) {
        int random;
        for(int i = 0; i < size; i++) {
            random = r.nextInt(20);
            if(random < 10) {
                Human human = new Human();
                army1.add(human);
            } else if(random > 9 && random < 13) {
                Elf elf = new Elf();
                army1.add(elf);
            } else if(random > 12 && random < 17) {
                Demon demon = new Demon();
                army1.add(demon);
            } else if(random > 16 && random < 20) {
                Cyberdemon cyberdemon = new Cyberdemon();
                army1.add(cyberdemon);
            } else {
                Balrog balrog = new Balrog();
                army1.add(balrog);
            }
        }
        
        for(int i = 0; i < size; i++) {
            random = r.nextInt(20);
            if(random < 10) {
                Human human = new Human();
                army2.add(human);
            } else if(random > 9 && random < 13) {
                Elf elf = new Elf();
                army2.add(elf);
            } else if(random > 12 && random < 17) {
                Demon demon = new Demon();
                army2.add(demon);
            } else if(random > 16 && random < 20) {
                Cyberdemon cyberdemon = new Cyberdemon();
                army2.add(cyberdemon);
            } else {
                Balrog balrog = new Balrog();
                army2.add(balrog);
            }
        }
    }
    
    public void war() {
        int army1Index = r.nextInt(army1.size());
        int army2Index = r.nextInt(army2.size());
        boolean army1Reset = false;
        boolean army2Reset = false;
        while(army1.size() > 0 && army2.size() > 0 && army1.get(army1Index).isAlive() && army2.get(army2Index).isAlive()) {
            if(r.nextInt(2) == 0) {
                army2.get(army2Index).hit(army1.get(army1Index).damage());
                if(army2.get(army2Index).isAlive()) {
                    army1.get(army1Index).hit(army2.get(army2Index).damage());
                    if(!(army1.get(army1Index).isAlive())) {
                        army1.remove(army1Index);
                        army1Reset = true;
                    }
                } else {
                    army2.remove(army2Index);
                    army2Reset = true;
                }
            } else {
                army1.get(army1Index).hit(army2.get(army2Index).damage());
                if(army1.get(army1Index).isAlive()) {
                    army2.get(army2Index).hit(army1.get(army1Index).damage());
                    if(!(army2.get(army2Index).isAlive())) {
                        army2.remove(army2Index);
                        army2Reset = true;
                    }
                } else {
                    army1.remove(army1Index);
                    army1Reset = true;
                }
            }
            if(army1Reset && army1.size() > 0) {
                army1Index = r.nextInt(army1.size());
                army1Reset = false;
            }
            if(army2Reset && army2.size() > 0) {
                army2Index = r.nextInt(army2.size());
                army2Reset = false;
            }
        }
        if(army1.size() != 0) {
            System.out.println("Army 1 has won with " + army1.size() + " soldiers remaing!");
        } else {
            System.out.println("Army 2 has won with " + army2.size() + " soldiers remaing!");
        }
    }
}
