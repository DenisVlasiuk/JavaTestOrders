package java8;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestOrders {

    @Test
    public void checkOrders(){
        Order firstOrder = new Order(250, false, "Denis");
        Order secondOrder = new Order(150, true, "Olga");
        Order thirdOrder = new Order(780, false, "Inna");
        Order fourthOrder = new Order(640, false, "Oleg");
        Order fifthOrder = new Order(370, false, "Vadym");
        Order sixthOrder = new Order(210, false, "Nikita");
        Order seventhOrder = new Order(530, false, "Nina");
        Order eighthOrder = new Order(160, false, "Roma");

        List<Order> orderList = Arrays.asList(firstOrder, secondOrder, thirdOrder, fourthOrder, fifthOrder, sixthOrder,
                seventhOrder, eighthOrder);
        

    }
}
