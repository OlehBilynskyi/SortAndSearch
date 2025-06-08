package app;

public class BinarySearcher {
    //Створюємо метод, який приймає масив та значення пошуку
    public static int binarySearch(int[] array, int target) {
        //Ініціалізуємо межі пошуку: ліва та права границі
        int left = 0;
        int right = array.length - 1;
//Поки ліва межа не перевищила праву, виконуємо пошук
        while (left <= right) {
            //Обчислюємо індекс середини масиву
            int mid = left + (right - left) / 2;

//Якщо елемент у середині дорівнює шуканому, повертаємо його індекс
            if (array[mid] == target) {
                return mid;
                //Якщо шукане число більше, шукаємо у правій половині
            } else if (array[mid] < target) {
                left = mid + 1;
                //Інакше шукаємо у лівій половині
            } else {
                right = mid - 1;
            }
        }
//Якщо число не знайдене повертаємо -1
        return -1;
    }
}