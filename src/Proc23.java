public class Proc23 {
    // Функция для определения номера координатной четверти
    public static int Quarter(double x, double y) {
        if (x > 0 && y > 0) {
            return 1; // Первая четверть
        } else if (x < 0 && y > 0) {
            return 2; // Вторая четверть
        } else if (x < 0 && y < 0) {
            return 3; // Третья четверть
        } else if (x > 0 && y < 0) {
            return 4; // Четвертая четверть
        } else {
            throw new IllegalArgumentException("Координаты должны быть ненулевыми."); // Проверка на ненулевость
        }
    }

    public static void main(String[] args) {
        // Задание трех точек с ненулевыми координатами
        double[][] points = {
                {3.0, 4.0},   // Первая четверть
                {-2.0, 5.0},  // Вторая четверть
                {-6.0, -3.0}  // Третья четверть
        };

        // Вычисление и вывод номеров координатных четвертей для каждой точки
        for (int i = 0; i < points.length; i++) {
            double x = points[i][0];
            double y = points[i][1];
            int quarterNumber = Quarter(x, y);
            System.out.printf("Точка (%.2f, %.2f) находится в %d-й координатной четверти.%n", x, y, quarterNumber);
        }
    }
}
