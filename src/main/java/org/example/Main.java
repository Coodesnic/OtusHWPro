package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BoxImpl<Fruit> box1 = new BoxImpl<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Apple apple1 = new Apple(3);

        box1.putFruit(orange1);
        box1.putFruit(apple1);
        System.out.print(box1.getFruits());
        box1.printFruits();
        System.out.print(orange1.getClass());
        //TODO: добавить методы в интерфейс и проверить их в main
    }
}
