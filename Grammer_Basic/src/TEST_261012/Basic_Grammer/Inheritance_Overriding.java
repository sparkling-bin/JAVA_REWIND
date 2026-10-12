package TEST_261012.Basic_Grammer;

class Product_3 {
    protected String name; // 같은 패키지, 상속 관계 등에서 접근할 수 있는 제어자

    Product_3(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("상품: " + name );
    }
}

class OutdoorProduct extends Product_3 {
    OutdoorProduct(String name) {
        super(name); // 부모 클래스 생성자 호출
    }

    @Override // 메서드 재정의, 상속받은 메서드의 동작을 바꾸는 데 사용
    public void printInfo() {
        System.out.println("아웃도어 상품: " + name);
    }
}

public class Inheritance_Overriding {

    static void main() {
        Product_3 product3 = new Product_3("등산 재킷");
        product3.printInfo();

        // 오버라이딩
        Product_3 product4 = new OutdoorProduct("등산 재킷");
        product4.printInfo();
    }
}
