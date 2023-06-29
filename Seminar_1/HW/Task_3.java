package Seminar_1.HW;

import com.sun.source.tree.TryTree;

import java.util.Scanner;

// Реализовать простой калькулятор
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ввидите первое значение:");
        int num_1 = scanner.nextInt();
        System.out.printf("Ввидите второе значение:");
        float num_2 = scanner.nextFloat();
        System.out.printf("Ввидите действие:");
        String act = scanner.next();
        switch (act) {
            case "+":
                System.out.println("Сумма чисел:" + (num_1 + num_2));
                break;
            case "-":
                System.out.println("Разность чисел:" + (num_1 - num_2));
                break;
            case "*":
                System.out.println("Произведение чисел:" + (num_1 * num_2));
                break;
            case "/":
                if (num_2 == 0) {
                    System.out.println("На 0 делить нельзя !");
                    break;
                }
                    System.out.println("Частное чисел:" + (num_1 / num_2));
                    break;
            case "%":
                System.out.println("Остаток от деление чисел:" + (num_1 % num_2));
                break;
        }
    }
}


