package MoreExercises.ME5WhileLoop;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum+=num;
        }
        System.out.printf("%.2f", sum*1.0/n);
    }
}
