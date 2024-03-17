package eg_2024_03_11_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToyAdventure {
    public static void main(String[] args) {
        // Let's pretend these are our toys
        List<String> toys = Arrays.asList("Teddy Bear", "LEGO", "Doll");

        // Creating a Stream from our list of toys
        Stream<String> toyStream = toys.stream();

        // Sorting and printing the toys using Stream
        System.out.println("Sorted toys:");
        toyStream.sorted().forEach(System.out::println);

        // Creating a Stream from an array of toys
        String[] toyArray = {"Teddy Bear", "LEGO", "Doll"};
        Stream<String> toyStreamFromArray = Arrays.stream(toyArray);

        // Creating a Stream from individual toy elements
        Stream<String> individualToyStream = Stream.of("Teddy Bear", "LEGO", "Doll");

        // Filtering and printing only shiny toys from the list
        System.out.println("Shiny toys:");
        toys.stream()
                .filter(toy -> toy.contains("LEGO")) // Let's pretend LEGO is shiny
                .forEach(System.out::println);

        // Counting the total number of toys
        long totalToys = toys.stream().count();
        System.out.println("Total number of toys: " + totalToys);
    }
}
