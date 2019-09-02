package ua.training;



import ua.training.model.dishes.Dish;
import ua.training.model.entity.Client;
import ua.training.model.entity.Order;
import ua.training.model.factory.*;
import ua.training.model.service.RestaurantService;
import ua.training.model.service.RestaurantServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main  {



    public static void main(String[] args) {

        RestaurantService restaurantService = new RestaurantServiceImpl();

        DishFactory hotDogFactory = new HotDogFactory();
        DishFactory hotDogWithKetchupFactory = new HotDogWithKetchupFactory();
        DishFactory hotDogWithMustardFactory=new HotDogWithMustardFactory();
        DishFactory chipsWithKetchupFactoryfactory=new ChipsWithKetchupFactory();


        Dish hotDogWithKetchup = hotDogWithKetchupFactory.createDish();
        Dish hotDogWithMustard=hotDogWithMustardFactory.createDish();
        Dish chipsWithKetchup=chipsWithKetchupFactoryfactory.createDish();

        List<Dish> dishes = new ArrayList<>();
        dishes.add(hotDogWithKetchup);
        dishes.add(hotDogWithMustard);


        Client anton=new Client("Anton");
        Client oleg=new Client("Oleg");

        Order order1=new Order(anton, dishes);
        Order order2 =new Order(oleg, dishes);

        restaurantService.addOrder(order1);
        restaurantService.addOrder(order2);

        restaurantService.prepareOrders();
        restaurantService.consumeOrderS();

        System.out.println(restaurantService.getObservers());

    }


}

