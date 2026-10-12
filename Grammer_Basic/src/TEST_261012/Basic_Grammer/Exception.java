package TEST_261012.Basic_Grammer;

public class Exception {

    static int divide(int a, int b) throws IllegalAccessException {
        if (b == 0) {
            throw new IllegalAccessException("0으로 나눌 수 없습니다."); // 예외를 직접 발생시킴
        }
         return a / b;
    }

    static void main() {
        try { // 예외 발생 코드 실행
            int result = divide(10, 2);
            System.out.println(result);
        } catch (IllegalAccessException e) { // 예외 처리
            System.out.println("계산 실패: " + e.getMessage());
        }
    }
}
