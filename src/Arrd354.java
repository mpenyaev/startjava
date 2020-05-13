import java.util.Random;

public class Arrd354 {
    public static void main(String[] args) {
        System.out.println("Hellow, World!");
        Random a = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+a.nextInt(10));
        }
    }
}
