package Seminar_3.HW;

import java.util.ArrayList;

public class Task_1 {
    /*
    Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList();
        writeIn(my_list);
        System.out.println(my_list);
        remove_even(my_list);
        System.out.println(my_list);
    }
    static void writeIn(ArrayList<Integer> user_list){
        // Эта функция просто засовывает сто чисел в список
        for (int i = 0; i < 100; i++) {
            user_list.add(i);
        }
    }
    static void remove_even(ArrayList<Integer> user_list){
        // Эта функция удаляет чётные числа (что и так очевидно)
        for (int i = 0; i < user_list.size(); i++) {
            if(user_list.get(i) % 2 != 0){
                user_list.remove(i);
                i--;
            }
        }
    }
}
