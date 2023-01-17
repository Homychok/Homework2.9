package homework2_9.task2;

public class Human {
    private String name;
    private String greeting;

    public Human(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
