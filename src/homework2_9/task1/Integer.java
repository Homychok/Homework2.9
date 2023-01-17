package homework2_9.task1;

public class Integer {
    private int number;

    public Integer(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Integer{" +
                "number=" + number +
                '}';
    }
}
