package Seminar_3;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadLocalRandom.current().nextInt(0, 11));
        }
        list.sort(null);
        System.out.println(list);
    }
}
