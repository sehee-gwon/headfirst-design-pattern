package com.toy.chapter04_factory.abstract_factory.pizza;

import com.toy.chapter04_factory.abstract_factory.ingredient.cheese.Cheese;
import com.toy.chapter04_factory.abstract_factory.ingredient.clams.Clams;
import com.toy.chapter04_factory.abstract_factory.ingredient.dough.Dough;
import com.toy.chapter04_factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.toy.chapter04_factory.abstract_factory.ingredient.sauce.Sauce;
import com.toy.chapter04_factory.abstract_factory.ingredient.veggies.Veggies;

public abstract class Pizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + veggies +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
