/**
 * Работа с массивами
 *
 * @author Mikhail Penyaev
 * @version 2020-05-05
 */

// Сортировка методом пузырька
// Отсортировать массив, заполненный случайными числами, по возрастанию.
// Для сортировки использовать метод "пузырька".
// Вывести на экран массив в исходном и отсортированном виде.
public class MyArrays3 {
    public static void main(String[] args) {
        int[] a1 = new int[20];
        int min = 100;
        int flag = 21;
        
        System.out.println("Array with random integers from 0 to 100:");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = Math.toIntExact(Math.round(Math.random() * 100));
            System.out.print(a1[i]+", ");
        }
        System.out.println();
        System.out.println("Sorting the array in ascending order: ");
        for (int i = 0; i < a1.length; i++) {
            for (int j = i; j < a1.length; j++) {
                if (a1[j] < min) {
                    min = a1[j];
                    flag = j;
                }
            }
            a1[flag] = a1[i];
            a1[i] = min;
            System.out.print(a1[i]+", ");
            min = 100;
        }
    }
}
