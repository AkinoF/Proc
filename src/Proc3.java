public class Proc3 {
    // Процедура Mean для вычисления среднего арифметического и геометрического
    public static void Mean(double X, double Y, double[] AMean, double[] GMean) {
        AMean[0] = (X + Y) / 2; // Вычисление среднего арифметического
        GMean[0] = Math.sqrt(X * Y); // Вычисление среднего геометрического
    }

    public static void main(String[] args) {
        double A = 4.0; // Пример числа A
        double B = 9.0; // Пример числа B
        double C = 16.0; // Пример числа C
        double D = 25.0; // Пример числа D

        double[] AMean = new double[1]; // Массив для выхода AMean
        double[] GMean = new double[1]; // Массив для выхода GMean

        Mean(A, B, AMean, GMean);
        System.out.println("Среднее арифметическое (A, B): " + AMean[0]);
        System.out.println("Среднее геометрическое (A, B): " + GMean[0]);

        Mean(A, C, AMean, GMean);
        System.out.println("Среднее арифметическое (A, C): " + AMean[0]);
        System.out.println("Среднее геометрическое (A, C): " + GMean[0]);

        Mean(A, D, AMean, GMean);
        System.out.println("Среднее арифметическое (A, D): " + AMean[0]);
        System.out.println("Среднее геометрическое (A, D): " + GMean[0]);
    }
}
