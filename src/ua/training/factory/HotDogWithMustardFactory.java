package ua.training.factory;

import ua.training.model.entity.dishes.Dish;
import ua.training.model.entity.dishes.HotDog;
import ua.training.model.entity.dishes.Mustard;

public class HotDogWithMustardFactory implements DishFactory {

    @Override
    public Dish createDish() {
        return new Mustard(new HotDog());
    }
}
