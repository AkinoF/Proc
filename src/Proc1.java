import java.util.*;
public class Proc1 {
    // Процедура PowerA3 для вычисления куба числа A
    public static void PowerA3(double A, double[] B) {
        B[0] = Math.pow(A, 3); // В данном случае возвращаем куб A через изменяемый параметр B
    }

    // Метод для вычисления суммы кубов целых чисел на промежутке от x до y
    public static double sumOfCubes(int x, int y) {
        double sum = 0.0;
        for (int i = x; i <= y; i++) {
            sum += Math.pow(i, 3); // Суммируем кубы чисел от x до y
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        double A = scanner.nextDouble(); // Считываем число A
        double[] B = new double[1]; // Массив для возврата результата
        PowerA3(A, B);
        System.out.println("Куб числа " + A + " равен " + B[0]);

        System.out.print("Введите начало диапазона x: ");
        int x = scanner.nextInt(); // Считываем x
        System.out.print("Введите конец диапазона y: ");
        int y = scanner.nextInt(); // Считываем y
        double sum = sumOfCubes(x, y);
        System.out.println("Сумма кубов от " + x + " до " + y + " равна " + sum);
    }
}
