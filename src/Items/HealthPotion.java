//Abir Ahmed
package Items;

import People.Person;

/**
 * Health Potion; can be consumed or collected.
 */
public class HealthPotion extends Item  implements Potion{
    
    /**
     * Main Constructor
     * @param x position of the Potion along the x Axis. (Row)
     * @param y position of the Potion along the y Axis. (Column)
     */
    public StrengthPotion(int x,  int y) {
        super(x, y);
    }

    @Override
    /**
     * Restores Peron's Health.
     */
    public void drink (Person p) {
        p.setHealth(10);
    }

    @Override
    public String toString() {
        return ("Health Potion");
    }
}
