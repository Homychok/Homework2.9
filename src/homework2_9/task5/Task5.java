package homework2_9.task5;

import java.util.function.Function;
import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        Integer x = (int) (Math.random() * 101);
        Predicate<Integer> predicate = integer -> integer >= 0;
        Function<Integer, String> function1 = integer -> integer + " положительное";
        Function<Integer, String> function2 = integer -> integer + " отрицательнок";
        if (predicate.test(x)) {
            System.out.println(function1.apply(x));
        } else {
            System.out.println(function2.apply(x));
        }
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (T) -> {
            if (condition.test(T)) {
                return (U) ifTrue;
            } else {
                return (U) ifFalse;
            }
        };
    }
}
