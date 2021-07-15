public class Person {
    public static boolean isTeenager(int age) throws Exception {
        boolean result;
        if (age < 19) {
            result = true;
        }
        else if (age < 0) {
            throw new IllegalArgumentException("error");
        }
        else {
            result = false;
        }
        return result;
    }
}