import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // for(int j=1; j<=N; j++) {
        //     for(int i=1; i<=N; i++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        for(int j=1; j<=N; j++) {
            for(char i = 'A'; i<='A' + N; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
