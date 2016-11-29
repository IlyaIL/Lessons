/**
 * Created by msi-1 on 26.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tuzik",2);
        System.out.println("Я " + dog1 + " года");
        dog1.voice();
        System.out.println();

        Dog dog2 = new Dog("Sharik",2);
        System.out.println("Я " + dog2 + " года");
        dog2.voice();
        System.out.println();

        Cat cat1 = new Cat("Vaska!", 1);
        System.out.println("Я " + cat1 + " года");
        cat1.voice();
        System.out.println();

        Animal animal = new Animal();
        animal.speak();
    }
}


