package ua.training.factory;

import ua.training.model.entity.dishes.Chips;
import ua.training.model.entity.dishes.Dish;
import ua.training.model.entity.dishes.Ketchup;

public class ChipsWithKetchupFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Ketchup(new Chips());
    }
}
