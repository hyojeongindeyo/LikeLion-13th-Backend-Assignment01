package java_basic1.LikeLion_13th_Backend_Assignment01.honghyojeong.BOJ2439Prac;//현재 클래스가 속한 패키지

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
