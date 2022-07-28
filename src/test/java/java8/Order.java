package java8;

public class Order {

    int price;
    boolean isVegan;
    String customerName;

    public Order(int price, boolean isVegan, String customerName) {
        this.price = price;
        this.isVegan = isVegan;
        this.customerName = customerName;
    }
}
