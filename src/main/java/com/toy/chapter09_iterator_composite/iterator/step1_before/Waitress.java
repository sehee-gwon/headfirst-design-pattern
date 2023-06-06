package com.toy.chapter09_iterator_composite.iterator.step1_before;

import com.toy.chapter09_iterator_composite.MenuItem;

import java.util.List;

public class Waitress {
    List<MenuItem> breakfastMenus;
    MenuItem[] lunchMenus;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.breakfastMenus = pancakeHouseMenu.getMenuItems();
        this.lunchMenus = dinerMenu.getMenuItems();
    }

    public void printMenu() {
        System.out.println("메뉴\n----");
        printBreakfastMenu();
        printLunchMenu();
    }

    public void printBreakfastMenu() {
        System.out.println("\n아침 메뉴");
        for (int i = 0; i<this.breakfastMenus.size(); i++) {
            printMenu(this.breakfastMenus.get(i));
        }
    }

    public void printLunchMenu() {
        System.out.println("\n점심 메뉴");
        for (int i = 0; i<this.lunchMenus.length; i++) {
            printMenu(this.lunchMenus[i]);
        }
    }

    public void printMenu(MenuItem item) {
        System.out.print(item.getName() + ", ");
        System.out.print(item.getPrice() + " -- ");
        System.out.println(item.getDescription());
    }
}
