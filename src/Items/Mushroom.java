//Abir Ahmed
package Items;

/**
 * Mushroom Entity; can be eaten or collected.
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
            p.restoreHealth(1);
            p.restoreStamina(1);
            p.restoreNutrition(2);
            p.restoreHydration(2);
        } else {
            p.restoreHealth(0);
            p.restoreStamina(0);
            p.restoreNutrition(0);
            p.restoreHydration(0);
        }
    }

    @Override
    public String toString() {
        return ("Mushroom");
    }
}
