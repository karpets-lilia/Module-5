package Dragon;

import java.util.ArrayList;

public class DragonCave {
    private ArrayList<ArrayList<Treasure>> treasuresList = new ArrayList<ArrayList<Treasure>>();
    private ArrayList<Treasure> coins = new ArrayList<Treasure>();
    private ArrayList<Treasure> emeralds = new ArrayList<Treasure>();;
    private ArrayList<Treasure> rubies = new ArrayList<Treasure>();;
    private int countCoins = 30;
    private int countEmeralds = 40;
    private int countRubies = 30;


    public DragonCave() {

        for (int i = 0; i < countCoins; i++) {
            Treasure newCoin = new Coin("Coin", 2);
            coins.add(newCoin);
        }
        treasuresList.add(coins);

        for (int i = 0; i < countEmeralds; i++) {
            Treasure newEmerald = new Emerald("Emerald", 150);
            emeralds.add(newEmerald);
        }
        treasuresList.add(emeralds);

        for (int i = 0; i < countRubies; i++) {
            Treasure newRuby = new Ruby("Ruby", 100);
            rubies.add(newRuby);
        }
        treasuresList.add(rubies);
    }

    public ArrayList<ArrayList<Treasure>>  getTreasures() {
        return treasuresList;


    }
}



