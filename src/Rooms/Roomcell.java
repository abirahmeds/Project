//Abir Ahmed

import Items.Item;
import People.Person;
import java.util.ArrayList;


public abstract class Cell {
    ArrayList<Item> itemssInCell = new ArrayList<>();

    // Constructor for class fields.
    public Roomcell (int x, int y) {
        xPos = x;
        yPos = y;
    }

    
    public abstract void enterCell(Player p);

   
    public abstract void leaveCell(Player p);

    // Accessors for items in Room Cell
    public abstract void setItemsInCell();
    public int getNumItems() { return itemsInCell.size(); }
    public ArrayList<Item> getItemsInCell(){ return itemsInCell; }

   
    public void removeItem(int pos) itemsInCell.remove(pos);}
    public void addItem(Item item) {itemssInCell.add(item);}
}
