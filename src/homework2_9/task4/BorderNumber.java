package homework2_9.task4;

public class BorderNumber {
    private Integer number;
//    public Integer borderNumberMin = 0;
//    public Integer borderNumberMax = 100;

    public BorderNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "BorderNumber{" +
                "number=" + number +
                '}';
    }
}
