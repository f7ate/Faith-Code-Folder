public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("4 double is " + numDouble(4));
        System.out.println("2 double is " + numDouble(2));
        System.out.println("17 double is " + numDouble(17));
        System.out.println("1347 double is " + numDouble(1347));

    }

    public static int numDouble(int num) {
        int ans = num * 2;

        return ans;
    }
}
