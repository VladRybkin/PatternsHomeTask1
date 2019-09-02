package ua.training.model.factory;

import ua.training.model.dishes.Dish;
import ua.training.model.dishes.HotDog;
import ua.training.model.dishes.Ketchup;

public class HotDogWithKetchupFactory implements DishFactory{
    @Override
    public Dish createDish() {
        return new Ketchup(new HotDog());
    }
}
