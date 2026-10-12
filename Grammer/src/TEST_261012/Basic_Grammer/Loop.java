package TEST_261012.Basic_Grammer;

public class Loop {
    static void main() {
        int[] stocks = {3, 5, 0, 8};
        int totalStock = 0;

        // 반복 횟수, 배열 순회 명확
        for(int i = 0; i < stocks.length; i++) {
            totalStock += stocks[i];
        }

        System.out.println(totalStock);

        // 배열의 값만 읽을 때
        for (int stock : stocks) {
            System.out.println(stock);
        }

        int count = 3;

        // 조건이 참일 경우에만
        while (count > 0) {
            System.out.println(count);
            count--;
        }
    }
}
