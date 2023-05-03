package com.toy.chapter03_decorator.starbuzz.step2;

import com.toy.chapter03_decorator.starbuzz.step2.beverage.Beverage;
import com.toy.chapter03_decorator.starbuzz.step2.beverage.DarkRoast;
import com.toy.chapter03_decorator.starbuzz.step2.beverage.Espresso;
import com.toy.chapter03_decorator.starbuzz.step2.beverage.HouseBlend;
import com.toy.chapter03_decorator.starbuzz.step2.decorator.Mocha;
import com.toy.chapter03_decorator.starbuzz.step2.decorator.Soy;
import com.toy.chapter03_decorator.starbuzz.step2.decorator.Whip;

public class StarBuzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.Size.TALL);
        System.out.println("주문하신 " + beverage.getDescription() + " 나왔습니다. 가격은 $" + beverage.cost() + " 입니다.");

        Beverage beverage2 = new DarkRoast(Beverage.Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("주문하신 " + beverage2.getDescription() + " 나왔습니다. 가격은 $" + beverage2.cost() + " 입니다.");

        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend(Beverage.Size.VENTI))));
        System.out.println("주문하신 " + beverage3.getDescription() + " 나왔습니다. 가격은 $" + beverage3.cost() + " 입니다.");
    }
}
