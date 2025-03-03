public class theere {
    public static void main(String[] args) {
        double x0 = -1; // Начальное приближение
        double epsilon = 1e-6; // Точность
        double x = x0;
        double fx = Math.pow(x, 3) + x + 1;

        while (Math.abs(fx) > epsilon) {
            double fpx = 3 * Math.pow(x, 2) + 1; // Производная функции
            x = x - fx / fpx;
            fx = Math.pow(x, 3) + x + 1;
        }

        System.out.println("Корень функции: " + x);
    }
}