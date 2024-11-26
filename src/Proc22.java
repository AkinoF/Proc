public class Proc22 {
    // Функция для выполнения арифметических операций
    public static double Calc(double A, double B, int Op) {
        switch (Op) {
            case 1: // Вычитание
                return A - B;
            case 2: // Умножение
                return A * B;
            case 3: // Деление
                return A / B;
            default: // Сложение
                return A + B;
        }
    }

    public static void main(String[] args) {
        // Данные A и B
        double A = 10.5;
        double B = 2.5;

        // Операции
        int N1 = 1; // Вычитание
        int N2 = 2; // Умножение
        int N3 = 3; // Деление

        // Выполнение операций и вывод результатов
        double result1 = Calc(A, B, N1);
        double result2 = Calc(A, B, N2);
        double result3 = Calc(A, B, N3);

        System.out.printf("Результат (A - B): %.2f%n", result1);
        System.out.printf("Результат (A * B): %.2f%n", result2);
        System.out.printf("Результат (A / B): %.2f%n", result3);
        System.out.printf("Результат (A + B): %.2f%n", Calc(A, B, 0)); // Сложение по умолчанию
    }
}
