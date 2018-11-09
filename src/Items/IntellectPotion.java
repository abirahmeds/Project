//Abir Ahmed
package Items;

import People.Person;

/**
 * Intellect Potion; can be consumed or collected.
 */
public class IntellectPotion extends Item  implements Potion{
    
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
     * Restores Peron's Intellect.
     */
    public void drink (Person p) {
        p.setIntellect(100);
    }

    @Override
    public String toString() {
        return ("Intellect Potion");
    }
}
