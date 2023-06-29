package Seminar_3.HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    /*
    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
     Вывести название каждой планеты и количество его повторений в списке
     */
    public static void main(String[] args) {
        ArrayList<String> planet_list = new ArrayList();
        planet_add(planet_list);
        ArrayList<String> random_planet = new ArrayList();
        planet_random(planet_list, random_planet);
        System.out.println(random_planet + "\n");
        entry(planet_list, random_planet);
    }
    static void planet_add(ArrayList<String> planet_list){
        planet_list.add("Меркурий");
        planet_list.add("Венера");
        planet_list.add("Земля");
        planet_list.add("Марс");
        planet_list.add("Юпитер");
        planet_list.add("Сатурн");
        planet_list.add("Уран");
        planet_list.add("Нептун");
        planet_list.add("Плутон");


    }
    static void planet_random(ArrayList<String> planet_list, ArrayList<String> random_planet){
        for (int i = 0; i < 9; i++){
            double item = Math.random() * planet_list.size();
            random_planet.add(planet_list.get((int)item));
        }
    }
    static void entry(ArrayList<String> planet_list, ArrayList<String> random_planet){
        for (int i = 0; i < planet_list.size(); i++) {
            int col = Collections.frequency(random_planet, planet_list.get(i));
            System.out.println(planet_list.get(i) + " входит в список " + col + " раз");
        }
    }
}
