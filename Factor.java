public class Factor {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        while (number > 0) {
            number *= factorial;
            number--;
        }
        System.out.println(factorial);
    }
}