package com.toy.chapter04_factory.abstract_factory;

import com.toy.chapter04_factory.abstract_factory.ingredient.cheese.Cheese;
import com.toy.chapter04_factory.abstract_factory.ingredient.cheese.ReggianoCheese;
import com.toy.chapter04_factory.abstract_factory.ingredient.clams.Clams;
import com.toy.chapter04_factory.abstract_factory.ingredient.clams.FreshClams;
import com.toy.chapter04_factory.abstract_factory.ingredient.dough.Dough;
import com.toy.chapter04_factory.abstract_factory.ingredient.dough.ThinCrustDough;
import com.toy.chapter04_factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.toy.chapter04_factory.abstract_factory.ingredient.pepperoni.SlicedPepperoni;
import com.toy.chapter04_factory.abstract_factory.ingredient.sauce.MarinaraSauce;
import com.toy.chapter04_factory.abstract_factory.ingredient.sauce.Sauce;
import com.toy.chapter04_factory.abstract_factory.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
