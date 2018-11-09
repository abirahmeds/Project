//Abir Ahmed

package Entities;

import java.util.ArrayList;


public class Item {
    static ArrayList<Integer> assignedItemID = new ArrayList<Integer>() {{ add(0); }};
    int itemID;
    int xPos, yPos;

    public Entity(int x, int y) {
        xPos = x;
        yPos = y;
    }

   
   //accessors
    public void setitemID() {this.itemID = assigneditemID.get(assigneditemID.size()-1) + (int)((Math.random() * 10) + 1);}

    public int getitemID() { return itemID; }

    public int getXPos() { return xPos; }
    public void setXPos(int xPos) { this.xPos = xPos; }

    public int getYPos() { return yPos; }
    public void setYPos(int yPos) { this.yPos = yPos; }
}
