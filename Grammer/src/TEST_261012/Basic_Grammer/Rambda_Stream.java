package TEST_261012.Basic_Grammer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rambda_Stream {
    public static void main(String[] args) {
        List<Integer> stocks = Arrays.asList(3, 0, 7, 2, 0, 5);

        // 특정 데이터를 필터링하거나 가공할 때 자주 사용함
        List<Integer> availableStocks = stocks.stream() // 컬렉션 데이터를 처리할 수 있는 스트림 생성
                .filter(stock -> stock > 0) // 조건에 맞는 요소만 선택
                .collect(Collectors.toList()); // 처리 결과 컬렉션 모음

        System.out.println(availableStocks);

        List<Integer> prices = Arrays.asList(10000, 20000, 30000);

        int total = prices.stream()
                .mapToInt(price -> price) // 다른 형태로 변환
                .sum(); // 결과 모으기, 집계하기

        System.out.println(total);
    }
}
