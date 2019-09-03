package ua.training.factory;

import ua.training.model.entity.dishes.Chips;
import ua.training.model.entity.dishes.Dish;
import ua.training.model.entity.dishes.Mustard;

public class ChipsWithMustardFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Mustard(new Chips());
    }
}
