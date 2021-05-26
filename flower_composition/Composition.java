package flower_composition;

public class Composition {
    private final Flower flower;
    private final Packaging packaging;
    private final Postcard postcard;
    private final int flowersNum;

    public Composition(Flower flower, Packaging packaging, Postcard postcard, int flowersNum) {
        this.flower = flower;
        this.packaging = packaging;
        this.postcard = postcard;
        this.flowersNum = flowersNum;
    }

    public Flower getFlower() {
        return flower;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public Postcard getPostcard() {
        return postcard;
    }
}

