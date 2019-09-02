package ua.training.model.dishes;

import ua.training.model.entity.Client;

public class HotDog implements Dish {

    public HotDog() {
    }



    @Override
    public void inreaseSatisying(Client client) {
        client.setHapiness(client.getHapiness()+2);
    }

    @Override
    public String toString() {
        return "HotDog{}";
    }
}
