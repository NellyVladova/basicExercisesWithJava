package MoreExercises.DrawingFiguresWithLoops;

public class P01RectangleOf10x10Stars {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
