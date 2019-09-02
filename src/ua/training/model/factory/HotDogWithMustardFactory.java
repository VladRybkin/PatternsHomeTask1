package ua.training.model.factory;

import ua.training.model.dishes.Dish;
import ua.training.model.dishes.HotDog;
import ua.training.model.dishes.Mustard;

public class HotDogWithMustardFactory implements DishFactory {

    @Override
    public Dish createDish() {
        return new Mustard(new HotDog());
    }
}
