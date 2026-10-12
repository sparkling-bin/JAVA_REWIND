package TEST_261012.Basic_Grammer;

// 클래스, 객체의 설계도
class Product {
    String name;
    int price;
    int stock;

    // 생성자
    Product(String name, int price, int stock) {
        // this 현재 객체의 필드
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // 객체 수행 기능
    void printInfo() {
        System.out.println(name + " / " + price + "원 / 재고 " + stock);
    }
}

public class Object_Oriented {
    static void main() {

        // 객체 참조 변수, 객체 생성
        Product jacket = new Product("재킷", 30000, 5);
        Product shoes = new Product("등산화", 80000, 3);

        jacket.printInfo();
        shoes.printInfo();
    }

    // 같은 클래스에서 만든 객체라도 각각 다른 상품명과 재고를 가질 수 있음
}
