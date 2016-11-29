public class Cat extends Animal {
    String name; // кличка
    int age;// возраст


    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString (){
        return name +", " + age;
    }

     void voice() {
        for (int i = 1; i <= age; i++) {
            System.out.println("Meow!!!");
        }
    }

}
