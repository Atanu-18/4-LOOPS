//Q. print the sum of first 'n' natural no's

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

        sc.close();
    }
}
