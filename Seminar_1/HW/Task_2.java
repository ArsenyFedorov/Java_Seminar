package Seminar_1.HW;
// Вывести все простые числа от 1 до 1000
public class Task_2 {
    public static void main(String[] args) {
        prime();
    }
    static void prime(){
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
}
