/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrLst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(arrLst);
        int i = 0;
        while (i < arrLst.size()) {
            if (arrLst.get(i) % 2 == 0) {
                arrLst.remove(i);
            }
            i++;
        }
        System.out.println(arrLst);

    }
}
