import java.util.Arrays;

public class Mistake_2 {

/**
 Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
 Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном
 порядке.
 Решите задание, но без использования дополнительного массива.
 Напечатайте массив до преобразования и после с помощью
 System.out.println(Arrays.toString(arr));
 Уточнения:
 • Это задание не на сортировку.
 • Не использовать Arrays.sort() и другие способы сортировок.
 • Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
*/

    public static void main(String[] args) {

        int [] arr = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= (arr.length-1)/2; i++) {
            int x = arr[i];
            arr [i] = arr[arr.length-i-1];
            arr [arr.length-i-1] = x;
        }
        System.out.println(Arrays.toString(arr));
    }
}
