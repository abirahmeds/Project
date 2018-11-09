//Abir Ahmed
package Items;

import People.Person;

/**
 * Grapes Item; can be eaten or collected.
 */
public class Grapes extends Item  implements Food{
    private int numInBunch;

    /**
     * Main Constructor
     * @param x position of the Grapes along the x Axis. (Row)
     * @param y position of the Grapes along the y Axis. (Column)
     * @param poisonous The integer value representing how many grapes are in the bunch of Grapes.
     */
    public Grapes(int x,  int y, int numInBunch) {
        super(x, y);
        this.numInBunch = numInBunch;
    }

    @Override
    /**
     * Changes Person attributes (fields) based on how many grapes are in the bunch of Grapes.
     * All of these changes are positive.
     */
    public void eat (Person p) {
        if (numInBunch < 3) {
            p.setHealth(p.getHealth() + 20);
            p.setEndurance(p.getEndurance() + 20);
            p.setStrength(p.getStrength() + 20);
            p.setIntellect(p.getIntellect() + 20);
        } else {
            p.setHealth(p.getHealth() + 50);
            p.setEndurance(p.getEndurance() + 50);
            p.setStrength(p.getStrength() + 50);
            p.setIntellect(p.getIntellect() + 50);
        }
    }

    @Override
    public String toString() {
        return ("Bunch of Grapes");
    }
}
