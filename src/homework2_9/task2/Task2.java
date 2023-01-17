package homework2_9.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task2 {
    public static void main(String[] args) {
        Human person1 = new Human("Max", "Hello everyone");
        Human person2 = new Human("Ann", "Hey");
        Human person3 = new Human("Kate", "Hi");
        Human person4 = new Human("Fred", "Bonjor");
        Human person5 = new Human("Alice", "Grattulere med daggen");

        List<Human> humanList = new ArrayList<>();
        humanList.add(person1);
        humanList.add(person2);
        humanList.add(person3);
        humanList.add(person4);
        humanList.add(person5);
        Consumer<Human> consumer1 = new Consumer<Human>() {
            @Override
            public void accept(Human person) {
            }

        };
        for (Human person : humanList) {
            System.out.println(person.getName() + " - " + person.getGreeting());
        }

        Consumer<Human> consumer2 = (person) -> System.out.println(person.getName() + " - " + person.getGreeting());
        System.out.println("_________________");
        for (Human person : humanList) {
            System.out.println(person.getName() + " - " + person.getGreeting());
        }

    }
}

