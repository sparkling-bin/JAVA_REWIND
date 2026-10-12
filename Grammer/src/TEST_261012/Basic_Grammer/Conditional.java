package TEST_261012.Basic_Grammer;

public class Conditional {
    static void main() {
        int stock = 5;

        if(stock > 0) {
            System.out.println("판매 가능");
        } else if (stock == 0) {
            System.out.println("품절");
        } else {
            System.out.println("재고 데이터 오류");
        }

        String orderStatus = "SHIPPED";

        switch (orderStatus) {
            case "READY" :
                System.out.println("배송 준비 중");
                break;
            case "SHIPPED" :
                System.out.println("배송 준비 중");
                break;
            case "DELIVERED" :
            System.out.println("배송 준비 중");
            break;

            default:
                System.out.println("알 수 없는 상태");
        }
    }
}
