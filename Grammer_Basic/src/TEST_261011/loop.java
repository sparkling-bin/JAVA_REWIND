package TEST_261011;

import java.util.List;

public class loop {
    public static void main() {
        for(String a : List.of("a", "b", "c")) {
            System.out.println(a);
        }

        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
    }
}
