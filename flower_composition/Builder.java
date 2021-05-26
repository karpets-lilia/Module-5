package flower_composition;

public interface Builder {
    void setFlower(Flower flower) ;
    void setPackaging(Packaging packaging);
    void setPostcard(Postcard postcard);
    void setFlowersNum(int flowersNum);
}
