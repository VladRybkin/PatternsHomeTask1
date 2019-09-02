package ua.training.model.entity.dishes;

import ua.training.model.entity.Client;

public class Chips implements Dish {
    @Override
    public void inreaseSatisying(Client client) {
        client.setHapiness((client.getHapiness()+(client.getHapiness()/100)*5));

    }

    @Override
    public String toString() {
        return "Chips{}";
    }
}
