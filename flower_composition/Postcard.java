package flower_composition;

public class Postcard {
    private String postcardName;

    Postcard() {}

    Postcard(String postcardName) {
        this.postcardName = postcardName;
    }
    public String getPostcardName() {
        return postcardName;
    }

    @Override
    public String toString() {
        return "Postcard: " +
                "Postcard name -  '" + postcardName + '\'' +
                '}';
    }
}
