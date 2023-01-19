package homework2_9.task4;

import homework2_9.task4.BorderNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Task4 {
    public static void main(String[] args) {
//        Integer borderNumberMax = 100;
//
//        BorderNumber number1 = new BorderNumber((int) (Math.random() * (borderNumberMax + 1)));
//        BorderNumber number2 = new BorderNumber((int) (Math.random() * (borderNumberMax + 1)));
//        BorderNumber number3 = new BorderNumber((int) (Math.random() * (borderNumberMax + 1)));
//        BorderNumber number4 = new BorderNumber((int) (Math.random() * (borderNumberMax + 1)));
//        BorderNumber number5 = new BorderNumber((int) (Math.random() * (borderNumberMax + 1)));
//
//        List<Integer> numberRandomList = new ArrayList<>();
//        numberRandomList.add(number1.getNumber());
//        numberRandomList.add(number2.getNumber());
//        numberRandomList.add(number3.getNumber());
//        numberRandomList.add(number4.getNumber());
//        numberRandomList.add(number5.getNumber());
        //    private double borderNumberMax;
        Supplier<BorderNumber> supplier1 = new Supplier<BorderNumber>() {
            @Override
            public BorderNumber get() {
                return new BorderNumber((int) (Math.random() * 101));
            }
        };
        System.out.println(supplier1.get());
        System.out.println("____________________");
        Supplier<BorderNumber> supplier2 = () -> new BorderNumber((int) (Math.random() * 101));
                System.out.println(supplier2.get());
    }
}



