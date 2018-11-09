//Abir Ahmed
package Items;

import People.Person;

/**
 * Interface for all food items.
 */
public interface Food {
    /**
     * Abstract method that will behave differently based on the item.
     * ~Overridden in Mushroom, Grapes
     * @param player Current Person.
     */
    public void eat(Person player);

    /**
     * Abstract toString method.
     * @return A String that will be printed if the object is called in a print statement.
     */
    public String toString();
}
