package Rooms;

import Game.Runner;
import People.Person;
import Items.Grapes;
import Items.Mushroom;
import Items.EndurancePotion;
import Items.StrengthPotion;
import Items.IntellectPotion;
import Items.HealthPotion;

public class OldCaveDwelling extends Room
{

    public OldCaveDwelling(int x, int y) {
        super(x, y);
        setItemsInCell();

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the winning room! Ten points for Gryffindor.");
        Runner.gameOff();
    }


    @Override
    public void setItemsInCell() {
        for (int i = 0; i < 2; i++) {
            //Probability of Item Presence in Room
            int grapesChance = (int)((Math.random() * 100) + 1);
            int mushroomChance = (int)((Math.random() * 100 + 1));
            int potionChance = (int)((Math.random() * 100) + 1);
            if (grapeChance <= 35) {
                int numInBunch = (int) ((Math.random() * 6) + 1);
                Grapes bunch = new Grapes(this.xPos, this.yPos, numInBunch);
                this.itemsInCell.add(bunch);
            }
            if (mushroomChance <= 40) {
              
                boolean poisonous = false;
                if (mushroomChance <= 20) {
                    poisonous = true;
                }
                Mushroom mushroom = new Mushroom(this.xPos, this.yPos, poisonous);
                this.itemsInCell.add(mushroom);
            }
            if (potionChance <= 25) {
                EndurancePotion ePotion = new EndurancePotion(this.xPos, this.yPos);
                this.itemsInCell.add(ePotion);
            }
            if (potionChance > 25 && potionChance <= 50) {
                StrengthPotion sPotion = new StrengthPotion(this.xPos, this.yPos);
                this.itemsInCell.add(sPotion);
            }
            if (potionChance > 50 && potionChance <= 75) {
                HealthPotion hPotion = new HealthPotion(this.xPos, this.yPos);
                this.itemsInCell.add(hPotion);
            }
            if (potionChance > 50 && potionChance <= 75) {
                HealthPotion hPotion = new HealthPotion(this.xPos, this.yPos);
                this.itemsInCell.add(hPotion);
            }
            if (potionChance > 75 && potionChance <= 100) {
                IntellectPotion iPotion = new IntellectPotion(this.xPos, this.yPos);
                this.itemsInCell.add(iPotion);
            }
    }

    @Override
    public void enterRoom(Person p) {
        player = p;
        p.setXPos(this.xPos);
        p.setYPos(this.yPos);
    }

    @Override
    public void leaveRoom(Person p) {
        player = null;
    }

    @Override
    public String toString() {
        if (player != null) {
            return ("X");
        } else {
            return ("O");
        }
    }
}

}
