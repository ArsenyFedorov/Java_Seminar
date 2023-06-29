package Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_3 {
    /*
    Создать список типа ArrayList
    Поместить в него как строки, так и целые числа.
    Пройти по списку, найти и удалить целые числа.
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(4);
        list.add(2);
        list.add('%');
        list.add(5);
        list.add(7);
        list.add("10asf");
        list.add(null);
        list.add(4.5);
        removeInt(list);
        System.out.println(list);
    }

    static void removeInt(List list) {
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
    }

    static void removeInt2(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof Integer){
                iterator.remove();
            }
        }
    }
}

