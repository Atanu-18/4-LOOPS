//Q. print the table of a number input by the user 

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }

        sc.close();
    }
}
