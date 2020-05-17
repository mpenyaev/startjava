/**
 * Работа с массивами
 *
 * @author Mikhail Penyaev
 * @version 2020-05-05
 */

// В диапазоне натуральных чисел от 2 до 99 определить,
// сколько из них кратны любому из чисел в диапазоне от 2 до 9.
public class MyArrays2 {
    public static void main(String[] args) {
        int[] ar1 = new int[98];
        int[] ar2 = new int[8];
        int z = 0;

        for (int i = 0; i < ar1.length; i++) {  // заполняем 1-й массив от 2 до 99
            ar1[i] = i+2;
        }
        for (int i = 0; i < ar2.length; i++) {  // заполняем 2-й массив от 2 до 9
            ar2[i] = i+2;
        }
        for (int x: ar2) {
            System.out.print("Делим на "+x+". Делятся: ");
            for (int y: ar1) {
                if ((y % x) == 0) {
                    z++;
                    System.out.print(y+", ");
                }
            }
            System.out.println("Итого, "+z+" чисел");
            z = 0;
        }
    }
}
