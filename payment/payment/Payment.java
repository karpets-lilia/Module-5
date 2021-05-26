package payment.payment;
import java.util.ArrayList;

public class Payment {
    public ArrayList<ProductPayment> productPayments;
    public int totalSum = 0;

    Payment(String[] prods) {
        for(String prod : prods) {
            int prodPrice = ProductPayment.getProductPrice(prod);
            if (prodPrice > 0) {
                totalSum += prodPrice;
            } else {
                System.out.println(prod + " is out of stock");
            }
        }
    }

    static class ProductPayment {
        public static int getProductPrice(String productName) {
            for(Products product: Products.values()) {
                if(productName == product.getProductsName()){
                    return product.getCost();
                }
            }
            return 0;
        }
    }
}





