package Laptop;

import java.sql.SQLOutput;
import java.util.*;

class laptop {
    int ozy;
    String operatingSystem;
    String color;
    int hardDiskCapacity;
    int SSDCapacity;

    @Override
    public String toString() {
        return "ОЗУ:" + ozy + ", Операционная система:" + operatingSystem + ", Цвет:" + color +
                ", Объём ЖД:" + hardDiskCapacity + ", Объём SSD:" + SSDCapacity;
    }

    boolean compare_ozy(String num) {
        return ozy == Integer.parseInt(num);
    }

    boolean compare_operatingSystem(String system) {
        return operatingSystem.equals(system);
    }

    boolean compare_color(String laptopColor) {
        return color.equals(laptopColor);
    }

    boolean compare_hardDiskCapacity(String volume) {
        return hardDiskCapacity == Integer.parseInt(volume);
    }

    boolean compare_SSDCapacity(String volume) {
        return SSDCapacity == Integer.parseInt(volume);
    }
}


class menu {
    public static void main(String[] args) {
        ArrayList<laptop> laptop_list = new ArrayList<>();
        laptop_list.add(new_laptop(8, "mac", "black", 0, 240));
        laptop_list.add(new_laptop(16, "windows", "white", 1, 120));
        laptop_list.add(new_laptop(32, "windows", "black", 1, 240));
        laptop_list.add(new_laptop(64, "linux", "red", 0, 520));
        laptop_menu(laptop_list);
    }

    static laptop new_laptop(int ozy, String operatingSystem, String color, int hardDiskCapacity, int SSDCapacity) {
        laptop new_laptop = new laptop();
        new_laptop.ozy = ozy;
        new_laptop.operatingSystem = operatingSystem;
        new_laptop.color = color;
        new_laptop.hardDiskCapacity = hardDiskCapacity;
        new_laptop.SSDCapacity = SSDCapacity;
        return new_laptop;
    }

    static void laptop_menu(ArrayList<laptop> my_list) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Параметры ноутбуков:");
            System.out.println("""
                    1.ОЗУ
                    2.Операционная система
                    3.Цвет
                    4.Объём ЖД
                    5.Объём SSD
                    6.Выбрать по всем параметрам
                    7.Прекратить поиск""");
            System.out.println("Выберете параметр по которому будете выбирать:");
            int user_num = scanner.nextInt();
            if (user_num > 7 || user_num < 1) {
                System.out.println("Ты по моему перепутал!!!");
            } else {
                switch (user_num) {
                    case 1 -> searchOzy(my_list);
                    case 2 -> searchOperatingSystem(my_list);
                    case 3 -> searchColor(my_list);
                    case 4 -> searchHardDiskCapacity(my_list);
                    case 5 -> searchSSDCapacity(my_list);
                    case 6 -> searchLaptop(my_list);
                    case 7 -> flag = false;
                }
            }
        }
    }

    static void searchOzy(ArrayList<laptop> my_list) {
        System.out.println("Параметры ОЗУ:");
        for (int i = 0; i < my_list.size(); i++) {
            System.out.println((i + 1) + ". " + my_list.get(i).ozy + " гб");
        }
        System.out.println("Выберете цифру параметра который вас устроит:");
        Scanner scanner = new Scanner(System.in);
        int ozy = scanner.nextInt();
        if (ozy < 1 || ozy > my_list.size()) {
            System.out.println("Ты по моему перепутал!!!");
        } else {
            System.out.println("Вам подходит:");
            System.out.println(my_list.get(ozy - 1).toString());
        }
    }

    static void searchOperatingSystem(ArrayList<laptop> my_list) {
        System.out.println("Операционные системы:");
        for (int i = 0; i < my_list.size(); i++) {
            System.out.println((i + 1) + ". " + my_list.get(i).operatingSystem);
        }
        System.out.println("Выберете цифру параметра который вас устроит:");
        Scanner scanner = new Scanner(System.in);
        int ozy = scanner.nextInt();
        if (ozy < 1 || ozy > my_list.size()) {
            System.out.println("Ты по моему перепутал!!!");
        } else {
            System.out.println("Вам подходит:");
            System.out.println(my_list.get(ozy - 1).toString());
        }
    }

    static void searchColor(ArrayList<laptop> my_list) {
        System.out.println("Цвета:");
        for (int i = 0; i < my_list.size(); i++) {
            System.out.println((i + 1) + ". " + my_list.get(i).color);
        }
        System.out.println("Выберете цифру параметра который вас устроит:");
        Scanner scanner = new Scanner(System.in);
        int ozy = scanner.nextInt();
        if (ozy < 1 || ozy > my_list.size()) {
            System.out.println("Ты по моему перепутал!!!");
        } else {
            System.out.println("Вам подходит:");
            System.out.println(my_list.get(ozy - 1).toString());
        }
    }

    static void searchHardDiskCapacity(ArrayList<laptop> my_list) {
        System.out.println("Объём ЖД:");
        for (int i = 0; i < my_list.size(); i++) {
            System.out.println((i + 1) + ". " + my_list.get(i).hardDiskCapacity + "тб");
        }
        System.out.println("Выберете цифру параметра который вас устроит:");
        Scanner scanner = new Scanner(System.in);
        int ozy = scanner.nextInt();
        if (ozy < 1 || ozy > my_list.size()) {
            System.out.println("Ты по моему перепутал!!!");
        } else {
            System.out.println("Вам подходит:");
            System.out.println(my_list.get(ozy - 1).toString());
        }
    }

    static void searchSSDCapacity(ArrayList<laptop> my_list) {
        System.out.println("Объём SSD:");
        for (int i = 0; i < my_list.size(); i++) {
            System.out.println((i + 1) + ". " + my_list.get(i).SSDCapacity + "гб");
        }
        System.out.println("Выберете цифру параметра который вас устроит:");
        Scanner scanner = new Scanner(System.in);
        int ozy = scanner.nextInt();
        if (ozy < 1 || ozy > my_list.size()) {
            System.out.println("Ты по моему перепутал!!!");
        } else {
            System.out.println("Вам подходит:");
            System.out.println(my_list.get(ozy - 1).toString());
        }
    }

    static void searchLaptop(ArrayList<laptop> my_list) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        System.out.println("Ввидите нужное вам количество ОЗУ");
        System.out.println("(Если этот параметр не имеет значения просто нажмите Enter)");
        String ozy = scanner.nextLine();
        if (!ozy.equals("")) {
            strList.add(ozy);
        }
        System.out.println("Ввидите Желаемую операционную систему");
        System.out.println("(Если этот параметр не имеет значения просто нажмите Enter)");
        String operatingSystem = scanner.nextLine().toLowerCase();
        if (!operatingSystem.equals("")) {
            strList.add(operatingSystem);
        }
        System.out.println("Ввидите Желаемый цвет");
        System.out.println("(Если этот параметр не имеет значения просто нажмите Enter)");
        String color = scanner.nextLine().toLowerCase();
        if (!color.equals("")) {
            strList.add(color);
        }
        System.out.println("Ввидите Желаемый объём ЖД");
        System.out.println("(Если этот параметр не имеет значения просто нажмите Enter)");
        String hardDiskCapacity = scanner.nextLine();
        if (!hardDiskCapacity.equals("")) {
            strList.add(hardDiskCapacity);
        }
        System.out.println("Ввидите Желаемый объём SSD");
        System.out.println("(Если этот параметр не имеет значения просто нажмите Enter)");
        String SSDCapacity = scanner.nextLine();
        if (!SSDCapacity.equals("")) {
            strList.add(SSDCapacity);
        }
        ArrayList<Integer> colList = new ArrayList<>();
        System.out.println("Вот что нашлось по вашему запросу:");
        for (laptop value : my_list) {
            int col = 0;
            for (String s : strList) {
                if (Character.isDigit(s.charAt(0)) && value.compare_ozy(s)) {
                    ++col;
                }
                if (value.compare_operatingSystem(s)) {
                    ++col;
                }
                if (value.compare_color(s)) {
                    ++col;
                }
                if (Character.isDigit(s.charAt(0)) && value.compare_hardDiskCapacity(s)) {
                    ++col;
                }
                if (Character.isDigit(s.charAt(0)) && value.compare_SSDCapacity(s)) {
                    ++col;
                }
            }
            colList.add(col);
        }
        int max = 0;
        for (Integer integer : colList) {
            if (integer > max) {
                max = integer;
            }
        }
        for (int i = 0; i < colList.size(); i++) {
            if (max == 0) {
                System.out.println("По вашему запросу ничего не найдено (");
                break;
            }
            if (colList.get(i) == max) {
                System.out.println(my_list.get(i).toString());
            }
        }
    }
}
