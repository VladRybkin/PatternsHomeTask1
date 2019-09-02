package ua.training.model.entity;

import ua.training.model.entity.Order;

import java.util.List;

public interface Observer {

     void handleEvent(Order order);
}
