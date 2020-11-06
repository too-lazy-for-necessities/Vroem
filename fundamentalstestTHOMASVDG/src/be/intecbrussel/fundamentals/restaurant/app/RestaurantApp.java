package be.intecbrussel.fundamentals.restaurant.app;

import be.intecbrussel.fundamentals.restaurant.model.MenuItem;
import be.intecbrussel.fundamentals.restaurant.service.RestaurantService;
import be.intecbrussel.fundamentals.restaurant.service.RestaurantServiceImpl;

public class RestaurantApp {

    public static void main(String[] args) {

        RestaurantService restaurantService = new RestaurantServiceImpl();
        for (MenuItem menuItem:Data.menuItems){

            restaurantService.addToMenu(menuItem);

        }
        //print de menu

        //print de op naam gesorteerde menu

        //print de op prijs gesoorteerde menu

        //print menu zonder de alergenen: ei of krab

        //maak zelf een MenuItem instance en voeg deze toe aan het menu van je restaurantservice

        //print de menu (een tweede keer)

    }

}
