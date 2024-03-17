package eg_2024_03_11_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EG_05_stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Stream s1 = nums.stream();
        s1.forEach(n-> System.out.println(n));

        //you can not reuse the stream, its water stream once gone, it not going to be used again
        //uncomment give you error
        //java.lang.IllegalStateException: stream has already been operated upon or closed
        //s1.forEach(n-> System.out.println(n));

    }
}
