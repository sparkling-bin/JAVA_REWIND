package TEST_261012.Basic_Grammer;

import java.util.Optional;

public class Null_Optional {
    static void main() {
        String productName = null;

        if(productName != null) {
            System.out.println(productName.length());
        } else {
            System.out.println("상품명 없음");
        }

        // 값이 없을 수 있다는 사실을 명시적으로 표현할 때 사용 가능
        Optional<String> productName2 = Optional.ofNullable(null);

        String result = productName2.orElse("이름 없는 상품");

        System.out.println(result);
    }
}
