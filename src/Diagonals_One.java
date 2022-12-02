import java.util.Scanner;

public class Diagonals_One {

/**
 Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали
 матрицы и напечатайте ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любую цифру - ");
        int Number = in.nextInt();
        int [] [] Matrix = new int[3][3];
        byte n = 0;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix [i].length; j++) {
                if (n % 2 ==0) {
                    Matrix[i][j] = Number;
                } else {
                    Matrix [i] [j] = 0;
                }
                n++;
            }
        }
        for (int [] row : Matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}