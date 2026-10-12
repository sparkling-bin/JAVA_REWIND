package TEST_261012.Basic_Grammer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grammer_2 {

    static void main(String[] args) {
        List<String> soldProduct = Arrays.asList(
                "J001", "B001", "J001", "J001"
        );

        Map<String, Integer> salesCount = new HashMap<>();

        for(String code : soldProduct) {
            salesCount.put(
                    code,
                    salesCount.getOrDefault(code, 0) + 1
            );
        }

        System.out.println(salesCount);
    }
}
