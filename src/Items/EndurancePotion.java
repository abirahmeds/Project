//Abir Ahmed
package Items;

import People.Person;

/**
 * Endurance Potion; can be consumed or collected.
 */
public class EndurancePotion extends Item  implements Potion{
    
    /**
     * Main Constructor
     * @param x position of the Potion along the x Axis. (Row)
     * @param y position of the Potion along the y Axis. (Column)
     */
    public EndurancePotion(int x,  int y) {
        super(x, y);
    }

    @Override
    /**
     * Restores Peron's Endurance.
     */
    public void drink (Person p) {
        p.setEndurance(100);
    }

    @Override
    public String toString() {
        return ("Endurance Potion");
    }
}
