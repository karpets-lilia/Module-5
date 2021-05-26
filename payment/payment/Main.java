package payment.payment;

/*Создать класс Payment с внутренним классом, с помощью обьектов которого
 можно сформировать покупку из нескольких товаров*/
public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(new String[]{"sugar", "milk", "bread"});
        System.out.println("Total sum: " + payment.totalSum + " BLR");
    }
}
