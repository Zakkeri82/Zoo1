import Animal.*;
import Cage.CageForCarnivorous;
import Cage.CageForHerbivore;
import Food.Carrot;
import Food.Meat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CageForCarnivorous cage1 = new CageForCarnivorous(10);
        cage1.addAnimal(new Bear("Сеня", 2));
        cage1.addAnimal(new Tiger("Полосатый", 3));
        cage1.addAnimal(new Duck("Кря", 2));
        cage1.addAnimal(new Duck("Кри", 3));

        CageForHerbivore cage2 = new CageForHerbivore(6);
        cage2.addAnimal(new Camel("Яшка", 5));
        cage2.addAnimal(new Rabbit("Демон", 2));
        cage2.addAnimal(new Rabbit("Демоница", 2));

        System.out.println("Вы вошли в зоопарк. Выберете куда пойти к хищникам(1) или к травоядным(2)");
        try {
            int number = Integer.parseInt(reader.readLine());
            if (number == 1) {
                System.out.println("Вы зашли к хищникам, давайте покормим их");
                cage1.feedAnimal(new Meat(500));
            } else if (number == 2) {
                System.out.println("Вы зашли к травоядным");
                cage2.feedAnimal(new Carrot(50));
            }
        } catch (IOException e) {
            System.out.println("Это не 1 и не 2");
            e.printStackTrace();
        }
    }
}
