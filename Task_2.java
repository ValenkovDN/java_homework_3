/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
 */
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrLst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(arrLst);
        int max = max(arrLst);
        int min = min(arrLst);
        int maxItem = arrLst.get(0);
        int minItem = arrLst.get(0);
        int sumItems = 0;
        for (int item : arrLst) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/arrLst.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);
        System.out.println(arrLst);

    }
}
