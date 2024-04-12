package org.launchcode;

public class Main {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("Jollof Rice", "The most popular West African dish", 10, "main course");
        MenuItem item2 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.50, "main course");
        MenuItem item3 = new MenuItem("Pounded Yam", "This food is made by pounding yam in a morter", 15, "main course");
        MenuItem item4 = new MenuItem("Apple Pie", "A fruit pie principally filled with apples", 5.25, "dessert");
        MenuItem item5 = new MenuItem("Suya", "Well spiced smoked meat", 4.99, "appetizer");

//        System.out.println(item1.isNew());
//
//        System.out.println(item1);

        //Create menu

        Menu menu = new Menu();

        //Add items to menu and print

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        //Remove items from menu and print

        menu.removeItem(item2);
        System.out.println(menu);

        //Test equals method

        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Suya", "Well spiced smoked meat", 4.99, "appetizer");
        System.out.println(item5.equals(item6));


    }
}
