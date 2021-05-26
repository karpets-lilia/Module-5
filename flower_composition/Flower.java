package flower_composition;

public class Flower {
    private String nameFlower;
    private double costFlower;

    Flower() {}

    Flower(String nameFlower, double costFlower) {
        this.nameFlower = nameFlower;
        this.costFlower = costFlower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public double getCostFlower() {
        return costFlower;
    }

    @Override
    public String toString() {
        return "Flower: " +
                "Name flower - '" + nameFlower + '\'' +
                ", cost flower - " + costFlower;
    }
}
