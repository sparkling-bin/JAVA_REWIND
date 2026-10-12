package TEST_261012.Basic_Grammer;

public class Array {
    static void main() {
        String[] products = {"재킷", "등산화", "배낭"};

        System.out.println(products[0]);
        System.out.println(products.length);

        String name = products[0];
        String status = new String("READY");

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(products[0].contains("킷"));
        System.out.println(name.substring(0, 1));
        System.out.println(name.equals("재킷"));
        System.out.println(status == "READY"); // 참조
    }
}
