package eg_2024_03_11_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EG_08_stream_flter_map_meaningful_Example {
    public static void main(String[] args) {
        // Let's pretend these are our toy cars with colors
        List<String> toysList = Arrays.asList("Red Car", "Blue Car", "Green Car", "Red toy", "Yellow Car");

        // Filtering out toy cars that are not red
        List<String> redToys = toysList.stream()
                .filter(toy -> toy.startsWith("Red"))
                .collect(Collectors.toList());

        // Transforming remaining toy cars into sentences
        List<String> redToyDescriptions = redToys.stream()
                .map(car -> "I want to buy a " + car)
                .collect(Collectors.toList());

        // Printing the transformed sentences
        redToyDescriptions.forEach(System.out::println);
    }
}
