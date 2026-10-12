package TEST_261012.Problem_Solving;

import java.util.Scanner;

public class Q1 {

    public static int solution(int a, int b, boolean flag) {
        if(flag == true) {
            return 0;
        } else {
            return 1;
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean f = scanner.nextBoolean();

        int result = solution(a, b, f);

        if(result == 0) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }

    }
}
