public class All_Numbers_Summ {

/**
 Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
 Найдите все пары чисел, сумма которых равна −2.
 Напечатайте их в консоль.
*/

    public static void main(String[] args) {

        int [] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int n = 0;
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = 1 + i; j <= arr.length-1; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " + " + arr[j] + " = -2");
                    n++;
                }
            }
        }
    }
}
