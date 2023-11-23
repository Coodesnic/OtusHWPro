package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BoxImpl box1 = new BoxImpl<>();
        Orange orange1 = new Orange();
        Apple apple1 = new Apple();

        box1.putFruit(orange1);
        box1.putFruit(apple1);
        System.out.print(box1.getFruits());
        //TODO: разобраться с тем как использовать дженерики в main и как ограничить коробку только на один фрукт
        //TODO: реализовать методы по заданию + добавить их в интерфейс
    }
}