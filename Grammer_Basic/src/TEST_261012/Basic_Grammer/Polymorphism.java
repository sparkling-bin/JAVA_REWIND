package TEST_261012.Basic_Grammer;

class Product_4 {
    public void printType() {
        System.out.println("일반 상품");
    }
}

class Clothing extends Product_4 {
    @Override
    public void printType() {
        System.out.println("의류 상품");
    }
}

class Equipment extends Product_4 {
    @Override
    public void printType() {
        System.out.println("장비 상품");
    }
}

public class Polymorphism {
    static void main() {
        Product_4[] product4s = {
                new Clothing(),
                new Equipment()
        };

        for (Product_4 product4 : product4s) {
            product4.printType();
        }
    }
}
