package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Client implements Observer {
    private String name;
    private int hapiness;
    private List<Order> orders;

    @Override
    public void handleEvent(Order order) {
        System.out.println(String.format("hello %s order %s  was prepared", name, order.getDishes()));
    }

    public Client() {
    }

    public Client(String name) {
        this.name = name;
        this.hapiness = 0;
        orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHapiness() {
        return hapiness;
    }

    public void setHapiness(int hapiness) {
        this.hapiness = hapiness;
    }


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", hapiness=" + hapiness +
                ", orders=" + orders +
                '}';
    }
}


