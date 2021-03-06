public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("Circle: " + c.x + ", " + c.y + ", " + c.r);
        c.Move(1, 3);
        System.out.println("Circle move: " + c.x + ", " + c.y + ", " + c.r);
        System.out.println("Длина окружности " + c.lenghtCircle());
        System.out.println("Площадь круга " + c.squareCircle());
        System.out.println("Диаметер круга " + c.diameterCircle());

        // метод возвращающий строковое представление состояния класса: тут нужно было вот так?
        System.out.println("Cтроковое представление состояния класса " + c.toString());
    }
}
class Circle {
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус

    // методы с урока
    public Circle(double r) {
        if (r <= 0) {
            throw new RuntimeException("Радиус должен быть положительным!");
        }
        this.r = r;
    }

    public void Move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // метод вычисляющий Длину окружнсти
    public double lenghtCircle() {
        double lenght = Math.PI * 2 * r;
        return lenght;
    }

    // метод вычисляющий площадь круга
    public double squareCircle() {
        double square = Math.PI * r * r;
        return square;
    }

    // метод Диаметер круга
    public double diameterCircle (){
        double diam = 2*r;
        return diam;
    }
    // cтроковое представление состояния класса
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
