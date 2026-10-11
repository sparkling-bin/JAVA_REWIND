public class Basics {
    public static void main(String[] args) {
        int age = 28;
        long big = 10_000_000_000L;
        double pi = 3.14;
        char c = 'A';
        String name = "heyhehy";

        String json = """
                { "name" : "hehy",
                "age" : 28 }
                """;

        System.out.println(name + "/" + age);
        System.out.println(json);
    }
}
