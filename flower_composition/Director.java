package flower_composition;

public class Director {
    public void collectRoseComposition(Builder builder) {
        builder.setFlower(new Flower("Rose", 3));
        builder.setPackaging(new Packaging("Box", "Pink"));
        builder.setPostcard(new Postcard("Birthday"));
        builder.setFlowersNum(21);
    }

    public void collectChamomileComposition(Builder builder) {
        builder.setFlower(new Flower("Chamomile", 1));
        builder.setPackaging(new Packaging("Craft paper", "graphite color"));
        builder.setPostcard(new Postcard());
        builder.setFlowersNum(201);

    }

    public void collectPionComposition(Builder builder) {
        builder.setFlower(new Flower("Pion", 5));
        builder.setPackaging(new Packaging());
        builder.setPostcard(new Postcard());
        builder.setFlowersNum(25);
    }
}
