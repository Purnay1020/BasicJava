public class throwexample {
    public static void Age( int a) {
        if (a<18) {
            throw new IllegalArgumentException("age should be 18 above");

        }
        System.out.println(" valid age " + a);

    }

    public static void main(String[] args) {
        Age(22);
        System.out.println("not valid age");
    }
}
