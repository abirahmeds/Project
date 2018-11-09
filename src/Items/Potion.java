//Abir Ahmed
package Items;

import People.Person;

/**
 * Interface for all potion items.
 */
public interface Potion {
    /**
     * Abstract method that will behave differently based on the item.
     *Overridden in EndurancePotion, StrengthPotion, HealthPotion, IntellectPotion
     * @param player Current Person.
     */
    public void drink(Person player);

    /**
     * Abstract toString method.
     * @return A String that will be printed if the object is called in a print statement.
     */
    public String toString();
}
