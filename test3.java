import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }

        System.out.println(product);

        sc.close();
    }
}
