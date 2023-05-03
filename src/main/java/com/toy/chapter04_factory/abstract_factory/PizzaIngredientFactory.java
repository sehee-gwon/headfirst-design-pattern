package com.toy.chapter04_factory.abstract_factory;

import com.toy.chapter04_factory.abstract_factory.ingredient.cheese.Cheese;
import com.toy.chapter04_factory.abstract_factory.ingredient.clams.Clams;
import com.toy.chapter04_factory.abstract_factory.ingredient.dough.Dough;
import com.toy.chapter04_factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.toy.chapter04_factory.abstract_factory.ingredient.sauce.Sauce;
import com.toy.chapter04_factory.abstract_factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
