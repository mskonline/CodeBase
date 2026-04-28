package tutorial.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo {
    public StreamsDemo() {
        // Creating a stream
        String[] strings = new String[] {"apple", "banana"};
        final Stream<String> stream = Arrays.stream(strings);

        final Stream<String> stream2 = Stream.of("a", "b", "c");

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("apple");

        final Stream<String> stream3 = list.stream();

        System.out.println(stream.count());
        System.out.println(stream2.count());
        System.out.println(stream3.count());

        // Operations are divided into Intermediate and terminal

        // .distinct() - Intermediate
        // .count() - terminal
        System.out.println("Distinct count: " + list.stream().distinct().count());

        // Iterating
        list.stream().forEach(System.out::println);

    }



    public static void main(String[] args) {
        new StreamsDemo();
    }
}
