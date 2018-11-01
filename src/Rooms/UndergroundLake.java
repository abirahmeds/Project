package Rooms;

import Game.Runner;
import People.Person;

public class UndergroundLake extends Room
{

    public UndergroundLake(int x, int y) {
        super(x, y);

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
        System.out.println("You found the happy room! Ten points for Happiness.");
    }


}
