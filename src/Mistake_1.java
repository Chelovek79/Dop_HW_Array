import java.util.Arrays;

public class Mistake_1 {

/**
 У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
 Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
 Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном
 порядке.
 Нам дан массив чисел: {5, 4, 3, 2, 1}
 Необходимо привести его к виду: {1, 2, 3, 4, 5}
 Решите задачу с использованием дополнительного массива.
 Напечатайте массив до преобразования и после с помощью
 System.out.println(Arrays.toString(arr));
 */

    public static void main(String[] args) {

        int [] first = {5, 4, 3, 2, 1};
        int [] second = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            second [i] = first[first.length-1-i];
        }
        System.out.println(Arrays.toString(first) + "\n"+ Arrays.toString(second));
    }
}
