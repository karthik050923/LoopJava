public class Demo1 {
    public static void main(String[] args) {
        for(int j=1; j<=5; j++) {
            for(int k=1; k<=5; k++) {
                System.out.print("- ");
            }
            for(int i=1; i<=j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
