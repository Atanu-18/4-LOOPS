//Q. print all even numbers till n 

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of (n):");
        int n = sc.nextInt();

        System.out.println("Even no 1 to " + n + " are:");

        for(int i = 2; i <= n; i += 2) {
            System.out.println(i + " ");
        }


        sc.close();
    }
}
