//Abir Ahmed
package Items;

import People.Person;

/**
 * Mushroom Item; can be eaten or collected.
 */
public class Mushroom extends Entity  implements Food{
    private boolean poisonous;

    /**
     * Main Constructor
     * @param x position of the Mushroom along the x Axis. (Row)
     * @param y position of the Mushroom along the y Axis. (Column)
     * @param poisonous The boolean value representing whether an instance of a Mushroom is poisonous.
     */
    public Mushroom(int x,  int y, boolean poisonous) {
        super(x, y);
        this.poisonous = poisonous;
    }

    @Override
    /**
     * Changes Person attributes (fields) based on whether Mushroom is poisonous.
     * Not all of these changes are positive.
     */
    public void eat (Person p) {
        if (!poisonous) {
            p.setHealth(p.getHealth() + 20);
            p.setEndurance(p.getEndurance() + 20);
            p.setStrength(p.getStrength() + 20);
            p.setIntellect(p.getIntellect() + 20);
        } else {
            p.setHealth(p.getHealth() - 20);
            p.setEndurance(p.getEndurance() - 10);
            p.setStrength(p.getStrength() - 10);
            p.setIntellect(p.getIntellect() - 20);
        }
    }

    @Override
    public String toString() {
        return ("Unidentified Mushroom");
    }
}
