package eg_2024_03_11_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EG_06_stream_filter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Stream s1 = nums.stream()
        .filter(n -> n%2==0);

        s1.forEach(n-> System.out.println(n));
    }
}
