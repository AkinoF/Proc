public class Proc19 {
    // Функция для нахождения площади кольца
    public static double RingS(double R1, double R2) {
        if (R1 <= R2) {
            throw new IllegalArgumentException("R1 должен быть больше R2");
        }

        double pi = 3.14; // Значение π
        double areaOuterCircle = pi * Math.pow(R1, 2); // Площадь внешнего круга
        double areaInnerCircle = pi * Math.pow(R2, 2); // Площадь внутреннего круга

        return areaOuterCircle - areaInnerCircle; // Площадь кольца
    }

    public static void main(String[] args) {
        // Задание радиусов для трех колец
        double[][] rings = {
                {5.0, 3.0}, // Первый набор радиусов: (R1, R2)
                {7.0, 4.0}, // Второй набор радиусов
                {10.0, 6.0} // Третий набор радиусов
        };

        // Вычисление и вывод площадей колец
        for (int i = 0; i < rings.length; i++) {
            double R1 = rings[i][0];
            double R2 = rings[i][1];
            double area = RingS(R1, R2);
            System.out.printf("Площадь кольца с радиусами R1 = %.2f и R2 = %.2f: %.2f%n", R1, R2, area);
        }
    }
}
