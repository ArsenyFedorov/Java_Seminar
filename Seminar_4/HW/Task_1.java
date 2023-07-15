package Seminar_4.HW;

import java.util.LinkedList;

public class Task_1 {
    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     Постараться не обращаться к листу по индексам.
     */
    public static void main(String[] args) {
        LinkedList<String > my_list = new LinkedList<>();
        my_list.add("Домом можно называть то место, где о тебе кто-то думает");
        my_list.add("Никогда не спорь с идиотом. Сначала он опустит тебя до своего уровня, а потом задавит опытом");
        my_list.add("Манера крутит мир");
        my_list.add("Я обожаю гулять под дождём потому что только тогда не видно что я плачу");
        System.out.println(my_list);
        my_list = reverse(my_list);
        System.out.println(my_list);
    }
    public static LinkedList<String> reverse(LinkedList<String> user_list){
        LinkedList<String > new_list = new LinkedList<>();
        while (!user_list.isEmpty()){
            new_list.add(user_list.removeLast());
        }
        return new_list;
    }
}
