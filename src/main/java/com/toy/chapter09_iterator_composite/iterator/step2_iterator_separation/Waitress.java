package com.toy.chapter09_iterator_composite.iterator.step2_iterator_separation;

import com.toy.chapter09_iterator_composite.MenuItem;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("메뉴\n----");
        printBreakfastMenu();
        printLunchMenu();
    }

    public void printBreakfastMenu() {
        System.out.println("\n아침 메뉴");
        printMenu(this.pancakeHouseMenu.createIterator());
    }

    public void printLunchMenu() {
        System.out.println("\n점심 메뉴");
        printMenu(this.dinerMenu.createIterator());
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}