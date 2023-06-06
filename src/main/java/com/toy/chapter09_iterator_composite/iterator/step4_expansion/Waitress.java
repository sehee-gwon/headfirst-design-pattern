package com.toy.chapter09_iterator_composite.iterator.step4_expansion;

import com.toy.chapter09_iterator_composite.MenuItem;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println("메뉴\n----");
        printBreakfastMenu();
        printLunchMenu();
        printDinnerMenu();
    }

    public void printBreakfastMenu() {
        System.out.println("\n아침 메뉴");
        printMenu(this.pancakeHouseMenu.createIterator());
    }

    public void printLunchMenu() {
        System.out.println("\n점심 메뉴");
        printMenu(this.dinerMenu.createIterator());
    }

    public void printDinnerMenu() {
        System.out.println("\n저녁 메뉴");
        printMenu(this.cafeMenu.createIterator());
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}