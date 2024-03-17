package eg_2024_03_11_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EG_04_stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        nums.forEach(o->  System.out.println(o));
    }
}
