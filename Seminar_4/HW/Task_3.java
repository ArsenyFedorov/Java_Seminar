package Seminar_4.HW;

import java.util.LinkedList;

public class Task_3 {
    /*
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
     */
    public static void main(String[] args) {
        LinkedList<Integer> my_list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            my_list.add(i);
        }
        System.out.println(sum(my_list));
        System.out.println(my_list);
    }
    public static Integer sum(LinkedList<Integer> user_list){
        int sum = 0;
        for (int i = 0; i < user_list.size(); i++) {
            sum += user_list.get(i);
        }
        return sum;
    }
}
