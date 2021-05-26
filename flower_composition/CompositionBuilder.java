package flower_composition;

public class CompositionBuilder implements Builder {
    private  Flower flower;
    private  Packaging packaging;
    private  Postcard postcard;
    private  int flowersNum;

    @Override
    public void setFlower(Flower flower) { this.flower = flower; }

    @Override
    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    @Override
    public void setPostcard(Postcard postcard) {
        this.postcard = postcard;
    }

    @Override
    public void setFlowersNum(int flowersNum) {
        this.flowersNum = flowersNum;
    }

    public Composition getResult() {
        return new Composition(flower, packaging, postcard, flowersNum);
    }
}

