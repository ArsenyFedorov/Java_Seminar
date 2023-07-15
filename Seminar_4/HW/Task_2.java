package Seminar_4.HW;

import java.util.LinkedList;
import java.util.Objects;

public class Task_2 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
     enqueue() - помещает элемент в конец очереди,
     dequeue() - возвращает первый элемент из очереди и удаляет его,
     first() - возвращает первый элемент из очереди, не удаляя.
     */
    LinkedList<String > deque = new LinkedList<>();
    void enqueue(String  item){
        deque.add(0, item);
    }
    String dequeue(){
        if(deque.isEmpty()){
            return "Список пуст";
        }else {
            String item = deque.get(deque.size() - 1);
            deque.remove(deque.size() - 1);
            return item;
        }
    }
    String  first(){
        if(deque.isEmpty()){
            return "Очередь пуста";
        }else {
            return deque.get(deque.size() - 1);
        }
    }
    void print(){
        System.out.println(deque);
    }

    public static void main(String[] args) {
        Task_2 my_list = new Task_2();
        my_list.enqueue("Heloo");
        my_list.print();
        System.out.println(my_list.dequeue());
        my_list.print();
    }
}
