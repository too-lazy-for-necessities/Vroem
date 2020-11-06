package be.intecbrussel.fundamentals.restaurant.app;

import be.intecbrussel.fundamentals.restaurant.model.Allergen;
import be.intecbrussel.fundamentals.restaurant.model.Ingredient;
import be.intecbrussel.fundamentals.restaurant.model.MenuItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Data {

    public static MenuItem[] menuItems;

    static {
        //pomme perdu
        MenuItem pommePerdu = new MenuItem("pomme perdu",10);
        Ingredient potato = new Ingredient("potato");
        potato.addAllergen(Allergen.GLUTEN);
        Ingredient sugar = new Ingredient("sugar");
        Ingredient egg = new Ingredient("egg");
        egg.addAllergen(Allergen.EGG);
        pommePerdu.addIngredient(potato);
        pommePerdu.addIngredient(sugar);
        pommePerdu.addIngredient(egg);
        //crabsalade
        MenuItem crabsalade = new MenuItem("crabsalade",8);
        Ingredient crab = new Ingredient("crab");
        potato.addAllergen(Allergen.CRUSTACEAN);
        Ingredient salad = new Ingredient("sugar");
        Ingredient mayonaise = new Ingredient("mayonaise");
        mayonaise.addAllergen(Allergen.MILK);
        mayonaise.addAllergen(Allergen.EGG);

        crabsalade.addIngredient(crab);
        crabsalade.addIngredient(salad);
        crabsalade.addIngredient(mayonaise);

        //frietjes
        MenuItem frietjes = new MenuItem("frietjes",4);
        frietjes.addIngredient(potato);

        menuItems = new MenuItem[]{pommePerdu,crabsalade,frietjes};


    }



}
