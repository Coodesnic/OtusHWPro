package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxImpl<N extends Fruit> {
    private List<N> fruits;


    public BoxImpl(N... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public List<N> getFruits() {
        return fruits;
    }

    public void putFruit(N fruit) {
        this.fruits.add(fruit);
    }

    public boolean compare(BoxImpl<N> box) {
        return this.weight() == box.weight();
    }

    public int weight() {
        int boxWeight = 0;
        for (N fruit : fruits) {
            boxWeight += fruit.weight;
        }
        return boxWeight;
    }

    public void pour (BoxImpl<N> box){
        box.fruits.addAll(this.fruits);
        fruits.clear();
    }

    public void printFruitsWeight() {
        for (N fruit : fruits) {
            System.out.println(fruit.weight);
        }
    }

}
