package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P06RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

        }
    }
}
