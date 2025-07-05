import java.util.Scanner;
public class CountingDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=N; i>=1; i--) {
            System.out.println(i);
        }
    }
}
