public class Dog extends Animal {
    String name; // кличка
    int age;// возраст


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

    void voice() {
        for (int i = 1; i <= age; i++) {
            System.out.println("woof-woof!!!");
        }
    }

}
