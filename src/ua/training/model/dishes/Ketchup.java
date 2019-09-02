package ua.training.model.dishes;

import ua.training.model.entity.Client;

public class Ketchup implements Dish {

    private Dish abstractDishDecorated;

    public Ketchup(Dish abstractDishDecorated) {
        this.abstractDishDecorated = abstractDishDecorated;
    }

    @Override
    public void inreaseSatisying(Client client) {
        abstractDishDecorated.inreaseSatisying(client);
        abstractDishDecorated.inreaseSatisying(client);
    }

    @Override
    public String toString() {
        return "Ketchup{" +
                "with=" + abstractDishDecorated +
                '}';
    }
}
