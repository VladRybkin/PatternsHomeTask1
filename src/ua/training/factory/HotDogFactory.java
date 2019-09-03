package ua.training.factory;

import ua.training.model.entity.dishes.Dish;
import ua.training.model.entity.dishes.HotDog;

public class HotDogFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new HotDog();
    }
}
