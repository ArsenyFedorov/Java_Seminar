package Seminar_5.HW;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Task_1 {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
     */
    Map<String, LinkedList> phone_dict = new HashMap<>();
    void new_contact(String user_name, String mobile_phone){
        LinkedList<String> phone = new LinkedList<>();
        phone.add(mobile_phone);
        phone_dict.put(user_name,phone);
    }

    void print_phone_book(){
            System.out.println(phone_dict.entrySet());
    }

    void add_phone(String phone, String user_name){
        if(phone_dict.containsKey(user_name)){
            phone_dict.get(user_name).add(phone);
        }else {
            System.out.println("Такого юзера не существует ( ");
        }
    }

    void del_user(String user_name){
        if(phone_dict.containsKey(user_name)){
            phone_dict.remove(user_name);
        }else {
            System.out.println("Такого юзера не существует ( ");
        }
    }

}
