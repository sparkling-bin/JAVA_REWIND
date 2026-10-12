package TEST_261012.Basic_Grammer;

// 재고를 외부에서 마음대로 설정하면 문제가 생길 가능성이 있음
class Product_2 {
    private String name;
    private int stock; // 외부에서 직접 변경 X

    Product_2(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    // 재고 검증 규칙, 판매 규칙에 따라 재고 변경
    public boolean sell(int quantity) {
        if(quantity <= 0 || quantity > stock) {
            return false;
        }

        stock -= quantity;
        return true;
    }
}

public class Encapsulation {
    static void main() {
        Product_2 product2 = new Product_2("재킷", 5);
        boolean sucess = product2.sell(6);

        System.out.println(sucess);
        System.out.println(product2.getStock());
    }
}
