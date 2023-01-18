package homework2_9.task3;

public class Number {
    private Double number;

    public Number(Double number) {
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }

//    public void setNumber(Double number) {
//        this.number = number;
//    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
