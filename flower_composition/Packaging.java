package flower_composition;

public class Packaging {
    private String namePackage;
    private String colorPackage;

    Packaging() {}

    Packaging(String namePackage, String colorPackage) {
        this.namePackage = namePackage;
        this.colorPackage = colorPackage;
    }

    public String getNamePackage() {
        return namePackage;
    }

    public String getColorPackage() {
        return colorPackage;
    }

    @Override
    public String toString() {
        return "Package: " +
                "Name package - '" + namePackage + '\'' +
                ", color package -  '" + colorPackage + '\'';
    }
}
