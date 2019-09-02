package ua.training.model.service;

import ua.training.model.entity.Client;
import ua.training.model.entity.Observer;
import ua.training.model.entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RestaurantServiceImpl implements RestaurantService {

    private List<Observer> observers = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();


    public RestaurantServiceImpl() {

    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
    }


    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
        addObserver(order.getClient());
    }

    @Override
    public void prepareOrders() {
        orders.forEach(this::PrepareOrder);
    }

    @Override
    public void PrepareOrder(Order order) {
        Optional<Order> optionalOrder = orders.stream().filter(ord -> ord.equals(order)).findAny();
        if (optionalOrder.isPresent()) {
            notifyClient(order);

        }
    }

    @Override
    public void notifyClient(Order order) {
        order.getClient().handleEvent(order);
    }

    @Override
    public List<Observer> getObservers() {
        return observers;
    }

    private void addObserver(Observer observer) {
        observers.add(observer);
    }


    @Override
    public List<Order> getOrders() {
        return orders;
    }


    @Override
    public void consumeOrderS() {
        orders.forEach(order -> consumeOrder(order, (Client) order.getClient()));


    }


    private void consumeOrder(Order order, Client client) {
        order.getDishes().forEach(dish -> dish.inreaseSatisying(client));

    }
}
