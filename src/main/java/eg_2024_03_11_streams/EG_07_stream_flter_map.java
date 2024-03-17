package eg_2024_03_11_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EG_07_stream_flter_map {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> s1 = nums.stream();

        Stream<Integer> s2= s1.filter(n -> n%2==0);

        // map used to transform your data, into some meaningful
        Stream<Integer> s3= s2.map(n -> n*2).filter(n->n>10);

        s3.forEach(n-> System.out.println(n));
    }
}
