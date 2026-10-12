package TEST_261012.Basic_Grammer;

public class Method {
    public static int calculateTotal(int price, int quantity) {
        return price * quantity;
    }

    public static void printProduct(String name) { // 변환값 없음
        System.out.println("상품명: " + name);
    }

    static void main() {
        int total = calculateTotal(30000, 3);
        System.out.println(total);
        printProduct("등산 재킷");
    }
}
