package ua.training.model.dishes;

import ua.training.model.entity.Client;

public class Mustard implements Dish {

    private Dish abstractDishDecorated;


    public Mustard(Dish dish) {
        this.abstractDishDecorated = dish;
    }

    @Override
    public void inreaseSatisying(Client client) {
        client.setHapiness(1);
    }

    @Override
    public String toString() {
        return "Mustard{" +
                "with=" + abstractDishDecorated +
                '}';
    }
}
