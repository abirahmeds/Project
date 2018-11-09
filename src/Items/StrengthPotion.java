//Abir Ahmed
package Items;

import People.Person;

/**
 * Strength Potion; can be consumed or collected.
 */
public class StrengthPotion extends Item  implements Potion{
    
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
     * Restores Peron's Strength.
     */
    public void drink (Person p) {
        p.setStrength(100);
    }

    @Override
    public String toString() {
        return ("Strength Potion");
    }
}
