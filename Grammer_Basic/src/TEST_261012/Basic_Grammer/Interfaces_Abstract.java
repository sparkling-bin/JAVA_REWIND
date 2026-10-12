package TEST_261012.Basic_Grammer;

// 어떤 기능을 제공해야하는지 약속하는 역할
// 공통 상태나 구현을 제공하면서 일부 동작을 하위 클래스가 구현
interface DiscountPolicy {
    int calculateDiscount(int totalprice);
}

// 구체적인 구현
// 공통구현과 상태를 공유하면서 일부 동작을 미완성으로 남김
class BasicDiscountPolicy implements DiscountPolicy {
    @Override
    public int calculateDiscount(int totalPrice) {
        return totalPrice >= 100000 ? totalPrice / 20:0;
    }
}
public class Interfaces_Abstract {
    static void main() {
        DiscountPolicy policy = new BasicDiscountPolicy();

        int discount = policy.calculateDiscount(120000);
        System.out.println(discount);
    }
}
