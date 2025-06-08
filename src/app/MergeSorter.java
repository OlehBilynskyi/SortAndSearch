package app;
//Імпортуємо клас Arrays, щоб використовувати метод copyOfRange

import java.util.Arrays;

public class MergeSorter {
    //Створюємо метод який приймає масив цілих чисел для сортування
    public static void mergeSort(int[] array) {
        //Якщо довжина масиву <= 1, він вже відсортований, тож нічого не робимо
        if (array.length <= 1) {
            return;
        }
//Ділимо масив на дві частини
        int mid = array.length / 2;
        //Копіюємо ліву половину масиву у новий масив left
        int[] left = Arrays.copyOfRange(array, 0, mid);
        //Копіюємо праву половину масиву у новий масив right
        int[] right = Arrays.copyOfRange(array, mid, array.length);
//Рекурсивно сортуємо ліву та праву половину
        mergeSort(left);
        mergeSort(right);
//Об'єднаємо дві відсортовані половини назад в один масив
        merge(array, left, right);
    }

    //Створюємо метод, який виконує злиття двох відсортованих частин в один масив
    private static void merge(int[] array, int[] left, int[] right) {
        //Ініціалізуємо індекси для лівої, правої частин та головного масиву
        int i = 0;
        int j = 0;
        int k = 0;
//Поки у лівій та правій частині залишаються елементи, порівнюємо їх
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                //Якщо елемент з лівої частини менший або рівний - вставляємо його
                array[k++] = left[i++];
            } else {
                //Інакше вставляємо елемент з правої частини
                array[k++] = right[j++];
            }
        }
//Якщо у лівій частині ще залишились елементи, додаємо їх у масив
        while (i < left.length) {
            array[k++] = left[i++];
        }

        //Якщо у правій частині ще залишились елементи, додаємо їх у масив
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}