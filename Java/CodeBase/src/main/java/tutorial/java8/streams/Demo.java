package tutorial.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Intermediate operations: filter(), map(), sort(), distinct(), limit()
        // Terminal operations: collect(), forEach(), reduce(), count()

        // Double each number
        numbers.stream().map(a -> a * 2).forEach(System.out::println);

        // Count even numbers
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println(count);
    }
}
