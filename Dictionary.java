/*
    =====================================
    @project Algorithms
    @created 06/02/2023    
    @author Bereznev Nikita @CreativeWex
    =====================================
 */

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        Map<String, Integer> wordsAccuracy = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int accuracy = 0;
            for (int j = 0; j < to.length(); j++) {
                if (words[i].contains(Character.toString(to.charAt(j)))) {
                    accuracy++;
                }
            }
            wordsAccuracy.put(words[i], accuracy);
        }
        int max = 0;
        String result = words[0];

        for (Map.Entry entry : wordsAccuracy.entrySet()) {
            if((int)entry.getValue() > max) {
                result = entry.getKey().toString();
                max = (int)entry.getValue();
            } else if((int)entry.getValue() == max
                    && entry.getKey().toString().length() - to.length() < result.length() - to.length()) {
                        result = entry.getKey().toString();
            }
        }
        return result;
    }
}