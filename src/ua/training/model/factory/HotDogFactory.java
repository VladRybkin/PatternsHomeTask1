package ua.training.model.factory;

import ua.training.model.dishes.Dish;
import ua.training.model.dishes.HotDog;

public class HotDogFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new HotDog();
    }
}
