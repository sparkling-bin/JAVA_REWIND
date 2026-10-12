package TEST_261012.Basic_Grammer;

// T는 타입을 나타내는 매개변수
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// 클래스나 메서드가 다룰 데이터 타입을 유연하게 지정
public class Generics {
    static void main() {
        Box<String> nameBox = new Box<>(); // String 타입을 사용하겠다 선언
        nameBox.set("등산 재킷");

        String name = nameBox.get();

        System.out.println(name);
    }
}
