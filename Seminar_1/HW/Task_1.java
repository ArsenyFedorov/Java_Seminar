package Seminar_1.HW;
import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ввидите число:");
        int user_num = scanner.nextInt();
        System.out.println("Сумма чисел вашего числа:" + sum(user_num));
        System.out.println("Факториал вашего числа:" + multiplication(user_num));
    }

    static int sum(int num) {
        int sum_num = 0;
        for (int i = 1; i <= num; i++) {
            sum_num = sum_num + i;
        }
        return sum_num;
    }

    static int multiplication(int num) {
        int mult = 1;
        for (int i = 1; i <= num; i++) {
            mult = mult * i;
        }
        return mult;
    }
}
