package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        String s1 = "kids";
        String s2 = "vatz";

        System.out.println(isIsomorphic(s1, s2));
    }

    static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){
                if (c2[i] != map.get(c1[i])){
                    return false;
                }
            } else {
                if (map.containsValue(c2[i])){
                    return false;
                }
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
}
