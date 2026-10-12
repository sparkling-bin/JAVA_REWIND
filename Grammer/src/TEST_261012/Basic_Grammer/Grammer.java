package TEST_261012.Basic_Grammer;

import java.util.*;

public class Grammer {
    public static void main(String[] args) {
        // List : 순서 있고 중복 허용
        List<String> products = new ArrayList<>();

        products.add("재킷");
        products.add("배낭");
        products.add("재킷");

        System.out.println(products.size());
        System.out.println(products.getFirst());
        System.out.println(products.getLast());
        System.out.println(products.get(1));

        // Set : 중복 제거
        Set<String> productCodes = new HashSet<>();

        productCodes.add("J001");
        productCodes.add("J001");
        productCodes.add("J002");

        System.out.println(productCodes.size());
        System.out.println(productCodes.stream().findFirst());
        System.out.println(productCodes.stream().toList());

        // Map : 키, 값
        Map<String, Integer> stockMap = new HashMap<>();

        stockMap.put("J001", 5);
        stockMap.put("J002", 3);

        System.out.println(stockMap.get("J001")); // key -> value
        System.out.println(stockMap.size());
    }
}
