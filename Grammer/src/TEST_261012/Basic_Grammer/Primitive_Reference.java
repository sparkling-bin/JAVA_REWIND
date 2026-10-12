package TEST_261012.Basic_Grammer;

public class Primitive_Reference {
    public static void main(String[] args) {
        int price = 30000;
        double discountRate = 0.1; // 소숫점
        boolean inAvailable = true; // 참, 거짓
        char grade = 'A'; // 문자 하나

        String productName = "등산 재킷"; // 문자열을 다루는 참조형

        int quantity = 3;
        double total = price * quantity;

        int roundedDown = (int) 10.9; // 소수점 이하 버려짐

        System.out.println(productName);
        System.out.println(total);
        System.out.println(roundedDown);
    }
}
