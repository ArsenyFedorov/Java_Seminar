package Seminar_5;

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        String s = "РњРѕСЂРѕР· Рё СЃРѕР»РЅС†Рµ РґРµРЅСЊ С‡СѓРґРµСЃРЅС‹Р№\n" +
                "Р•С‰Рµ С‚С‹ РґСЂРµРјР»РµС€СЊ РґСЂСѓРі РїСЂРµР»РµСЃС‚РЅС‹Р№\n" +
                "РџРѕСЂР° РєСЂР°СЃР°РІРёС†Р° РїСЂРѕСЃРЅРёСЃСЊ.";
        s = s.replace(".", "");
        s = s.replace("\n", " ");
        s = s.replace("  ", " ");
        String[] words = s.split(" ");

        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
    }
}
