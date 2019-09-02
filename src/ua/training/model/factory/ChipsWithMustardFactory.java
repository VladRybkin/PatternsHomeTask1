package ua.training.model.factory;

import ua.training.model.dishes.Chips;
import ua.training.model.dishes.Dish;
import ua.training.model.dishes.Mustard;

public class ChipsWithMustardFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Mustard(new Chips());
    }
}
