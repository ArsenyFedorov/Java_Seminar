package Seminar_3.HW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task_2 {
    /*
    Задан целочисленный список ArrayList. Найти минимальное,
    максимальное и среднее арифметическое из этого списка. Collections.max()
     */
    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList();
        writeIn(my_list);
        max_num(my_list);
        min_num(my_list);
        float mean_num = mean(my_list);
        System.out.println("Среднее арифметическое вашего списка:" + mean_num);
    }
    static void writeIn(ArrayList<Integer> user_list){
        // Эта функция просто засовывает сто чисел в список
        for (int i = 0; i < 100; i++) {
            user_list.add(i);
        }
    }
    static void max_num(ArrayList<Integer> user_list){
        System.out.println("Максимальное число в вашем списке:" + Collections.max(user_list));
    }
    static void min_num(ArrayList<Integer> user_list){
        System.out.println("Минимальным числом в вашем списке:" + Collections.min(user_list));
    }
    static float mean(ArrayList<Integer> user_list){
        int sum = 0;
        for (int i = 0; i < user_list.size(); i++) {
            sum += user_list.get(i);
        }
        float mean_num = sum / user_list.size();
        return mean_num;
    }
}
