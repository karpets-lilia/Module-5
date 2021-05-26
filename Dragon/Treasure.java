package Dragon;

public class Treasure {
    private String treasureName;
    private int treasureCost;

    Treasure(String treasureName, int treasureCost) {
        this.treasureName = treasureName;
        this.treasureCost = treasureCost;
    }

    public String getTreasureName() {
        return treasureName;
    }

    public int getTreasureCost() {
        return treasureCost;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "Treasure name:'" + treasureName + '\'' + "Treasure cost:'" + treasureCost + '\'' + "'}";
    }
}


