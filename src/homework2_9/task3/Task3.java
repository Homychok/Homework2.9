package homework2_9.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Double number1 = new Double(2.1);
        Double number2 = new Double(7.7);
        Double number3 = new Double(15.4);
        Double number4 = new Double(1.9);
        Double number5 = new Double(10.3);

        List<Double> numberList = new ArrayList<>();
        numberList.add(number1);
        numberList.add(number2);
        numberList.add(number3);
        numberList.add(number4);
        numberList.add(number5);

        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return new Long(Math.round(aDouble.doubleValue()));
            }
        };
        for (Double number : numberList) {
            System.out.println(function1.apply(number));
        }
        System.out.println("____________________");
        Function<Double, Long> function2 = (Double aDouble) -> new Long(Math.round(aDouble.doubleValue()));
        for (Double number : numberList) {
            System.out.println(function2.apply(number));
        }
    }
}

