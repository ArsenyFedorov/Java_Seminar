package Seminar_2;
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//Ответ: c1c2c1…c2 (всего N символов)
public class Task_1{
    public static void main(String[] args) {
        int num = 10;
        char one = 'a';
        char two = 'd';
        System.out.println(drivel(num, one, two));
    }
    static String drivel(int num, char one, char two){
        StringBuilder my_str = new StringBuilder();
        for (int i = 0; i < num / 2; i++) {
            my_str.append(one);
            my_str.append(two);
        }
        return my_str.toString();
    }
}
