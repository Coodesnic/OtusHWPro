package org.example;

public class Main {
    public static void main(String[] args) {

        BoxImpl<Orange> orangeBox1 = new BoxImpl<>();
        BoxImpl<Orange> orangeBox2 = new BoxImpl<>();
        BoxImpl<Apple> appleBox = new BoxImpl<>();

        Orange orange = new Orange();
        Orange orangeCustom = new Orange(4);
        Apple apple = new Apple();
        Apple appleCustom = new Apple(3);

        for (int i = 0; i < 3; i++) {
            orangeBox1.putFruit(orange);
        }
        orangeBox1.putFruit(orangeCustom);
        for (int i = 0; i < 3; i++) {
            appleBox.putFruit(apple);
        }
        appleBox.putFruit(appleCustom);

        System.out.println(orangeBox1.compare(orangeBox2));
        orangeBox1.pour(orangeBox2);
        orangeBox2.printFruitsWeight();

    }
}
