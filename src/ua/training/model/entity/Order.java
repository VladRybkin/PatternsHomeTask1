package ua.training.model.entity;

import ua.training.model.dishes.Dish;

import java.util.List;

public class Order {
     private int orderId;
     private Observer client;
     private List<Dish> dishes;


     public Order(Observer client, List<Dish> dishes) {
          this.client = client;
          this.dishes = dishes;
     }

     public int getOrderId() {
          return orderId;
     }

     public void setOrderId(int orderId) {
          this.orderId = orderId;
     }

     public Observer getClient() {
          return client;
     }

     public void setClient(Observer client) {
          this.client = client;
     }

     public List<Dish> getDishes() {
          return dishes;
     }

     public void setDishes(List<Dish> dishes) {
          this.dishes = dishes;
     }

     @Override
     public String toString() {
          return "Order{" +
                  "orderId=" + orderId +
                  ", client=" + client +
                  ", dishes=" + dishes +
                  '}';
     }
}
