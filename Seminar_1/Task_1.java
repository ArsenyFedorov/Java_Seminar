package Seminar_1;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;
//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Как вас зовут:");
        String name = scan.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if(5 <= hour && hour < 12){
            System.out.println("Доброе утро," + name + "!");
        } else if (12 <= hour && hour < 18) {
            System.out.println("Добрый день," + name + "!");
        } else if (18 <= hour && hour < 23) {
            System.out.println("Добрый вечер," + name + "!");
        } else {
            System.out.println("Доброй ночи," + name + "!");
        }
    }
}
