package Animal;

import Food.Food;
import Food.CarnivoreFood;
import Food.VegetableFood;

public abstract class Carnivorous extends Animal {
    private String name;
    private int age;

    public Carnivorous(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void eat(Food food) {
        if(food instanceof CarnivoreFood) {
            System.out.println("Спасибо. Очень вкусная " + ((CarnivoreFood) food).getTypeCarnivoreFood());
        }
        else if(food instanceof VegetableFood) {
            System.out.println("Ужас. Я эту гадость не ем");
        }
    }
}
