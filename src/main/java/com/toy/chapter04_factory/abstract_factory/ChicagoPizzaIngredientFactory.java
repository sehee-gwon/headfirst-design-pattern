package com.toy.chapter04_factory.abstract_factory;

import com.toy.chapter04_factory.abstract_factory.ingredient.cheese.Cheese;
import com.toy.chapter04_factory.abstract_factory.ingredient.cheese.MozzarellaCheese;
import com.toy.chapter04_factory.abstract_factory.ingredient.clams.Clams;
import com.toy.chapter04_factory.abstract_factory.ingredient.clams.FrozenClams;
import com.toy.chapter04_factory.abstract_factory.ingredient.dough.Dough;
import com.toy.chapter04_factory.abstract_factory.ingredient.dough.ThickCrustDough;
import com.toy.chapter04_factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.toy.chapter04_factory.abstract_factory.ingredient.pepperoni.SlicedPepperoni;
import com.toy.chapter04_factory.abstract_factory.ingredient.sauce.PlumTomatoSauce;
import com.toy.chapter04_factory.abstract_factory.ingredient.sauce.Sauce;
import com.toy.chapter04_factory.abstract_factory.ingredient.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
