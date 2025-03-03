
public class two {
    public static void main(String[] args) {
        double a = 0; // Начало отрезка
        double b = 1; // Конец отрезка
        int n = 1000; // Количество разбиений
        double h = (b - a) / n;
        double area = 0;

        for (int i = 0; i < n; i++) {
            double x = a + i * h;
            double fx = Math.pow(x, 3) + x + 1;
            area += fx * h;
        }

        System.out.println("Площадь под графиком: " + area);
    }
}