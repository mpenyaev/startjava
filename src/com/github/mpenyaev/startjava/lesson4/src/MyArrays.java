import java.util.ArrayList;

/**
 * Работа с массивами
 *
 * @author Mikhail Penyaev
 * @version 2020-05-05
 */

public class MyArrays {
    public static void main(String[] args) {
        int[] a = {10,0,-3,-5,2,-8,5,7,15,-1};
        int[] b = new int[a.length];
        float middle = 0f;
        int min1 = 1000;
        int min2 = 1000;
        int flag1 = 1000;

        System.out.print("We have the Array: ");
        for (int x: a) {
            System.out.print(x + ", ");
        }
        System.out.println();
        for (int x: a) {
            middle += x;
        }
        middle = middle / a.length;
        System.out.println("Среднее элементов массива: "+middle);
        System.out.print("Выводим элементы больше среднего: ");
        for (int x: a) {
            if (x > middle) {
                System.out.print(x+", ");
            }
        }
        System.out.println();

        // 2 minimal elements of the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min1) {
                flag1 = i;
                min1 = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i != flag1 & a[i] < min2) {
                min2 = a[i];
            }
        }
        System.out.print("Выводим 2 наименьших элемента массива: min1 = "+min1+", min2 = "+min2);
        System.out.println();

        // remove all elements belonging to interval (min, max)
        // set the interval
        int min = -5;
        int max = 5;
        int j = 0;
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        System.out.print("Обнуляем все элементы, принадлежащие интервалу: ["+min+", "+max+"]: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min | a[i] > max) {
                b[j] = a[i];
                j++;
                System.out.print(a[i] + ", ");
                list1.add(a[i]);
            } else {
                System.out.print('0' + ", ");
            }
        }
        System.out.println();
        System.out.println("То же через ArrayList (формируем): "+list1);
        System.out.print("Сдвигаем: ");
        for (int x: b) {
            System.out.print(x + ", ");
        }
        list2 = list1;
        for (int i = list1.size(); i < a.length; i++){
            list1.add(0);
        }
        System.out.println();
        System.out.println("То же через ArrayList (добавляем): "+list1);
        // Сумма модулей элементов массива, расположенных после первого отрицательного
        int summ1 = 0;
        System.out.print("Исходный массив ");
                for (int x: a) {
            System.out.print(x + ", ");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                for (int k = i + 1; k < a.length; k++) {
                    summ1 = summ1 + Math.abs(a[k]);
                }
                break;
            }
        }
        System.out.println();
        System.out.println("Сумма модулей элементов массива, расположенных после первого отрицательного: "+summ1);

        // Номер минимального по модулю элемента массива
        min = 1000;
        flag1 = 1000;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i]) < min) {
                min = Math.abs(a[i]);
                flag1 = i;
            }
        }
        System.out.println("Номер минимального по модулю элемента массива: "+flag1);

        // Найти сумму элементов между минимальным и максимальным элементами массива
        int flag2 = 1000;
        min = 1000;
        max = -1000;
        summ1 = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
                flag1 = i;
            }
            if (a[i] > max){
                max = a[i];
                flag2 = i;
            }
        }
        if (flag2 > flag1) {
            for (int i = flag1 + 1; i < flag2; i++) {
                summ1 = summ1 + a[i];
                }
        } else {
            for (int i = flag2 + 1; i < flag1; i++){
                summ1 = summ1 + a[i];
            }
        }
        System.out.println("Минимальный элемент массива: "+min+" номер "+flag1+"; максимальный: "+max+" номер "+flag2);
        System.out.print("Cуммa элементов между минимальным и максимальным элементами массива: "+summ1);

        // Сдвинуть элементы массива в указанном направлении (влево или вправо) и на указанное число шагов.
        // Освободившиеся ячейки заполнить нулями.
        System.out.println();
        int shift1 = list1.size();
        for (int i = 0; i < shift1; i++){ // стираем ArrayList list1
            list1.remove(0);
        }
        for (int x: a){ // пишем в ArrayList list1 массив a
            list1.add(x);
        }
        System.out.println("Исходный массив / ArrayList: "+list1);
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // сохраняем исходный массив в Array b
        }
        shift1 = -4;
        if (shift1 <0){
            for (int i = 0; i > shift1; i--){
                for (int k = 0; k < a.length -1; k++){
                    a[k] = a[k + 1];
                }
                a[a.length - 1] = 0;
                list1.remove(0);
                list1.add(list1.size(), 0);
                System.out.print("двигаем массив влево на 1: ");
                for (int l = 0; l < a.length; l++){
                    System.out.print(a[l]+", ");
                }
                System.out.print("   то же через ArrayList: "+list1);
                System.out.println();
            }
        } else {
            for (int i = 0; i < shift1; i++) {
                for (int k = a.length - 1; k > 0; k--) {
                    a[k] = a[k - 1];
                }
                a[0] = 0;
                list1.remove(list1.size() - 1);
                list1.add(0, 0);
                System.out.print("двигаем массив вправо на 1: ");
                for (int l = 0; l < a.length; l++) {
                    System.out.print(a[l] + ", ");
                }
                System.out.print("   то же через ArrayList: "+list1);
                System.out.println();
            }
        }

        // Реверс массива
        //Переставить элементы заданного массива в обратном порядке
        shift1 = list1.size();
        for (int i = 0; i < shift1; i++){ // стираем ArrayList list1
            list1.remove(0);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i]; // восстанавливаем исходный массив а
        }
        for (int x: a){ // пишем в ArrayList list1 массив a
            list1.add(x);
        }
        System.out.println("Исходный массив / ArrayList: "+list1);
        for (int i = shift1 - 1; i >= 0; i--) {
            list1.add(list1.get(i));
            list1.remove(i);
        }
        System.out.println("Перевернули ArrayList: "+list1);
        System.out.print("Перевернули массив а: ");
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
            System.out.print(b[i]+", ");
        }
    }
}
