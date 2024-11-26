public class Proc6 {
    // Процедура DigitCountSum для вычисления количества цифр и их суммы
    public static void DigitCountSum(int K, int[] C, int[] S) {
        C[0] = 0; // Инициализация количества цифр
        S[0] = 0; // Инициализация суммы цифр

        // Цикл для подсчета количества и суммы цифр
        while (K > 0) {
            S[0] += K % 10; // Добавляем последнюю цифру к сумме
            C[0]++; // Увеличиваем счетчик цифр
            K /= 10; // Убираем последнюю цифру
        }
    }

    public static void main(String[] args) {
        // Пример пяти целых чисел
        int[] numbers = {135, 4789, 23, 456, 98765};

        for (int number : numbers) {
            int[] count = new int[1]; // Массив для количества цифр
            int[] sum = new int[1]; // Массив для суммы цифр

            // Вызов процедуры для текущего числа
            DigitCountSum(number, count, sum);
            System.out.println("Число: " + number + ", Количество цифр: " + count[0] + ", Сумма цифр: " + sum[0]);
        }
    }
}
