package ua.training.model.entity;

import ua.training.model.dishes.Dish;
import ua.training.model.dishes.HotDog;

import java.util.HashMap;
import java.util.Map;

public class ProductWarehouse {
    private static ProductWarehouse productWarehouse;
    private final Map<String, Dish> dishes=new HashMap<>();



   private  ProductWarehouse() {

    }

    public static ProductWarehouse getProductWarehouse(){
       if (productWarehouse==null){
           System.out.println("creating productWarehouse");
           productWarehouse=new ProductWarehouse();
       }

       return productWarehouse;
    }




}
