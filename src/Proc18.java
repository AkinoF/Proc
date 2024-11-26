public class Proc18 {

        // Процедура ShiftRight3 для правого циклического сдвига
        public static void ShiftRight3(double[] A, double[] B, double[] C) {
            double temp = A[0]; // Сохранение значения A
            A[0] = C[0]; // A получает значение C
            C[0] = B[0]; // C получает значение B
            B[0] = temp; // B получает значение A (сохраненное в temp)
        }

        public static void main(String[] args) {
            double[] set1 = {1.0, 2.0, 3.0}; // Первый набор чисел
            double[] set2 = {4.0, 5.0, 6.0}; // Второй набор чисел

            // Вывод исходных значений
            System.out.println("Исходный набор 1: " + set1[0] + ", " + set1[1] + ", " + set1[2]);
            System.out.println("Исходный набор 2: " + set2[0] + ", " + set2[1] + ", " + set2[2]);

            ShiftRight3(set1, set1, set1); // Правый циклический сдвиг для первого набора
            ShiftRight3(set2, set2, set2); // Правый циклический сдвиг для второго набора

            // Вывод измененных значений
            System.out.println("После сдвига набор 1: " + set1[0] + ", " + set1[1] + ", " + set1[2]);
            System.out.println("После сдвига набор 2: " + set2[0] + ", " + set2[1] + ", " + set2[2]);
        }
    }
