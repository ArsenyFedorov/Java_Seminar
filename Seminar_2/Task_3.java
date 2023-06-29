package Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//который запишет эту строку в простой текстовый файл, обработайте исключения.
public class Task_3 {
    public static void main(String[] args) {
        int n = 100;
        String s = "Boom";
        String s1 = duplicate(s, n);
        String filePath = "test.txt";
        writeToFile(s1, filePath);
        System.out.println(readInFile(filePath));
    }

    static String readInFile(String filePath) {
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static void writeToFile(String s1, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(s1);
            writer.write("\n");
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static String duplicate(String s, int n) {
        return s.repeat(n);
    }
}
