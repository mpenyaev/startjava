public class CatTest {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Rad", "rad", 5);
        Cat cat2 = new Cat();

        cat2.setName("Barsik");
        cat2.setColor("grey");
        cat2.setAge(3);

        System.out.println(cat1);
        System.out.println(cat2);
    }
}
