package eg_2024_03_11_streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EG_01_stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println(o);
            }
        };

        nums.forEach(con);
    }
}
