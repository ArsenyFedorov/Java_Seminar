package Seminar_1;

// Задана натуральная степень k. Сформировать случайным
//образом список коэффициентов (значения от 0 до 100)
//многочлена многочлен степени k.
//*Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
public class Random_polynomial {
    static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int degree = getRandomNumber(1, 10);
        String term = "";
        int count = getRandomNumber(1, 10);
        for (int i = 0; i < count; i++) {
            int num = getRandomNumber(1, 101);
            int x = getRandomNumber(1, 3);
            if (x == 1) {
                term = term + num;
            } else {
                if (degree == 1) {
                    if (num == 1) {
                        term = term + "x";
                    } else {
                        term = term + num + "*x";
                    }
                } else {
                    if (num == 1) {
                        term = term + "x*" + degree;
                    } else {
                        term = term + num + "*x^" + degree;
                    }
                }
            }
            if (i + 1 < count){
                term = term + " + ";
            }
        }
        System.out.printf(term + " = 0");
    }
}


