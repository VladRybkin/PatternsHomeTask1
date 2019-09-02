package ua.training.model.service;

import ua.training.model.entity.Observer;
import ua.training.model.entity.Order;

import java.util.List;

public interface RestaurantService {


    List<Order> getOrders();

    void consumeOrderS();

    void removeObserver(Observer observer);

    void addOrder(Order order);

    void removeOrder(Order order);

    void prepareOrders();

    void PrepareOrder(Order order);

    void notifyClient(Order order);

    List<Observer> getObservers();
}
