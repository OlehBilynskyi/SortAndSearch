package app;
//Імпортуємо класи для роботи з масивами та випадковими числами
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//Задаємо розмір масиву
        int size = 10;
        //Створюємо масив цілих чисел
        int[] array = new int[size];
        //Створюємо об'єкт Random для генерації випадкових чисел
        Random random = new Random();
//Заповнюємо масив випадковими числами від 0 до 99
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
//Виводимо оригінальний (не відсортований) масив
        System.out.println("Original array: " + Arrays.toString(array));
//Викликаємо метод сортування злиттям та виводимо відсортований масив
        MergeSorter.mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
//Випадково обираємо елемент з відсортованого масиву для пошуку
        int target = array[random.nextInt(size)];
        System.out.println("Searching for: " + target);
//Викликаємо метод бінарного пошуку
        int result = BinarySearcher.binarySearch(array, target);
        //Перевіряємо чи знайшли елемент
        if (result != -1) {
            //Якщо знайшли, виводимо його індекс, якщо не знайшли, то повідомляємо про це
            System.out.println("Value " + target + " found at index: " + result);
        } else {
            System.out.println("Value " + target + " not found.");
        }
    }
}
