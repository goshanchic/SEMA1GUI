
public class one {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 999999; i++) {
            int number = i;
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < 3; j++) {
                sum1 += number % 10;
                number /= 10;
            }
            for (int j = 0; j < 3; j++) {
                sum2 += number % 10;
                number /= 10;
            }
            if (sum1 == sum2) {
                count++;
            }
        }
        System.out.println("Количество счастливых билетиков: " + count);
    }
}