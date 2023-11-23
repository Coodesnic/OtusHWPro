package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxImpl<N extends Fruit> {
    private List<N> fruits;

    public BoxImpl (N... fruits){
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public List<N> getFruits() {
        return fruits;
    }
    public void putFruit(N fruit){
        this.fruits.add(fruit);
    }
}
