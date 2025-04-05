package BOJ2439Prac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(1<=n && n<=100) {
            for(int i=0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        scanner.close();

    }

}
