//Abir Ahmed
package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int health, endurance, intellect, strength;



	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public Person(String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	    /**
     * Second constructor for each new instance of a Player.
     * @param x position of the Player along the X Axis. (Row)
     * @param y position of the Player along the Y Axis. (Column)
     */
    public Player(int x, int y) {
        super(x, y);
        playerBuilder();
    }

    // Accessors and Mutators for Person's Attributes
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getEndurance() { return endurance; }
    public void setEndurance(int endurance) { this.endurance = endurance; }

    public int getIntellect() { return intellect; }
    public void setIntellect(int intellect) { this.intellect = intellect; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }
    
    public void playerBuilder() {
        this.health = 100;
        this.endurance = 100;
        this.intellect = 100;
        this.strength = 100;
    }


    // Item inventory methods
	
    public int currentItemsInInventory() {
        int count = 0;
        for (Item e : inventory) {
            if (e != null) {
                count++;
            }
        }
        return count;
    }

   
    public Item itemAtPos(int pos) {
        return inventory[pos];
    }

 
    public boolean spaceLeft() {
        for (Entity e : inventory) {
            if (e == null) {
                return true;
            }
        }
        return false;
    }

   
    public void pickUp(Entity item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item; //place picked up item at next available position in inventory array
                break;
            }
        }
    }

   
    public void drop(int pos, Cell cell) {
        cell.addEntity(inventory[pos]); //adds item from inventory to cell
        inventory[pos] = null; //removes item from inventory
    }

   
    public void removeItem(int pos) {
        for (int i = 0; i < inventory.length; i++) {
            if (pos == i) {
                inventory[i] = null; //removes item from inventory
            }
        }
    }


}
