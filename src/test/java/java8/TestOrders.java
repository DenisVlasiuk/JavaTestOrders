package java8;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestOrders {

    @Test
    public void checkOrders(){
        Order firstOrder = new Order(250, false, "Denis");
        Order secondOrder = new Order(150, true, "Olga");
        Order thirdOrder = new Order(35, false, "Inna");
        Order fourthOrder = new Order(70, false, "Oleg");
        Order fifthOrder = new Order(370, false, "Vadym");
        Order sixthOrder = new Order(40, false, "Nikita");
        Order seventhOrder = new Order(530, false, "Nina");
        Order eighthOrder = new Order(160, false, "Roma");

        List<Order> orderList = Arrays.asList(firstOrder, secondOrder, thirdOrder, fourthOrder, fifthOrder, sixthOrder,
                seventhOrder, eighthOrder);

     OrderFilter orderFilter = new OrderFilter(orderList);
     orderFilter.printPriceLessThan300();

        OrderFilter orderFilter2 = new OrderFilter(orderList);
        orderFilter2.printPriceMoreThan100();
    }
}
