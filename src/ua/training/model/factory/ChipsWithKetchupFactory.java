package ua.training.model.factory;

import ua.training.model.dishes.Chips;
import ua.training.model.dishes.Dish;
import ua.training.model.dishes.Ketchup;

public class ChipsWithKetchupFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Ketchup(new Chips());
    }
}
