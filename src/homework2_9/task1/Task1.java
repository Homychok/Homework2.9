package homework2_9.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {

    public static void main(String[] args) {
        Integer number1 = new Integer(2);
        Integer number2 = new Integer(7);
        Integer number3 = new Integer(-15);
        Integer number4 = new Integer(-1);
        Integer number5 = new Integer(10);

        List<Integer> numberList = new ArrayList<>();
        numberList.add(number1);
        numberList.add(number2);
        numberList.add(number3);
        numberList.add(number4);
        numberList.add(number5);

        Predicate<Integer> predicate1 = number -> {
            if (number.getNumber() >= 0) {
                return true;
            } else {
                return false;
            }
        };

    Predicate <Integer> predicate2 = new Predicate<Integer>() {
        @Override
        public boolean test(Integer number) {
            if (number.getNumber() >= 0) {
                return true;
            } else {
                return false;
            }
        }
    };
        System.out.println(numberList);
        for (Integer number : numberList) {
            predicate1.test(number);
            System.out.println(predicate1.test(number));
        }
        System.out.println("__________________________");
        for (Integer number : numberList) {
            predicate2.test(number);
            System.out.println(predicate2.test(number));
        }
    }
}


