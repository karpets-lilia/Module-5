package payment.payment;

public enum Products {
    MILK("milk", 123, 2),
    SUGAR("sugar", 124, 2),
    BREAD("bread", 125, 1);

    private String productsName;
    private int barcode;
    private int cost;

    Products(String productsName, int barcode, int cost) {
        this.productsName = productsName;
        this.barcode = barcode;
        this.cost = cost;
    }
    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
