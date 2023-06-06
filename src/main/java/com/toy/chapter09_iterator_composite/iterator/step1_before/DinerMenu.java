package com.toy.chapter09_iterator_composite.iterator.step1_before;

import com.toy.chapter09_iterator_composite.MenuItem;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
        addItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
        addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
        addItem("찐 채소와 브라운 라이스", "찐 채소와 브라운 라이스의 절묘한 조화", true, 3.99);
        addItem("파스타", "마리나라 소스 스파게티, 효모빵도 드립니다.", true, 3.89);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (this.numberOfItems >= MAX_ITEMS) {
            System.out.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        } else {
            this.menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
            this.numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return this.menuItems;
    }
}
