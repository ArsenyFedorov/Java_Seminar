package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        addNote(map,"123456", "РРІР°РЅРѕРІ");
        addNote(map,"321456", "Р’Р°СЃРёР»СЊРµРІ");
        addNote(map,"234561", "РџРµС‚СЂРѕРІР°");
        addNote(map,"234432", "РРІР°РЅРѕРІ");
        addNote(map,"654321", "РџРµС‚СЂРѕРІР°");
        addNote(map,"345678", "РРІР°РЅРѕРІ");

        System.out.println(findByName(map,"РРІР°РЅРѕРІ"));
    }

    static void addNote(Map<String, String> map, String num, String name){
        map.put(num, name);
    }

    static String findByName(Map<String, String> map, String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){
            String num = entry.getKey();
            String name = entry.getValue();
            if (name.equalsIgnoreCase(lastName)){
                stringBuilder.append(num);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
