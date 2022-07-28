package java8;

import java.util.List;



public class OrderFilter {

    List<Order> orderList;

    OrderFilter(List<Order> orderList){
        this.orderList = orderList;
    }

    public void printVegan(){
        for (Order order : orderList){
            if (order.isVegan){
                System.out.println(order);
            }
        }
    }

    public void printPriceMoreThan100(){
        for (Order order : orderList){
            if (order.price > 100){
                System.out.println(order);
            }
        }

    }
    public void printPriceLessThan300(){
        for (Order order : orderList){
            if (order.price < 300){
                System.out.println(order);
            }
        }
    }
}


