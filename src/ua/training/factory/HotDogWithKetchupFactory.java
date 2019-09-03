package ua.training.factory;

import ua.training.model.entity.dishes.Dish;
import ua.training.model.entity.dishes.HotDog;
import ua.training.model.entity.dishes.Ketchup;

public class HotDogWithKetchupFactory implements DishFactory{
    @Override
    public Dish createDish() {
        return new Ketchup(new HotDog());
    }
}
